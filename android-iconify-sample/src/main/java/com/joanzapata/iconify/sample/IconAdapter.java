package com.joanzapata.iconify.sample;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.joanzapata.iconify.Icon;
import com.joanzapata.iconify.sample.databinding.ItemIconBinding;

public class IconAdapter extends RecyclerView.Adapter<IconAdapter.ViewHolder> {

    private final Icon[] icons;

    public IconAdapter(Icon[] icons) {
        this.icons = icons;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_icon, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        Icon icon = icons[position];
        viewHolder.binding.icon.setText("{" + icon.key() + "}");
        viewHolder.binding.name.setText(icon.key());
    }

    @Override
    public int getItemCount() {
        return icons.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ItemIconBinding binding;

        public ViewHolder(View itemView) {
            super(itemView);
            binding = ItemIconBinding.bind(itemView);
        }
    }
}

package com.edgardeng.appcompat.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.edgardeng.appcompat.R;

import java.util.List;

/**
 * Created by dengxixi on 2018/8/7.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> implements View.OnClickListener{
    private List<String> list;

    public RecyclerViewAdapter(List<String> list) {
        this.list = list;
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview, parent, false);

        RecyclerViewAdapter.ViewHolder viewHolder = new RecyclerViewAdapter.ViewHolder(view);
        view.setOnClickListener(this);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {
        holder.itemView.setTag(position);
        holder.title.setText(list.get(position));
        holder.label.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public void addItem(int index, String s) {
        list.add(index, s);
        notifyItemInserted(index);
    }

    public void deleteItem(int index) {
        list.remove(index);
        notifyItemRemoved(index);
    }

        class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView label;

        ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.item_title);
            label = itemView.findViewById(R.id.item_label);
        }
    }



    private OnItemClickListener mItemClickListener;

    // click
    public interface OnItemClickListener{
        void onItemClick(int position);
    }
    @Override
    public void onClick(View v) {
        if (mItemClickListener!=null){
            mItemClickListener.onItemClick((Integer) v.getTag());
        }
    }
    public void setItemClickListener(OnItemClickListener itemClickListener) {
        mItemClickListener = itemClickListener;
    }



}

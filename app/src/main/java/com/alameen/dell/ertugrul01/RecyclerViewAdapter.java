package com.alameen.dell.ertugrul01;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

import static com.alameen.dell.ertugrul01.MainActivity.counter;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    public interface ClickListener {

        void onPositionClicked(int position);

        void onLongClicked(int position);
    }

    private ClickListener listener;
    private Context mContext;
    private List<EventClass> mData;

    public ClickListener getListener() {
        return listener;
    }

    public void setListener(ClickListener listener) {
        this.listener = listener;
    }

    int i = 1;

    public RecyclerViewAdapter(Context mContext, List<EventClass> mData) {
        this.mContext = mContext;
        this.mData = mData;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_life, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.tv_dish_title.setText(mData.get(position).getLifeEventName());
        holder.dish_cat_tv.setText(mData.get(position).getLifeEventDesc());
        holder.img_dish_thumbnail.setImageResource(mData.get(position).getThumbnail());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                counter++;
                MainActivity.ShowAd();

                Intent intent = new Intent(mContext, EventDetailActivity.class);

                Bundle dataBundle = new Bundle();
                dataBundle.putString("topic", mData.get(position).getLifeEventName());
                //dataBundle.putString("Details",mData.get(position).getLifeEventDesc());
                //dataBundle.putInt("Thumbnail",mData.get(position).getThumbnail());

                intent.putExtras(dataBundle);
                mContext.startActivity(intent);


            }
        });
    }

    public void UpdateList(List<EventClass> newList1) {
        mData = new ArrayList<>();
        mData.addAll(newList1);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

        TextView tv_dish_title;
        TextView dish_cat_tv;
        ImageView img_dish_thumbnail;
        int i;
        private WeakReference<ClickListener> listenerRef;

        CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);

            listenerRef = new WeakReference<>(listener);
            tv_dish_title = (TextView) itemView.findViewById(R.id.dish_id);
            img_dish_thumbnail = (ImageView) itemView.findViewById(R.id.img_dish_id);
            dish_cat_tv = (TextView) itemView.findViewById(R.id.dish_cat_tv);
            cardView = (CardView) itemView.findViewById(R.id.cardview_dishes_id);
        }

        @Override
        public void onClick(View v) {
        }

        @Override
        public boolean onLongClick(View v) {
            return false;
        }
    }
}

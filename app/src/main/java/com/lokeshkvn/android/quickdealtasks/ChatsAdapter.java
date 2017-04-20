package com.lokeshkvn.android.quickdealtasks;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static com.lokeshkvn.android.quickdealtasks.R.id;
import static com.lokeshkvn.android.quickdealtasks.R.layout;

/**
 * Created by DELL PC on 20-04-2017.
 */

public class ChatsAdapter extends RecyclerView.Adapter<ChatsAdapter.viewHolder> {

    private Context mContext;
    private List<ChatsModel> chatsList;


    public ChatsAdapter(Context mContext, List<ChatsModel> chatsList) {
        this.mContext = mContext;
        this.chatsList = chatsList;
    }

    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(layout.chat_cardview, parent, false);

        return new viewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ChatsAdapter.viewHolder viewHolder, int i) {

        ChatsModel chatsModel = chatsList.get(i);
        viewHolder.nameView.setText(chatsModel.getName());
        viewHolder.timeView.setText(chatsModel.getTime());
        viewHolder.messageView.setText(chatsModel.getMessage());
        if (!chatsModel.isUnread()) {
            viewHolder.unreadCountView.setVisibility(View.GONE);
        } else {
            viewHolder.unreadCountView.setText(chatsModel.getUnread_count());
        }

        if (chatsModel.isUnread()) {
            viewHolder.nameView.setTextColor(Color.parseColor("#ffc94c"));
        }

        if (chatsModel.isDeal_done()) {
            viewHolder.imageView.setColorFilter(Color.rgb(255, 201, 76));
        }


    }

    @Override
    public int getItemCount() {
        return chatsList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        public TextView nameView, messageView, timeView, unreadCountView;
        public ImageView imageView;

        public viewHolder(View view) {
            super(view);
            nameView = (TextView) view.findViewById(id.name_view);
            messageView = (TextView) view.findViewById(id.message_view);
            timeView = (TextView) view.findViewById(id.time_view);
            unreadCountView = (TextView) view.findViewById(id.count_view);
            imageView = (ImageView) view.findViewById(id.deal);
        }


    }


}

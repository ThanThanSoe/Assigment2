package com.padcmyanmar.padc9.padc9adapterbasedviewwithdelegationtts.View.holders;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.padcmyanmar.padc9.padc9adapterbasedviewwithdelegationtts.delegates.EventItemDelegate;

public class EventItemViewHolder extends RecyclerView.ViewHolder{
    private EventItemDelegate mEventItemDelegate;


    public EventItemViewHolder(@NonNull View itemView, EventItemDelegate delegate) {
        super(itemView);
        mEventItemDelegate = delegate;
        itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                mEventItemDelegate.onTapEventItem();
            }
        });
    }
}

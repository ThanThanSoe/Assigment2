package com.padcmyanmar.padc9.padc9adapterbasedviewwithdelegationtts.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.padcmyanmar.padc9.padc9adapterbasedviewwithdelegationtts.R;
import com.padcmyanmar.padc9.padc9adapterbasedviewwithdelegationtts.View.holders.EventItemViewHolder;
import com.padcmyanmar.padc9.padc9adapterbasedviewwithdelegationtts.delegates.EventItemDelegate;

public class EventListAdapter extends RecyclerView.Adapter {
    private EventItemDelegate mEventItemDelegate;

    public EventListAdapter(EventItemDelegate mEventItemDelegate) {
        this.mEventItemDelegate = mEventItemDelegate;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.car_item_list, parent,false );
        return new EventItemViewHolder(itemView, mEventItemDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}

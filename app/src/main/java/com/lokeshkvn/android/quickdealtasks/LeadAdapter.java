package com.lokeshkvn.android.quickdealtasks;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by DELL PC on 20-04-2017.
 */

public class LeadAdapter extends RecyclerView.Adapter<LeadAdapter.viewHolder> {

    private Context mContext;
    private List<LeadsModel> leadsList;


    public LeadAdapter(Context mContext, List<LeadsModel> leadsList) {
        this.mContext = mContext;
        this.leadsList = leadsList;
    }

    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.leads_cardview, parent, false);

        return new viewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(LeadAdapter.viewHolder viewHolder, int i) {

        LeadsModel leadsModel = leadsList.get(i);
        viewHolder.nameLeadView.setText(leadsModel.getNameLead());
        viewHolder.timeLeadView.setText(leadsModel.getTimeLead());
        viewHolder.descrptionView.setText(leadsModel.getDescription());

        if (leadsModel.isUnread()) {
            viewHolder.nameLeadView.setTextColor(Color.parseColor("#ffc94c"));
        }


    }

    @Override
    public int getItemCount() {
        return leadsList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        public TextView nameLeadView, descrptionView, timeLeadView;

        public viewHolder(View view) {
            super(view);
            nameLeadView = (TextView) view.findViewById(R.id.name_view_leads);
            descrptionView = (TextView) view.findViewById(R.id.description_leads);
            timeLeadView = (TextView) view.findViewById(R.id.time_leads);
        }

    }
}

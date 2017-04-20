package com.lokeshkvn.android.quickdealtasks;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL PC on 20-04-2017.
 */

public class Leads extends AppCompatActivity {
    private RecyclerView recyclerView;
    private LeadAdapter adapter;
    private List<LeadsModel> leadsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leads);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.leads_actionbar);
        ImageView backButton = (ImageView) findViewById(R.id.back_2);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_leads);

        leadsList = new ArrayList<>();
        adapter = new LeadAdapter(this, leadsList);

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        getLeads();

    }

    private void getLeads() {

        LeadsModel a = new LeadsModel("RAKESH PATEL", "Need 1000pcs of Electric fans", "Posted 30 min ago", true);
        leadsList.add(a);

        LeadsModel b = new LeadsModel("JOSEPH SMITH", "500 LED Television for New Showroom ", "Posted 45 min ago", true);
        leadsList.add(b);

        LeadsModel c = new LeadsModel("SHAILEE SHAH", "Need 1000pcs of Electric fans", "Posted 1 hr  ago", false);
        leadsList.add(c);

        LeadsModel d = new LeadsModel("VAIBHAV GUPTA", "Requirement of 500 LED TV ", "Posted 1 day ago", false);
        leadsList.add(d);

        LeadsModel e = new LeadsModel("HARRY D'SOUZA", "Need 100pcs of Dell Laptops", "Posted 3 day ago", false);
        leadsList.add(e);
    }
}

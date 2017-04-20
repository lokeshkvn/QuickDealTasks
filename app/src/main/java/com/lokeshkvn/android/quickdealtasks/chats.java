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
 * Created by DELL PC on 19-04-2017.
 */

public class chats extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ChatsAdapter adapter;
    private List<ChatsModel> chatsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chats);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.chat_actionbar);

        ImageView backButton = (ImageView) findViewById(R.id.back_3);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        chatsList = new ArrayList<>();
        adapter = new ChatsAdapter(this, chatsList);

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        getChats();
    }


    private void getChats() {

        ChatsModel a = new ChatsModel("GLOBAL ELECTRONICS", "Fine sir. Will deliver sample on your...", "2 min ago", true, "1", false);
        chatsList.add(a);

        ChatsModel b = new ChatsModel("PATEL ELECTRONICS", "Yes Sir We have product available in...", "4 min ago", true, "3", false);
        chatsList.add(b);

        ChatsModel c = new ChatsModel("BOMBAY ELECTRONICS", "Thank you sir.", "8 min ago", false, null, true);
        chatsList.add(c);

        ChatsModel d = new ChatsModel("OPERA SOLUTIONS", "No problem sir. Will update you soon.", "16 min ago", false, null, false);
        chatsList.add(d);

        ChatsModel e = new ChatsModel("HARI OM ELECTRONICS", "Sorry Sir . But you can checkout in other...", "32 min ago", false, null, false);
        chatsList.add(e);

        ChatsModel f = new ChatsModel("KRISHNA ELECTRONICS", "Your requirement has been recieved sir :).", "1 hr ago", false, null, false);
        chatsList.add(f);

    }


}

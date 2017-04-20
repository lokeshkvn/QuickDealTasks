package com.lokeshkvn.android.quickdealtasks;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by DELL PC on 19-04-2017.
 */

public class Description extends AppCompatActivity {
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.description_actionbar);
        getSupportActionBar().setElevation(0);

        ImageView backButton = (ImageView) findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ImageView download = (ImageView) findViewById(R.id.download);
        download.setOnClickListener(new View.OnClickListener() {

            Handler handler = new Handler() {
                @Override
                public void handleMessage(Message message) {
                    super.handleMessage(message);
                    progressDialog.incrementProgressBy(3);
                }
            };

            @Override
            public void onClick(View v) {
                progressDialog = new ProgressDialog(Description.this);
                progressDialog.setMax(100);
                progressDialog.setMessage("Downloading Screenshot999.jpg");
                progressDialog.setTitle("Download in Progress");
                progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                progressDialog.show();

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (progressDialog.getProgress() <= progressDialog.getMax()) {
                            try {
                                Thread.sleep(200);
                                handler.sendMessage(handler.obtainMessage());
                                if (progressDialog.getProgress() == progressDialog.getMax()) {
                                    progressDialog.dismiss();
                                }
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();

            }

        });


    }
}

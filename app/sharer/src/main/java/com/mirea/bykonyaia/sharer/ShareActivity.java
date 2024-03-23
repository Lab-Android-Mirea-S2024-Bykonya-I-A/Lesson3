package com.mirea.bykonyaia.sharer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
    }

    @Override
    protected void onStart() {
        super.onStart();
        final Intent intent = getIntent();
        if(intent == null)
            return;

        final String message = intent.getStringExtra(Intent.EXTRA_TEXT);
        if(message == null)
            return;

        ((TextView)findViewById(R.id.textView)).setText(message);
    }
}
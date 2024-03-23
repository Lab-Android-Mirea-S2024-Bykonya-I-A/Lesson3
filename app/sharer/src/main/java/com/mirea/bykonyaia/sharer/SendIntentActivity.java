package com.mirea.bykonyaia.sharer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SendIntentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_intent);
    }

    public void OnSendIntent(View v)
    {
        Intent intent = new Intent(android.content.Intent.ACTION_SEND);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_TEXT, "Mirea");
        startActivity(Intent.createChooser(intent, "Выбор за вами!"));
    }
}
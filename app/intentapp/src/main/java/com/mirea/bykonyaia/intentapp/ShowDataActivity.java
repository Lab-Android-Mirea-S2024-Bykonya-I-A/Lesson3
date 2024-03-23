package com.mirea.bykonyaia.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowDataActivity extends AppCompatActivity {
    static private final int MyNumberInGroup = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);
    }
    @Override
    protected void onStart() {
        super.onStart();

        final String text = String.format(
            "КВАДРАТ ЗНАЧЕНИЯ МОЕГО НОМЕРА ПО СПИСКУ В ГРУППЕ СОСТАВЛЯЕТ %d, а текущее время %s",
            MyNumberInGroup * MyNumberInGroup, getIntent().getStringExtra("formatted-date"));
        ((TextView)findViewById(R.id.textView)).setText(text);
    }
}

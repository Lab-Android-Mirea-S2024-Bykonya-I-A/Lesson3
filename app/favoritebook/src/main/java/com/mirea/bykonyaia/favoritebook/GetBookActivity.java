package com.mirea.bykonyaia.favoritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.sax.TextElementListener;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GetBookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_book);
    }


    public void OnSetBookButtonClicked(View v) {
        final String text = ((EditText)findViewById(R.id.editTextText)).getText().toString();

        Intent data = new Intent();
        data.putExtra(ShowBookActivity.USER_BOOK_MESSAGE, text);
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}
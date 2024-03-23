package com.mirea.bykonyaia.favoritebook;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShowBookActivity extends AppCompatActivity {
    private ActivityResultLauncher<Intent> activityResultLauncher;
    static final public String USER_BOOK_MESSAGE="MESSAGE";
    private TextView textViewUserBook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_book);
        textViewUserBook = findViewById(R.id.textView);

        activityResultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        String userBook = result.getData().getStringExtra(USER_BOOK_MESSAGE);
                        textViewUserBook.setText(String.format("Название Вашей любимой книги: %s", userBook));
                    }
                }});
    }

    public void OnChangeBookButtonClicked(View v) {
        activityResultLauncher.launch(new Intent(this, GetBookActivity.class));
    }
}
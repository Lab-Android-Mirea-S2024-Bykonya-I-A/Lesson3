package com.mirea.bykonyaia.simplefragmentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Fragment m_fragment_1 = null;
    private Fragment m_fragment_2 = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m_fragment_1 = new FirstFragment();
        m_fragment_2 = new SecondFragment();
    }
    public void OnUseFirstFragmentButtonClicked(View v) {
        getSupportFragmentManager().beginTransaction().
            replace(R.id.fragmentContainer, m_fragment_1).
            commit();
    }
    public void OnUseSecondFragmentButtonClicked(View v) {
        getSupportFragmentManager().beginTransaction().
                replace(R.id.fragmentContainer, m_fragment_2).
                commit();
    }
}
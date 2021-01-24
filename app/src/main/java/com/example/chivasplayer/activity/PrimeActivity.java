package com.example.chivasplayer.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.chivasplayer.R;

/**
 * Created by OldJii
 * on 1/24/21
 */
public class PrimeActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar mToolbar;
    private TextView mTitle;
    private TextView mNormalPageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_prime_activity);
        initFindViewById();
        initLinstener();
    }

    private void initFindViewById() {
        mToolbar = findViewById(R.id.toolbar);
        mTitle = findViewById(R.id.toolbar_title);
        mNormalPageText = findViewById(R.id.normal_page);
    }

    private void initLinstener() {
        mNormalPageText.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mNormalPageText) {
            startActivity(new Intent(this, NormalActivity.class));
        }
    }
}
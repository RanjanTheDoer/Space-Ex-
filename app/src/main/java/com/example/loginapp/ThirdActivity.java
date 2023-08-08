package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.util.jar.Attributes;

public class ThirdActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_third);

        String passedName = getIntent().getStringExtra("name");
        String passedNickname = getIntent().getStringExtra("nickname");

        TextView fullNameTextView = findViewById(R.id.fullname);
        TextView nicknameTextView = findViewById(R.id.nickname);

        if (passedName != null && !passedName.isEmpty()) {
            fullNameTextView.setText(passedName);
        } else {
            fullNameTextView.setText("No name provided");
        }

        if (passedNickname != null && !passedNickname.isEmpty()) {
            nicknameTextView.setText(passedNickname);
        } else {
            nicknameTextView.setText("No nickname provided");
        }

        MaterialButton loveBtn = (MaterialButton) findViewById(R.id.loveBtn);

        loveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ThirdActivity.this, "launching ...", Toast.LENGTH_SHORT).show();
                openFourthActivity();
            }
        });

    }
    private void openFourthActivity() {
        Intent intent = new Intent(ThirdActivity.this, FourActivity.class);
        startActivity(intent);
    }
}
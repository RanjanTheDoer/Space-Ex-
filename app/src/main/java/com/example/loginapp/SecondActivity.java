package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_second);



        MaterialButton saveBtn = (MaterialButton) findViewById(R.id.saveBtn);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Toast.makeText(SecondActivity.this, "launching ...", Toast.LENGTH_SHORT).show();
                openThirdActivity();


            }
        });

    }
    private void openThirdActivity() {
        EditText nameEditText = findViewById(R.id.name);
        EditText nicknameEditText = findViewById(R.id.nickname);
        String enteredName = nameEditText.getText().toString();
        String enteredNickname = nicknameEditText.getText().toString();
        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
        intent.putExtra("name", enteredName);
        intent.putExtra("nickname", enteredNickname);
        startActivity(intent);
    }
}
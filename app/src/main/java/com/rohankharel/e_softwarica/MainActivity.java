package com.rohankharel.e_softwarica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etID, etPassWord;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etID= findViewById(R.id.etID);
        etPassWord = findViewById(R.id.etPassWord);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etID.getText().toString())){
                    etID.setError("Please Enter Id");
                }
                else if (TextUtils.isEmpty(etPassWord.getText().toString())){
                    etPassWord.setError("Please Enter Password");

                }
                else if(etID.getText().toString().equals("rohan") && etPassWord.getText().toString().equals("rohan")){
                    Toast.makeText(MainActivity.this, "Login Sucess", Toast.LENGTH_SHORT).show();
                }
                else  {
                    Toast.makeText(MainActivity.this, "Please Enter Valid UserName and Password", Toast.LENGTH_SHORT).show();
                }

                Intent intent = new Intent(MainActivity.this, DashBoardActivity.class);
                startActivity(intent);

            }
        });

    }
}

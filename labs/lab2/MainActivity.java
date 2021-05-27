package com.example.buttonwire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private TextView  txtCoolView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnlogin);
        txtCoolView = findViewById(R.id.txtCoolView);

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //means pretty much do this....
                txtCoolView.setText("Cool code!");

            }
        });

    }
}
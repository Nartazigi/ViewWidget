package com.example.viewwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText name;
Button save;
TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.edtname);
        save = findViewById(R.id.btn);
        display = findViewById(R.id.ddd);
        changeText();
    }
    protected void changeText(){
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String hold = name.getText().toString() ;
              display.setText(hold);
            }
        });
    }
}
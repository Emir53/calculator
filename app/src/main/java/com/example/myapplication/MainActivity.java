package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    private Button buttonShowText;
    private Button buttonShowToast;
    private NumberPicker numberPicker;
    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        buttonShowText = findViewById(R.id.buttonShowText);
        buttonShowToast = findViewById(R.id.buttonShowToast);
        numberPicker = findViewById(R.id.numberPicker);
        seekBar = findViewById(R.id.seekBar);

        buttonShowText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editText.getText().toString();
                textView.setText(inputText);
            }
        });

        buttonShowToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toastText = "Button Clicked!";
                Toast.makeText(MainActivity.this, toastText, Toast.LENGTH_SHORT).show();
            }
        });

        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(10);
        numberPicker.setValue(5);

        seekBar.setMax(100);
        seekBar.setProgress(50);
    }
}

package com.example.switch_and_radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Button;
import android.widget.ToggleButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    private ToggleButton tb;
    private Switch switch1;
    private LinearLayout ll;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll = (LinearLayout) findViewById(R.id.me);
        switch1 = findViewById(R.id.switch1);
        tb = findViewById(R.id.toggleButton);
        button = findViewById(R.id.button);
    }

    public void checker(View view) {
        boolean[] arr = new boolean[2];
        arr[0] = switch1.isChecked();
        arr[1] = tb.isChecked();
        if(arr[0] && arr[1])
        {
            ll.setBackgroundColor(Color.parseColor("#557aaf"));
        }
        else if(arr[0] && !arr[1])
        {
            ll.setBackgroundColor(Color.parseColor("#25f166"));
        }
        else if(!arr[0] && arr[1])
        {
            ll.setBackgroundColor(Color.parseColor("#000000"));
        }
        else
        {
            ll.setBackgroundColor(Color.parseColor("#f8591f"));
        }
    }
}

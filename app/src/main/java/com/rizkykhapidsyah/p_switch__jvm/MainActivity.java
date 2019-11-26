package com.rizkykhapidsyah.p_switch__jvm;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout SwitchLayout_IDJAVA;
    Switch SwitchDemo_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SwitchLayout_IDJAVA = findViewById(R.id.SwitchLayout_IDXML);
        SwitchDemo_IDJAVA = findViewById(R.id.SwitchDemo_IDXML);

        SwitchDemo_IDJAVA.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (SwitchDemo_IDJAVA.isChecked()) {
                    SwitchLayout_IDJAVA.setBackgroundColor(Color.YELLOW);
                    Toast.makeText(getApplicationContext(),
                            "Switch State :" + SwitchDemo_IDJAVA.getTextOn().toString(),
                            Toast.LENGTH_LONG).show();
                } else {
                    SwitchDemo_IDJAVA.setBackgroundColor(Color.RED);
                    Toast.makeText(getApplicationContext(),
                            "Switch State :" + SwitchDemo_IDJAVA.getTextOff().toString(),
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

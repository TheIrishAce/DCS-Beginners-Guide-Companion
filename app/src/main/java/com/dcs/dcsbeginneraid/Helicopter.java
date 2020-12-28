package com.dcs.dcsbeginneraid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableRow;

public class Helicopter extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.dcs.dcsbeginneraid.EXTRA_TEXT";
    TableRow ka50_row, SA342_row;
    public static String selectedHelicoperModuleName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helicopter);

        ka50_row = findViewById(R.id.helicopter_ka50_row);
        SA342_row = findViewById(R.id.helicopter_sa342_row);

        ka50_row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedHelicoperModuleName = "ka50";
                Intent intent = new Intent(Helicopter.this, VideoActivity.class);
                intent.putExtra(EXTRA_TEXT, selectedHelicoperModuleName);
                //Toast.makeText(Plane.this, selectedModuleNameConst, Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        SA342_row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedHelicoperModuleName = "sa342";
                Intent intent = new Intent(Helicopter.this, VideoActivity.class);
                intent.putExtra(EXTRA_TEXT, selectedHelicoperModuleName);
                //Toast.makeText(Plane.this, selectedModuleNameConst, Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}
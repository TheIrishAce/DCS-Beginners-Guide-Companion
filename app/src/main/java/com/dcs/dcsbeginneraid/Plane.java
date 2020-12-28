package com.dcs.dcsbeginneraid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableRow;
import android.widget.Toast;

public class Plane extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.dcs.dcsbeginneraid.EXTRA_TEXT";
    TableRow f14_row, f16_row;
    public static String selectedPlaneModuleName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planes);

        f14_row = findViewById(R.id.plane_f14_row);
        f16_row = findViewById(R.id.plane_f16_row);

        f14_row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedPlaneModuleName = "f14";
                Intent intent = new Intent(Plane.this, VideoActivity.class);
                intent.putExtra(EXTRA_TEXT, selectedPlaneModuleName);
                //Toast.makeText(Plane.this, selectedModuleNameConst, Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        f16_row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedPlaneModuleName = "f16";
                Intent intent = new Intent(Plane.this, VideoActivity.class);
                intent.putExtra(EXTRA_TEXT, selectedPlaneModuleName);
                startActivity(intent);
            }
        });
    }
}
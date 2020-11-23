package com.example.dcsbeginneraid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageButton plane_button = (ImageButton)findViewById(R.id.plane_button);
        plane_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Texthere = text.getText().toString();
                Intent intent = new Intent(Menu.this,
                        Plane.class);
                //intent.putExtra("Text",Texthere);
                startActivity(intent);
            }
        });

        ImageButton helicopter_button = (ImageButton)findViewById(R.id.helicopter_button);
        helicopter_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,
                        Helicopter.class);
                startActivity(intent);
            }
        });

        ImageButton vehicle_button = (ImageButton)findViewById(R.id.vehicle_button);
        vehicle_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,
                        Vehicle.class);
                startActivity(intent);
            }
        });

        ImageButton weapon_button = (ImageButton)findViewById(R.id.weapon_button);
        weapon_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,
                        Weapon.class);
                startActivity(intent);
            }
        });
    }
}
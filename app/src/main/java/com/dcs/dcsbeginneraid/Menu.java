package com.dcs.dcsbeginneraid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class Menu extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout drawer;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

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
    /*
       onNavigationItemSelected used to give functionality to items inside the hamburger menu.
       Add case for each item in the list.
     */
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.pilot_photo:
                //Toast.makeText(this, "Logged out!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Menu.this, Camera.class));
                break;
        }
        return true;
    }

    @Override
    public void onBackPressed(){
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }
}
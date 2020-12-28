package com.dcs.dcsbeginneraid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;


public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        String selectedPlaneModuleName, selectedHelicopterModuleName;
        Uri uri = Uri.parse("android.resource://"+ getPackageName() + "/" + R.raw.samplevideo);

        selectedPlaneModuleName = getIntent().getStringExtra(Plane.EXTRA_TEXT);
        selectedHelicopterModuleName = getIntent().getStringExtra(Helicopter.EXTRA_TEXT);

        if(selectedPlaneModuleName.equals("f14")){
            //specify the location of media file
            Toast.makeText(this, selectedPlaneModuleName, Toast.LENGTH_LONG).show();
            uri = Uri.parse("android.resource://"+ getPackageName() + "/" + R.raw.f14_start);
        }
        else if(selectedPlaneModuleName.equals("f16")){
            Toast.makeText(this, selectedPlaneModuleName, Toast.LENGTH_LONG).show();
            uri = Uri.parse("android.resource://"+ getPackageName() + "/" + R.raw.f16_start);
        }

        if(selectedHelicopterModuleName.equals("ka50")){
            //specify the location of media file
            Toast.makeText(this, selectedPlaneModuleName, Toast.LENGTH_LONG).show();
            uri = Uri.parse("android.resource://"+ getPackageName() + "/" + R.raw.ka50_start);
        }
        else if(selectedHelicopterModuleName.equals("sa342")){
            //specify the location of media file
            Toast.makeText(this, selectedPlaneModuleName, Toast.LENGTH_LONG).show();
            uri = Uri.parse("android.resource://"+ getPackageName() + "/" + R.raw.sa342_start);
        }

        //Inital Video creation
        VideoView videoView =(VideoView)findViewById(R.id.videoView);
        //Creating MediaController
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);

        //Setting MediaController and URI, then starting the videoView
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

    }
}
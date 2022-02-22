//Julien West
package com.example.researchingreports;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set video uri from local folder
        Uri uri = Uri.parse("android.resource://com.example.researchingreports/" + R.raw.testvideo);

        //Initialize VideoView reference
        VideoView simpleVideoView = (VideoView)findViewById(R.id.simpleVideoView);

        //Set video uri
        simpleVideoView.setVideoURI(uri);

        //Create a media controller object
        MediaController mediaController = new MediaController(this);

        //Assign media controller to video view
        simpleVideoView.setMediaController(mediaController);

        //Start video
        simpleVideoView.requestFocus();
        simpleVideoView.start();
    }
}
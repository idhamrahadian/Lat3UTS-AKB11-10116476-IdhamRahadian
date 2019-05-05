package com.apps.idhamrahadian.giveawaytrash.view.gallery;

/*
Developed by IdhdamRahadian, 10116476, AKB-11
on Sunday, May 2 2019
*/

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.apps.idhamrahadian.giveawaytrash.R;

public class GalleryImageActivity extends AppCompatActivity {
    ImageView selectedImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_image);
//        selectedImage = (ImageView)findViewById(R.id.selectedImage);
//        Intent intent = getIntent();
//        selectedImage.setImageResource(intent.getIntExtra("image",0));
    }
}

package org.gg.android.commons.gallery;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SampleActivity extends Activity{
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.sample);
        
        Button start = (Button) findViewById(R.id.start);
        
        start.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(SampleActivity.this, GalleryActivity.class);
               
               //uncomment this line to change images folder
               //intent.putExtra(GalleryActivity.INTENT_EXTRAS_FOLDER, "file:///android_asset/my_folder");
               
               //uncomment this line to change start image
//               intent.putExtra(GalleryActivity.INTENT_EXTRAS_POSITION, "1");
               
               startActivity(intent);
               
            }
        });
        
    }

}

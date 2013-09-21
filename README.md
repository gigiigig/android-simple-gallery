android-simple-gallery
======================

A simple gallery activity for android application

Gallery is automatic filled with images in folder assets/gallery.

If you want change folder you can launch GallerActivity passing to the Intent
an extras String called "folder" or `GalleryActivity.INTENT_EXTRAS_FOLDER`
  
    intent.putExtra(GalleryActivity.INTENT_EXTRAS_FOLDER, "file:///android_asset/my_folder"); 
 
You can also select which image open on activity start, passing to the Intent an extras  
String called "position" or `GalleryActivity.INTENT_EXTRAS_POSITION`

    intent.putExtra(GalleryActivity.INTENT_EXTRAS_POSITION, "1");
 
The project conatains an example Activity called SampleActivity, which shows 
how to use GallerActivity.
 
 
 

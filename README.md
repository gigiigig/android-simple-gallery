android-simple-gallery
======================

A simple gallery activity for android application

Gallery is automatic filled with images in folder assets/gallery.

If you want change folder you can launch GallerActivuty passing to Intent extras a
String called "folder" or GalleryActivity.INTENT_EXTRAS_FOLDER.
  
  intent.putExtra(GalleryActivity.INTENT_EXTRAS_FOLDER, "file:///android_asset/my_folder"); 
 
You can also select wich image open on activity start, passing to Intent extras a 
String called "position" or GalleryActivity.INTENT_EXTRAS_POSITION, wich must be an integer.

  intent.putExtra(GalleryActivity.INTENT_EXTRAS_POSITION, "1");
 
Project conatains an example Activity called SampleActivity, which show 
how to use GallerActivity.
 
 
 

package com.socialinept.tikbits;

import android.os.Bundle;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
public class AndroidGame extends AndroidApplication
{
    /** Called when the activity is first created. */
    @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
        
      AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
      cfg.useGL20 = true;
      cfg.useAccelerometer = false;
      cfg.useCompass = false;
        
      initialize(new Tikbits().getApplicationListener(), cfg);
   }
}

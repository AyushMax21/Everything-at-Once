package com.eggdevs.everythingatonce;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_splash_screen);

      getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
              WindowManager.LayoutParams.FLAG_FULLSCREEN);

      Handler splashHandler = new Handler();
      splashHandler.postDelayed(new Runnable() {
         @Override
         public void run() {
            Intent mainActivityIntent = new Intent(SplashScreen.this, MainActivity.class);
            startActivity(mainActivityIntent);
         }
      }, 3000);

   }
}
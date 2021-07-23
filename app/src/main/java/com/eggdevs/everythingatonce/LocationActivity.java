package com.eggdevs.everythingatonce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LocationActivity extends AppCompatActivity {

   EditText etLocation;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_location);

      etLocation = findViewById(R.id.etLocation);

      findViewById(R.id.btnMap).setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            String location = etLocation.getText().toString();

            Uri mapUri = Uri.parse("geo:0,0?q=" + location);

            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);

            Intent mapIntentChooser = Intent.createChooser(mapIntent, "Map Intent Chooser");
            startActivity(mapIntentChooser);
         }
      });
   }
}
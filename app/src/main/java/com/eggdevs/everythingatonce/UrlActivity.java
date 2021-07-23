package com.eggdevs.everythingatonce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UrlActivity extends AppCompatActivity {

   Button btnUrl;
   EditText etUrl;

   //web: https:// + website url

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_url);

      btnUrl  = findViewById(R.id.btnUrl);
      etUrl = findViewById(R.id.etUrl);

      btnUrl.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

            String url = etUrl.getText().toString();

            Uri webAddressUri = Uri.parse("https://" + url);

            Intent urlIntent = new Intent(Intent.ACTION_VIEW, webAddressUri);
            Intent urlIntentChooser = Intent.createChooser(urlIntent, "Url Intent Chooser");

            startActivity(urlIntentChooser);
         }
      });

   }
}
package com.eggdevs.everythingatonce;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

   Button btnOpenUrl, btnLocation, btnSendMessage, btnCallSomeone;
   Intent buttonClickIntent;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      getWindow().setFlags(1024, 1024);

      btnCallSomeone = findViewById(R.id.btnCallSomeone);
      btnLocation = findViewById(R.id.btnLocation);
      btnSendMessage = findViewById(R.id.btnSendMessage);
      btnOpenUrl = findViewById(R.id.btnOpenUrl);

      btnCallSomeone.setOnClickListener(this);
      btnLocation.setOnClickListener(this);
      btnSendMessage.setOnClickListener(this);
      btnOpenUrl.setOnClickListener(this);

   }

   @Override
   public void onClick(View view) {
      int btnClickedId = view.getId();

      switch (btnClickedId) {
         case R.id.btnCallSomeone:
            buttonClickIntent = new Intent(MainActivity.this, CallActivity.class);
            break;
         case R.id.btnLocation:
            buttonClickIntent = new Intent(MainActivity.this, LocationActivity.class);
            break;
         case R.id.btnOpenUrl:
            buttonClickIntent = new Intent(MainActivity.this, UrlActivity.class);
            break;
         case R.id.btnSendMessage:
            buttonClickIntent = new Intent(MainActivity.this, MessageActivity.class);
            break;
      }
      startActivity(buttonClickIntent);
   }

}
package com.eggdevs.everythingatonce;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

   Button btnOpenUrl, btnLocation, btnSendMessage, btnCallSomeone;

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

   }

   //alt + shitft + left mouse click
   //ctrl + d
}
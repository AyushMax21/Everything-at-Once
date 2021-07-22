package com.eggdevs.everythingatonce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CallActivity extends AppCompatActivity {

   //shift + f6

   Button btnCall;
   EditText etPhone;

   //URI  = UNIFORM RESOURCE IDENTIFIER

   //Uri is a superset of url

   // tel:9898627887

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_call);


      btnCall = findViewById(R.id.btnCall);
      etPhone = findViewById(R.id.etPhone);

      btnCall.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

            //for call application.
            String phoneNumber = etPhone.getText().toString();
            Uri phoneUri = Uri.parse("tel:" + phoneNumber);
            Intent callIntent = new Intent(Intent.ACTION_DIAL, phoneUri);

            Intent callIntentChooser = Intent.createChooser(callIntent, "Call Intent Chooser");
            startActivity(callIntentChooser);

         }
      });
   }
}
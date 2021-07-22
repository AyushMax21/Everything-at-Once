package com.eggdevs.everythingatonce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MessageActivity extends AppCompatActivity {

   Button btnMessage;
   EditText etMessage;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_message);

      btnMessage = findViewById(R.id.btnMessage);
      etMessage = findViewById(R.id.etMessage);

      btnMessage.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            String messageText = etMessage.getText().toString();

            Intent messageIntent = new Intent(Intent.ACTION_SEND);

            messageIntent.setType("text/plain");
            messageIntent.putExtra(Intent.EXTRA_TEXT, messageText);

            Intent messageChooserIntent = Intent.createChooser(messageIntent, "Message chooser intent");

            startActivity(messageChooserIntent);
         }
      });
   }
}
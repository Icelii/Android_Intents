package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button intent1 = findViewById(R.id.intent1);
        Button intent2 = findViewById(R.id.intent2);
        Button intent3 = findViewById(R.id.intent3);
        Button intent4 = findViewById(R.id.intent4);
        Button intentin1 = findViewById(R.id.intentin1);
        Button intentin2 = findViewById(R.id.intentin2);
        Button intentin3 = findViewById(R.id.intentin3);
        Button intentin4 = findViewById(R.id.intentin4);

        /* EXPLICITOS */
        intent1.setOnClickListener(view ->{
            Intent i1 = new Intent(Intent.ACTION_MAIN);
            i1.addCategory(Intent.CATEGORY_APP_CALENDAR);
            startActivity(i1);
        });

        intent2.setOnClickListener(view -> {
            Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=HDQol8FGBOA&ab_channel=MAAU2"));
            startActivity(i2);
        });

        intent3.setOnClickListener(view ->{
            Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:25.580765, -103.404718"));
            startActivity(i3);
        });

        intent4.setOnClickListener(view ->{
            String numeroAMarcar = "8712599862";
            Intent i4 = new Intent(Intent.ACTION_DIAL);
            i4.setData(Uri.parse("tel:" + numeroAMarcar));
            startActivity(i4);
        });

        /* IMPLICITOS */
        intentin1.setOnClickListener(view -> {
            Intent in1 = new Intent(MediaStore.INTENT_ACTION_MUSIC_PLAYER);
            startActivity(in1);
        });

        intentin2.setOnClickListener(view ->{
            Intent in2 = new Intent(Intent.ACTION_SEND);
            in2.setType("text/plain");
            in2.putExtra(Intent.EXTRA_TEXT, "HOLA!!! COMPARTE ESTO :^)");
            startActivity(Intent.createChooser(in2, "Compartir en: "));
        });

        intentin3.setOnClickListener(view ->{
            Intent in3 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(in3);
        });

        intentin4.setOnClickListener(view -> {
            Intent in4 = new Intent(Intent.ACTION_SENDTO);
            in4.setData(Uri.parse("mailto:22170107@uttcampus.edu.mx"));
            startActivity(in4);
        });

    }
}
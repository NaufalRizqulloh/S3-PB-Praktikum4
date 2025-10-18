package com.example.praktikum4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CardView startersCard;
    CardView mainsCard;
    CardView dessertsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startersCard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_mains);
        dessertsCard = findViewById(R.id.card_view_desserts);

        // Starters Card
        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class);
                startActivity(startersActivityIntent);
            }
        });

        // Mains Card
        mainsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainsActivityIntent = new Intent(MainActivity.this, MenuMainsActivity.class);
                startActivity(mainsActivityIntent);
            }
        });

        // Desserts Card
        dessertsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dessertsActivityIntent = new Intent(MainActivity.this, DessertsActivity.class);
                startActivity(dessertsActivityIntent);
            }
        });

        // Gmaps
        TextView locText = findViewById(R.id.text_view_loc);
        locText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchMapAppIntent = new Intent(Intent.ACTION_VIEW);
                launchMapAppIntent.setData(Uri.parse("geo:-7.2764558,112.7934574?q=Politeknik+Elektronika+Negeri+Surabaya"));
                startActivity(launchMapAppIntent);
            }
        });

        // Email
        TextView orderText = findViewById(R.id.text_view_order);
        orderText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
                launchEmailAppIntent.setData(Uri.parse("mailto:emailnopal@gmail.com"));
                startActivity(launchEmailAppIntent);
            }
        });

        // Nomor WA
        TextView nomorWA = findViewById(R.id.text_view_nomorWA);
        nomorWA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchWhatsAppIntent = new Intent(Intent.ACTION_VIEW);
                launchWhatsAppIntent.setData(Uri.parse("https://wa.me/6281133305005"));
                startActivity(launchWhatsAppIntent);
            }
        });
    }
}
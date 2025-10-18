package com.example.praktikum4;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuMainsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_mains);

        ListView menuMainList = findViewById(R.id.list_view_menuMains);

        Dish[] dishes = {
                new Dish("Nasi Goreng Jawa", "Nasi goreng khas untuk anak kos", 150),
                new Dish("Ayam Geprek Malaysia", "Top ayam di PENS (overated)", 120),
                new Dish("Nasi Telor Cibus", "Murah dan kenyang", 100),
                new Dish("Rendang", "Daging sapi yang ndaging", 560),
                new Dish("Wingstop Juara Paket 3 Pakai Saos Lousiana Rub", "JOS GANDOS WENAK WENAK WENAK", 240),
        };

        ArrayAdapter<Dish> dishAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        menuMainList.setAdapter(dishAdapter);
        menuMainList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Dish ds = dishAdapter.getItem(position);
                Toast toast = Toast.makeText(getApplicationContext(), ds.getDesc(), Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
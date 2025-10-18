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

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);

        Dish[] dishes = {
            new Dish("Scallop and horseradish wontons", "Thin wonton cases stuffed with scallop and fresh horseradish", 100),
            new Dish("Prune and lemon pudding", "A rich suet pudding made with fresh prune and tangy lemon", 70),
            new Dish("Prune and pumpkin seed muffins", "Rich muffins made with fresh prune and pumpkin seeds", 95),
            new Dish("Prune and lemon salad", "A crunchy salad featuring fresh prune and tangy lemon", 40),
            new Dish("Prune and date cake", "Moist cake made with fresh prune and crunchy date", 200),
        };

        ArrayAdapter<Dish> dishAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        startersList.setAdapter(dishAdapter);
        startersList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Dish ds = dishAdapter.getItem(i);
                Toast toast = Toast.makeText(getApplicationContext(), ds.getDesc(), Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
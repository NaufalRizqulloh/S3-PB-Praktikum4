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

public class DessertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);

        ListView dessertsList = findViewById(R.id.list_view_desserts);

        Dish[] dishes = {
                new Dish("Es krim Cone Mixue", "Cocok sebagai pencuci mulut", 70),
                new Dish("Black Forest Cake", "1 Slice kue coklat yang enak", 670),
                new Dish("Fruit Platter", "Apel, jeruk, melon, semangka, apapun itu cocok untuk akhir yang segar", 470),
                new Dish("Pudding", "Dengan macam-macam rasa!", 250),
                new Dish("Donat", "Dengan macam-macam jenis", 140),
        };

        ArrayAdapter<Dish> dishAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        dessertsList.setAdapter(dishAdapter);
        dessertsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Dish ds = dishAdapter.getItem(position);
                Toast toast = Toast.makeText(getApplicationContext(), ds.getDesc(), Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
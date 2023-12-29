package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity_farme3 extends AppCompatActivity {

    ArrayList<Chude> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {



        list = new ArrayList<>();
        list.add(new Chude(R.drawable.animal, "Động Vật", 1, "Bộ câu hỏi liên quan đến Động Vật."));
        list.add(new Chude(R.drawable.food, "Ẩm Thực", 2, "Bộ câu hỏi liên quan đến Ẩm Thực."));
        list.add(new Chude(R.drawable.earth, "Địa Chính Trị", 3, "Bộ câu hỏi liên quan đến các đất nước."));
        list.add(new Chude(R.drawable.music, "Âm Nhạc", 4, "Âm nhạc là liều thuốc chữa lành"));
        Chude123 adapter = new Chude123(list);
        ListView listView = findViewById(R.id.listProduct);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Chude product = (Chude) adapter.getItem(position);
                int a = product.getId();
                Intent intent = new Intent(MainActivity_farme3.this,MainActivity_farme2.class );
                intent.putExtra("a", a);
                startActivity(intent);
            }

        });
    }

}
package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity_farme2 extends AppCompatActivity {

    ArrayList<Chude> list;

    Button btn_QuestionList;

    Switch difficulty;

    int diffSet = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        int scorePlayer = getIntent().getIntExtra("scorePlayer", 0);
        setContentView(R.layout.farme_2);

        TextView scoreTextView = findViewById(R.id.textView2);
        scoreTextView.setText("" + scorePlayer);


        list = new ArrayList<>();
        list.add(new Chude(R.drawable.animal, "Động Vật", 1, "Bộ câu hỏi liên quan đến Động Vật."));
        list.add(new Chude(R.drawable.food, "Ẩm Thực", 2, "Bộ câu hỏi liên quan đến Ẩm Thực."));
        list.add(new Chude(R.drawable.earth, "Địa Chính Trị", 3, "Bộ câu hỏi liên quan đến các đất nước."));
        list.add(new Chude(R.drawable.music, "Âm Nhạc", 4, "Âm nhạc là liều thuốc chữa lành"));
        Chude123 adapter = new Chude123(list);
        ListView listView = findViewById(R.id.listProduct);
        difficulty = findViewById((R.id.difficulty));
        difficulty.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        diffSet = 2;
                    }
                }
        );
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Chude product = (Chude) adapter.getItem(position);
                int a = product.getId();
                Intent intent = new Intent(MainActivity_farme2.this,playActivity.class );
                Bundle extras = new Bundle();
                extras.putInt("a", a);
                extras.putInt("difficulty", diffSet);
                intent.putExtras(extras);
                startActivity(intent);
            }


        });
        btn_QuestionList = findViewById(R.id.btn_QuestionList);
        btn_QuestionList.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_farme2.this,MainActivity_farme3.class);
                startActivity(intent);
            }
        });
    }

}
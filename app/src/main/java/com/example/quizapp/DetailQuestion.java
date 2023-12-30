package com.example.quizapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
;import android.content.Intent;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DetailQuestion extends AppCompatActivity {
    TextView question, levelQuestion;
    RadioButton choose1, choose2, choose3, choose4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_question);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        question = findViewById(R.id.text_question);
        choose1 = findViewById(R.id.btn_choose1);
        choose2 = findViewById(R.id.btn_choose2);
        choose3 = findViewById(R.id.btn_choose3);
        choose4 = findViewById(R.id.btn_choose4);
        levelQuestion = findViewById(R.id.level_question);

        String selectItem = bundle.getString("selectedItem");
        String[] answers = bundle.getStringArray("answers");
        choose1.setText(answers[0]);
        choose2.setText(answers[1]);
        choose3.setText(answers[2]);
        choose4.setText(answers[3]);
        question.setText(selectItem);

        int level = Integer.parseInt(answers[4]);
        if (level == 2) {
            levelQuestion.setText("Khó");
            levelQuestion.setTextColor(getResources().getColor(R.color.hard));
        } else {
            levelQuestion.setText("Dễ");
            levelQuestion.setTextColor(getResources().getColor(R.color.normal));
        }

        int correctAnswer = Integer.parseInt(answers[5]);
        switch (correctAnswer) {
            case 1:
                choose1.setChecked(true);
                choose1.setTextColor(getResources().getColor(R.color.correct));
                break;
            case 2:
                choose2.setChecked(true);
                choose2.setTextColor(getResources().getColor(R.color.correct));
                break;
            case 3:
                choose3.setChecked(true);
                choose3.setTextColor(getResources().getColor(R.color.correct));
                break;
            case 4:
                choose4.setChecked(true);
                choose4.setTextColor(getResources().getColor(R.color.correct));
                break;
        }

        findViewById(R.id.image_back).setOnClickListener(
                a->finish()
        );
    }
}

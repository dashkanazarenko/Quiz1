package com.example.quiz1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private String selectedTopic = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        final LinearLayout bread = findViewById(R.id.breadLayout);
        final LinearLayout PL = findViewById(R.id.PLLayout);
        final LinearLayout car = findViewById(R.id.carLayout);
        final LinearLayout fav = findViewById(R.id.favoriteLayout);
        final LinearLayout kr = findViewById(R.id.krLayout);
        final LinearLayout ii = findViewById(R.id.iiLayout);

        final Button startQuizBtn = findViewById(R.id.startQuizBtn);

        bread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "ООП";
                bread.setBackgroundResource(R.drawable.round_topic);
                PL.setBackgroundResource(R.drawable.round_back);
                car.setBackgroundResource(R.drawable.round_back);
                fav.setBackgroundResource(R.drawable.round_back);
                kr.setBackgroundResource(R.drawable.round_back);
                ii.setBackgroundResource(R.drawable.round_back);
                startQuizBtn.setText(R.string.start);
            }
        });

        PL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "Базы данных";
                PL.setBackgroundResource(R.drawable.round_topic);
                bread.setBackgroundResource(R.drawable.round_back);
                car.setBackgroundResource(R.drawable.round_back);
                fav.setBackgroundResource(R.drawable.round_back);
                kr.setBackgroundResource(R.drawable.round_back);
                ii.setBackgroundResource(R.drawable.round_back);
                startQuizBtn.setText(R.string.start);
            }
        });

        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "Веб-программирование";
                car.setBackgroundResource(R.drawable.round_topic);
                PL.setBackgroundResource(R.drawable.round_back);
                bread.setBackgroundResource(R.drawable.round_back);
                fav.setBackgroundResource(R.drawable.round_back);
                kr.setBackgroundResource(R.drawable.round_back);
                ii.setBackgroundResource(R.drawable.round_back);
                startQuizBtn.setText(R.string.start);
            }
        });

        fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "Сетевые технологии";
                fav.setBackgroundResource(R.drawable.round_topic);
                PL.setBackgroundResource(R.drawable.round_back);
                car.setBackgroundResource(R.drawable.round_back);
                bread.setBackgroundResource(R.drawable.round_back);
                kr.setBackgroundResource(R.drawable.round_back);
                ii.setBackgroundResource(R.drawable.round_back);
                startQuizBtn.setText(R.string.start);
            }
        });

        kr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "Кибербезопасность";
                kr.setBackgroundResource(R.drawable.round_topic);
                PL.setBackgroundResource(R.drawable.round_back);
                car.setBackgroundResource(R.drawable.round_back);
                fav.setBackgroundResource(R.drawable.round_back);
                bread.setBackgroundResource(R.drawable.round_back);
                ii.setBackgroundResource(R.drawable.round_back);
                startQuizBtn.setText(R.string.start);
            }
        });

        ii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "Искусственный интеллект";
                ii.setBackgroundResource(R.drawable.round_topic);
                PL.setBackgroundResource(R.drawable.round_back);
                car.setBackgroundResource(R.drawable.round_back);
                fav.setBackgroundResource(R.drawable.round_back);
                kr.setBackgroundResource(R.drawable.round_back);
                bread.setBackgroundResource(R.drawable.round_back);
                startQuizBtn.setText(R.string.start);
            }
        });

        startQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedTopic.isEmpty()){
                    Toast.makeText(MainActivity.this, "Выберите викторину", Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopic);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}

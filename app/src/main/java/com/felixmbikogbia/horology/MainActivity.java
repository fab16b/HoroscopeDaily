package com.felixmbikogbia.horology;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import bot.box.horology.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
    }

    private void initializeViews() {
        LinearLayout layoutAries = findViewById(R.id.layoutAries);
        layoutAries.setOnClickListener(onClickListener);
        LinearLayout layoutTaurus = findViewById(R.id.layoutTaurus);
        layoutTaurus.setOnClickListener(onClickListener);
        LinearLayout layoutGemini = findViewById(R.id.layoutGemini);
        layoutGemini.setOnClickListener(onClickListener);
        LinearLayout layoutCancer = findViewById(R.id.layoutCancer);
        layoutCancer.setOnClickListener(onClickListener);
        LinearLayout layoutLeo = findViewById(R.id.layoutLeo);
        layoutLeo.setOnClickListener(onClickListener);
        LinearLayout layoutVirgo = findViewById(R.id.layoutVirgo);
        layoutVirgo.setOnClickListener(onClickListener);
        LinearLayout layoutLibra = findViewById(R.id.layoutLibra);
        layoutLibra.setOnClickListener(onClickListener);
        LinearLayout layoutScorpio = findViewById(R.id.layoutScorpio);
        layoutScorpio.setOnClickListener(onClickListener);
        LinearLayout layoutSagittarius = findViewById(R.id.layoutSagittarius);
        layoutSagittarius.setOnClickListener(onClickListener);
        LinearLayout layoutCapricorn = findViewById(R.id.layoutCapricorn);
        layoutCapricorn.setOnClickListener(onClickListener);
        LinearLayout layoutAquarius = findViewById(R.id.layoutAquarius);
        layoutAquarius.setOnClickListener(onClickListener);
        LinearLayout layoutPisces = findViewById(R.id.layoutPisces);
        layoutPisces.setOnClickListener(onClickListener);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.layoutAries:
                    Intent intent1 = new Intent(MainActivity.this, AriesActivity.class);
                    startActivity(intent1);
                    break;

                case R.id.layoutTaurus:
                    Intent intent2 = new Intent(MainActivity.this, TaurusActivity.class);
                    startActivity(intent2);
                    break;


                case R.id.layoutGemini:
                    Intent intent3 = new Intent(MainActivity.this, GeminiActivity.class);
                    startActivity(intent3);
                    break;


                case R.id.layoutCancer:
                    Intent intent4 = new Intent(MainActivity.this, CancerActivity.class);
                    startActivity(intent4);
                    break;


                case R.id.layoutLeo:
                    Intent intent5 = new Intent(MainActivity.this, LeoActivity.class);
                    startActivity(intent5);
                    break;


                case R.id.layoutVirgo:
                    Intent intent6 = new Intent(MainActivity.this, VirgoActivity.class);
                    startActivity(intent6);
                    break;


                case R.id.layoutLibra:
                    Intent intent7 = new Intent(MainActivity.this, LibraActivity.class);
                    startActivity(intent7);
                    break;


                case R.id.layoutScorpio:
                    Intent intent8 = new Intent(MainActivity.this, ScorpioActivity.class);
                    startActivity(intent8);
                    break;


                case R.id.layoutSagittarius:
                    Intent intent9 = new Intent(MainActivity.this, SagittariusActivity.class);
                    startActivity(intent9);
                    break;


                case R.id.layoutCapricorn:
                    Intent intent10 = new Intent(MainActivity.this, CapricornActivity.class);
                    startActivity(intent10);
                    break;


                case R.id.layoutAquarius:
                    Intent intent11 = new Intent(MainActivity.this, AquariusActivity.class);
                    startActivity(intent11);
                    break;


                case R.id.layoutPisces:
                    Intent intent12 = new Intent(MainActivity.this, PiscesActivity.class);
                    startActivity(intent12);
                    break;

            }
        }
    };

}



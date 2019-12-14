package com.felixmbikogbia.horology;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import bot.box.horology.R;
import bot.box.horology.annotation.DURATION;
import bot.box.horology.annotation.SUNSIGN;
import bot.box.horology.api.Horoscope;
import bot.box.horology.delegate.Response;
import bot.box.horology.hanshake.HorologyController;
import bot.box.horology.pojo.Zodiac;

public class AriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aries);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView textView = findViewById(R.id.aries_textView);
        textView.setMovementMethod(new ScrollingMovementMethod());

        Button button = findViewById(R.id.aries_today_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("here is the aries 01");
                Horoscope hAries = new Horoscope.Zodiac(AriesActivity.this)
                        .showLoader(false)
                        .requestSunSign(SUNSIGN.ARIES).requestDuration(DURATION.TODAY).isDebuggable(true).fetchHoroscope();
                HorologyController cAries = new HorologyController(new Response() {
                    @Override
                    public void onResponseObtained(Zodiac zodiac) {
                        System.out.println("here is the aries 02");
                        showHoroscope(zodiac, true, "");
                    }

                    @Override
                    public void onErrorObtained(String errormsg) {
                        System.out.println("here is the aries 03");
                        showHoroscope(null, false, errormsg);
                    }
                });
                cAries.requestConstellations(hAries);

            }
        });


    }

    private void showHoroscope(Zodiac z, boolean isSuccsess, String errormsg) {

        //TextView title = findViewById(R.id.aries_title);
        TextView date = findViewById(R.id.aries_date);
        TextView body = findViewById(R.id.aries_textView);

        if (isSuccsess) {
          // title.setText(z.getSunSign());
           date.setText(z.getDate());
            body.setText(z.getHoroscope());
        } else {
            body.setText(errormsg);
        }
    }
}

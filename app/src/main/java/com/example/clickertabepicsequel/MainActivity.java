package com.example.clickertabepicsequel;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageButton;
import android.media.MediaPlayer;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    ImageButton btn_add;
    ImageButton btn_less;
    ImageButton btn_restart;
    int clicks = 0;
    final Random random = new Random();

    MediaPlayer sisyphus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView); //отображение счета
        btn_add = findViewById(R.id.btn_add); //кнопка увеличения счета
        btn_less = findViewById(R.id.btn_less); //кнопка уменьшения счета
        btn_restart = findViewById(R.id.btn_restart); //кнопка сброса счета
        sisyphus = MediaPlayer.create(this, R.raw.sisyphus); //аудиозапись, будет проигрываться на кнопку

        btn_add.setOnClickListener(new View.OnClickListener() { //метод для увеличения счета
            @Override
            public void onClick(View v) {
                clicks++; //увеличение счета
                textView.setText(DeclinatedText(clicks), TextView.BufferType.EDITABLE); //Вывод счета со сколнением на экран
                if (clicks == 100){ //если кликов 100
                    btn_less.setImageResource(R.drawable.happy_birthday); //на кнопки увеличения и уменьшения устанавливаются новые картинки
                    btn_add.setImageResource(R.drawable.happy_birthday);
                    return; //выход из метода
                }
                switch (random.nextInt(26)){ //выбор картинки для установки на кнопку согласно рандомному числу
                    case 1:
                        btn_add.setImageResource(R.drawable.adachitrue);
                        break;
                    case 2:
                        btn_add.setImageResource(R.drawable.champion);
                        break;
                    case 3:
                        btn_add.setImageResource(R.drawable.damn);
                        break;
                    case 4:
                        btn_add.setImageResource(R.drawable.danteh);
                        break;
                    case 5:
                        btn_add.setImageResource(R.drawable.funnycat);
                        break;
                    case 6:
                        btn_add.setImageResource(R.drawable.sig);
                        break;
                    case 7:
                        btn_add.setImageResource(R.drawable.tiger);
                        break;
                    case 8:
                        btn_add.setImageResource(R.drawable.touchgrass);
                        break;
                    case 9:
                        btn_add.setImageResource(R.drawable.man_arrow_up);
                        break;
                    case 10:
                        btn_add.setImageResource(R.drawable.azerchai);
                        break;
                    case 11:
                        btn_add.setImageResource(R.drawable.boobsevil);
                        break;
                    case 12:
                        btn_add.setImageResource(R.drawable.cheburek);
                        break;
                    case 13:
                        btn_add.setImageResource(R.drawable.cool);
                        break;
                    case 14:
                        btn_add.setImageResource(R.drawable.dafoe);
                        break;
                    case 15:
                        btn_add.setImageResource(R.drawable.fly);
                        break;
                    case 16:
                        btn_add.setImageResource(R.drawable.gingerbread);
                        break;
                    case 17:
                        btn_add.setImageResource(R.drawable.happi);
                        break;
                    case 18:
                        btn_add.setImageResource(R.drawable.kitty);
                        break;
                    case 19:
                        btn_add.setImageResource(R.drawable.kpop);
                        break;
                    case 20:
                        btn_add.setImageResource(R.drawable.literallyme);
                        break;
                    case 21:
                        btn_add.setImageResource(R.drawable.michael);
                        break;
                    case 22:
                        btn_add.setImageResource(R.drawable.morning);
                        break;
                    case 23:
                        btn_add.setImageResource(R.drawable.rock);
                        break;
                    case 24:
                        btn_add.setImageResource(R.drawable.shrimple);
                        break;
                    case 25:
                        btn_add.setImageResource(R.drawable.stinky);
                        break;
                }
            }
        });

        btn_less.setOnClickListener(new View.OnClickListener() { //метод для уменьшения счета
            @Override
            public void onClick(View v) {
                clicks--; //уменьшение счета
                textView.setText(DeclinatedText(clicks), TextView.BufferType.EDITABLE); //Вывод счета со сколнением на экран
                if (clicks == -100){ //если счет -100
                    btn_less.setImageResource(R.drawable.violence); //на кнопки увеличения и уменьшения устанавливаются новые картинки
                    btn_add.setImageResource(R.drawable.violence);
                    return;
                }
                switch (random.nextInt(26)){ //выбор картинки для установки на кнопку согласно рандомному числу
                    case 1:
                        btn_less.setImageResource(R.drawable.adachitrue);
                        break;
                    case 2:
                        btn_less.setImageResource(R.drawable.champion);
                        break;
                    case 3:
                        btn_less.setImageResource(R.drawable.damn);
                        break;
                    case 4:
                        btn_less.setImageResource(R.drawable.danteh);
                        break;
                    case 5:
                        btn_less.setImageResource(R.drawable.funnycat);
                        break;
                    case 6:
                        btn_less.setImageResource(R.drawable.sig);
                        break;
                    case 7:
                        btn_less.setImageResource(R.drawable.tiger);
                        break;
                    case 8:
                        btn_less.setImageResource(R.drawable.touchgrass);
                        break;
                    case 9:
                        btn_less.setImageResource(R.drawable.man_arow_down);
                        break;
                    case 10:
                        btn_less.setImageResource(R.drawable.azerchai);
                        break;
                    case 11:
                        btn_less.setImageResource(R.drawable.boobsevil);
                        break;
                    case 12:
                        btn_less.setImageResource(R.drawable.cheburek);
                        break;
                    case 13:
                        btn_less.setImageResource(R.drawable.cool);
                        break;
                    case 14:
                        btn_less.setImageResource(R.drawable.dafoe);
                        break;
                    case 15:
                        btn_less.setImageResource(R.drawable.fly);
                        break;
                    case 16:
                        btn_less.setImageResource(R.drawable.gingerbread);
                        break;
                    case 17:
                        btn_less.setImageResource(R.drawable.happi);
                        break;
                    case 18:
                        btn_less.setImageResource(R.drawable.kitty);
                        break;
                    case 19:
                        btn_less.setImageResource(R.drawable.kpop);
                        break;
                    case 20:
                        btn_less.setImageResource(R.drawable.literallyme);
                        break;
                    case 21:
                        btn_less.setImageResource(R.drawable.michael);
                        break;
                    case 22:
                        btn_less.setImageResource(R.drawable.morning);
                        break;
                    case 23:
                        btn_less.setImageResource(R.drawable.rock);
                        break;
                    case 24:
                        btn_less.setImageResource(R.drawable.shrimple);
                        break;
                    case 25:
                        btn_less.setImageResource(R.drawable.stinky);
                        break;
                }
            }
        });

        btn_restart.setOnClickListener(new View.OnClickListener() { //метод для сброса счета
            @Override
            public void onClick(View v) {
                clicks = 0; //сброс счета
                textView.setText("Кнопка нажата 0 раз", TextView.BufferType.EDITABLE); //Вывод счета со сколнением на экран
                sisyphus.start(); //начало проигрывания аудиозаписи
            }
        });


    }
    private String DeclinatedText(int clicks) { //метод для склонения "раз" при отображения счета
        String textRet = "Кнопка нажата " + String.valueOf(clicks) + " раз";
        clicks = clicks < 0 ? clicks * -1 : clicks; //получение модуля количества кликов
        char decimals = clicks < 10 ? '0' : String.valueOf(clicks).charAt(String.valueOf(clicks).length()-2); //количество десятков. Необходимо для корректного склонения "раз" при значениях он 10-19
        char lastChar = String.valueOf(clicks).charAt(String.valueOf(clicks).length()-1); //Последний символ. Определяет склонение "раз"
        if (decimals != '1'){ //если количество десятков 10-19, то остается "раз"б иначе:
            switch (lastChar){//при следующих значениях становится "раза"
                case '2':
                case '3':
                case '4':
                    textRet += "а";
                    break;
            }
        }
        return textRet; //Возвращает готовую строку с правильным склонением
    }
}
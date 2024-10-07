package com.example.toymodel_store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.util.Log;
public class Main_Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy_gandam);


        Intent intent = getIntent();
        String Detail_NAME = intent.getStringExtra("Detail_NAME");
        String Detail_IMGE = intent.getStringExtra("Detail_IMGE");
        String Detail_PRICE = intent.getStringExtra("Detail_PRICE");
        String Details_Data = intent.getStringExtra("Details_Data");


        ImageView imageView = (ImageView) findViewById(R.id.imageView6);
        switch (Detail_IMGE){
            case "rx782": imageView.setImageResource(R.drawable.rx7821); break;
            case "RED FRAME": imageView.setImageResource(R.drawable.redframe1); break;
            case "KSHATRIYA": imageView.setImageResource(R.drawable.kshatriya1); break;
            case "UNLEASHED": imageView.setImageResource(R.drawable.unleashed1); break;
            case "SAZABI": imageView.setImageResource(R.drawable.sazabi1); break;
            case "saber": imageView.setImageResource(R.drawable.saber1); break;
            case "Jeanne": imageView.setImageResource(R.drawable.jeanne1); break;
            case "Wakamo": imageView.setImageResource(R.drawable.wakamo1); break;
            case "Gojo": imageView.setImageResource(R.drawable.gojo1); break;
            case "Guts": imageView.setImageResource(R.drawable.berserker1); break;
            default: imageView.setImageResource(R.drawable.gundam);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView7);
        switch (Detail_IMGE){
            case "rx782": imageView2.setImageResource(R.drawable.rx7822); break;
            case "RED FRAME": imageView2.setImageResource(R.drawable.redframe2); break;
            case "KSHATRIYA": imageView2.setImageResource(R.drawable.kshatriya2); break;
            case "UNLEASHED": imageView2.setImageResource(R.drawable.unleashed2); break;
            case "SAZABI": imageView2.setImageResource(R.drawable.sazabi2); break;
            case "saber": imageView2.setImageResource(R.drawable.saber2); break;
            case "Jeanne": imageView2.setImageResource(R.drawable.jeanne2); break;
            case "Wakamo": imageView2.setImageResource(R.drawable.wakamo2); break;
            case "Gojo": imageView2.setImageResource(R.drawable.gojo2); break;
            case "Guts": imageView2.setImageResource(R.drawable.berserker2); break;
            default: imageView2.setImageResource(R.drawable.gundam);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView8);
        switch (Detail_IMGE){
            case "rx782": imageView3.setImageResource(R.drawable.rx7823); break;
            case "RED FRAME": imageView3.setImageResource(R.drawable.redframe3); break;
            case "KSHATRIYA": imageView3.setImageResource(R.drawable.kshatriya3); break;
            case "UNLEASHED": imageView3.setImageResource(R.drawable.unleashed3); break;
            case "SAZABI": imageView3.setImageResource(R.drawable.sazabi3); break;
            case "saber": imageView3.setImageResource(R.drawable.saber3); break;
            case "Jeanne": imageView3.setImageResource(R.drawable.jeanne3); break;
            case "Wakamo": imageView3.setImageResource(R.drawable.wakamo3); break;
            case "Gojo": imageView3.setImageResource(R.drawable.gojo3); break;
            case "Guts": imageView3.setImageResource(R.drawable.berserker3); break;
            default: imageView3.setImageResource(R.drawable.gundam);
        }






        TextView textView1 = (TextView) findViewById(R.id.textView);
        textView1.setText("PRICE :" + " " + Detail_PRICE);
        TextView textView2 = (TextView) findViewById(R.id.textView5);
        textView2.setText(Detail_NAME);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText("รายละเอียด :\n" +
                Details_Data);

        Button backButton = findViewById(R.id.backbutton2);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        Button buttonShowText = findViewById(R.id.buttonShowText);
        TextView textViewMessage = findViewById(R.id.textViewMessage);

        buttonShowText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewMessage.setText("ขอบคุณที่สั่งซื้อ :)");
            }
        });


    }
}
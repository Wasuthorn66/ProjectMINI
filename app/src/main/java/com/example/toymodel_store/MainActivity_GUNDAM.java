package com.example.toymodel_store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity_GUNDAM extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_gundam);

        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_GUNDAM.this, Main_Detail.class);
                intent.putExtra("Detail_NAME", "MG RX-78-2 GUNDAM VER 3.0");
                intent.putExtra("Detail_IMGE", "rx782");
                intent.putExtra("Detail_PRICE", "1,530.00 บาท");
                intent.putExtra("Details_Data","BRAND : BANDAI\n" +
                        "ORIGIN : JAPAN\n" +
                        "PRODUCT TYPE : GUNPLA PLASTIC MODEL KIT\n" +
                        "MODEL SCALE ขนาด : 1/100\n" +
                        "MODEL HEIGHT ความสูง : ≥ 18 CM\n" +
                        "MODEL KIT CONTAINS\n" +
                        "GUNDAM MODEL X 1\n" +
                        "STICKER\n" +
                        "VCA GUNDAM THAILAND");
                startActivity(intent);
            }
        });

        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_GUNDAM.this, Main_Detail.class);
                intent.putExtra("Detail_NAME", "HG NZ-666 KSHATRIYA");
                intent.putExtra("Detail_IMGE", "KSHATRIYA");
                intent.putExtra("Detail_PRICE", "1,530.00 บาท");
                intent.putExtra("Details_Data","BRAND : BANDAI\n" +
                        "ORIGIN : JAPAN\n" +
                        "PRODUCT TYPE : GUNPLA PLASTIC MODEL KIT\n" +
                        "MODEL SCALE ขนาด : 1/144\n" +
                        "MODEL HEIGHT ความสูง : ≥ 15.5 CM\n" +
                        "MODEL KIT CONTAINS\n" +
                        "GUNDAM MODEL X 1\n" +
                        "STICKER\n" +
                        "VCA GUNDAM THAILAND");
                startActivity(intent);
            }
        });
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity_GUNDAM.this, Main_Detail.class);
                intent.putExtra("Detail_NAME", "HIRM GUNDAM ASTRAY RED FRAME POWERED RED");
                intent.putExtra("Detail_IMGE", "RED FRAME");
                intent.putExtra("Detail_PRICE", "5,440.00 บาท");
                intent.putExtra("Details_Data","BRAND : BANDAI\n" +
                        "ORIGIN : JAPAN\n" +
                        "PRODUCT TYPE : GUNPLA PLASTIC MODEL KIT\n" +
                        "MODEL SCALE ขนาด : 1/100\n" +
                        "MODEL HEIGHT ความสูง : ≥ 18 CM\n" +
                        "MODEL KIT CONTAINS\n" +
                        "GUNDAM MODEL X 1\n" +
                        "STICKER\n" +
                        "VCA GUNDAM THAILAND");
                startActivity(intent);
            }
        });
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity_GUNDAM.this, Main_Detail.class);
                intent.putExtra("Detail_NAME", "PG UNLEASHED RX-78-2 GUNDAM (40TH ANNIVERSARY VER)");
                intent.putExtra("Detail_IMGE", "UNLEASHED");
                intent.putExtra("Detail_PRICE", "10,450.00 บาท");
                intent.putExtra("Details_Data","BRAND : BANDAI\n" +
                        "ORIGIN : JAPAN\n" +
                        "PRODUCT TYPE : GUNPLA PLASTIC MODEL KIT\n" +
                        "MODEL SCALE ขนาด : 1/60\n" +
                        "MODEL HEIGHT ความสูง : ≥ 30 CM\n" +
                        "MODEL KIT CONTAINS\n" +
                        "GUNDAM MODEL X 1\n" +
                        "STICKER\n" +
                        "VCA GUNDAM THAILAND");
                startActivity(intent);
            }
        });
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity_GUNDAM.this, Main_Detail.class);
                intent.putExtra("Detail_NAME", "RG MSN-04 SAZABI");
                intent.putExtra("Detail_IMGE", "SAZABI");
                intent.putExtra("Detail_PRICE", "1,530.00 บาท");
                intent.putExtra("Details_Data","BRAND : BANDAI\n" +
                        "ORIGIN : JAPAN\n" +
                        "PRODUCT TYPE : GUNPLA PLASTIC MODEL KIT\n" +
                        "MODEL SCALE ขนาด : 1/144\n" +
                        "MODEL HEIGHT ความสูง : ≥ 15 CM\n" +
                        "MODEL KIT CONTAINS\n" +
                        "GUNDAM MODEL X 1\n" +
                        "STICKER\n" +
                        "VCA GUNDAM THAILAND");
                startActivity(intent);
            }
        });
        Button backButton = findViewById(R.id.backbutton1);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}

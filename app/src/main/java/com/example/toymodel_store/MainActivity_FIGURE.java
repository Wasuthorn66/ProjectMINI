package com.example.toymodel_store;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity_FIGURE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_figure);

        ImageView imageView1 = (ImageView) findViewById(R.id.imageView9);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_FIGURE.this, Main_Detail.class);
                intent.putExtra("Detail_NAME", "Fate / Grand Order Saber Altria Pendragon 1/7 scale figure");
                intent.putExtra("Detail_IMGE", "saber");
                intent.putExtra("Detail_PRICE", "8,900.00 บาท");
                intent.putExtra("Details_Data",
                        "รหัสสินค้า :38233\n" +
                        "สถานะ :สินค้าหมด\n" +
                        "หมวดสินค้า :Anime Figure (M)\n" +
                        "ผู้ผลิต :ANIPLEX\n" +
                        "ขนาด :1/7\n" +
                        "วันผลิตเสร็จ :สค. 2021");
                startActivity(intent);
            }
        });

        ImageView imageView2 = (ImageView) findViewById(R.id.imageView10);

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_FIGURE.this, Main_Detail.class);
                intent.putExtra("Detail_NAME", "Fate/Grand Order Avenger/Jeanne d'Arc [Alter] 1/7 Complete Figure");
                intent.putExtra("Detail_IMGE", "Jeanne");
                intent.putExtra("Detail_PRICE", "10,500.00 บาท");
                intent.putExtra("Details_Data",
                        "รหัสสินค้า :60496\n" +
                        "สถานะ :สินค้าหมด\n" +
                        "หมวดสินค้า :Anime Figure (M)\n" +
                        "ผู้ผลิต :ALTER\n" +
                        "ขนาด :1/7 (430mm)\n" +
                        "วันผลิตเสร็จ :มค. 2022");
                startActivity(intent);
            }
        });
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView11);

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity_FIGURE.this, Main_Detail.class);
                intent.putExtra("Detail_NAME", "Blue Archive - Wakamo 1/7");
                intent.putExtra("Detail_IMGE", "Wakamo");
                intent.putExtra("Detail_PRICE", "7,800.00 บาท");
                intent.putExtra("Details_Data",
                        "รหัสสินค้า :103547\n" +
                        "สถานะ :จองเต็ม\n" +
                        "หมวดสินค้า :Anime Figure (M)\n" +
                        "ผู้ผลิต :Neonmax\n" +
                        "ขนาด :1/7 (25cm)\n" +
                        "วันผลิตเสร็จ :กค. 2024\n" +
                        "รับจองถึงวันที่ :28 พย. 2023");
                startActivity(intent);
            }
        });
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView12);

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity_FIGURE.this, Main_Detail.class);
                intent.putExtra("Detail_NAME", "Gojo Satoru - Jujutsu Kaisen (FengYun Studio)");
                intent.putExtra("Detail_IMGE", "Gojo");
                intent.putExtra("Detail_PRICE", "10,650.00 บาท");
                intent.putExtra("Details_Data",
                        "รหัสสินค้า :118155\n" +
                        "สถานะ :สินค้าหมด\n" +
                        "หมวดสินค้า :Anime Figure (M)\n" +
                        "ผู้ผลิต :FengYun Studio\n" +
                        "ขนาด :1/6 (H40 x W40 x D40 cm)\n" +
                        "วันผลิตเสร็จ :มีค. 2025");
                startActivity(intent);
            }
        });
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView13);

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity_FIGURE.this, Main_Detail.class);
                intent.putExtra("Detail_NAME", "POP UP PARADE Berserk Guts [Berserker Armor] L size (Max Factory)");
                intent.putExtra("Detail_IMGE", "Guts");
                intent.putExtra("Detail_PRICE", "2,790.00 บาท");
                intent.putExtra("Details_Data",
                        "รหัสสินค้า :101644\n" +
                        "สถานะ :จองเต็ม\n" +
                        "หมวดสินค้า :Anime Figure (M)\n" +
                        "ผู้ผลิต :Max Factory\n" +
                        "ขนาด :280mm\n" +
                        "วันผลิตเสร็จ :กย. 2024\n" +
                        "รับจองถึงวันที่ :25 มีค. 2024");
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
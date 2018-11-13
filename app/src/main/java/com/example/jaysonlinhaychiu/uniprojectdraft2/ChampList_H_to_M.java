package com.example.jaysonlinhaychiu.uniprojectdraft2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class ChampList_H_to_M extends AppCompatActivity {

    static String champion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_champ_list__h_to__m);

        ImageButton hecarimTipsBtn = findViewById(R.id.hecarimTipsBtn);
        hecarimTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "hecarim";
            }

        });

        ImageButton heimerdingerTipsBtn = findViewById(R.id.heimerdingerTipsBtn);
        heimerdingerTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "heimerdinger";
            }

        });
        ImageButton illaoiTipsBtn = findViewById(R.id.illaoiTipsBtn);
        illaoiTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "illaoi";
            }

        });
        ImageButton ireliaTipsBtn = findViewById(R.id.ireliaTipsBtn);
        ireliaTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "irelia";
            }

        });
        ImageButton ivernTipsBtn = findViewById(R.id.ivernTipsBtn);
        ivernTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "ivern";
            }

        });
        ImageButton jannaTipsBtn = findViewById(R.id.jannaTipsBtn);
        jannaTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "janna";
            }

        });
        ImageButton jarvanTipsBtn = findViewById(R.id.jarvanTipsBtn);
        jarvanTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "jarvan";
            }

        });
        ImageButton jaxTipsBtn = findViewById(R.id.jaxTipsBtn);
        jaxTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "jax";
            }

        });
        ImageButton jayceTipsBtn = findViewById(R.id.jayceTipsBtn);
        jayceTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "jayce";
            }

        });
        ImageButton jhinTipsBtn = findViewById(R.id.jhinTipsBtn);
        jhinTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "jhin";
            }

        });
        ImageButton jinxTipsBtn = findViewById(R.id.jinxTipsBtn);
        jinxTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "jinx";
            }

        });
        ImageButton kaisaTipsBtn = findViewById(R.id.kaisaTipsBtn);
        kaisaTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "kaisa";
            }

        });
        ImageButton kalistaTipsBtn = findViewById(R.id.kalistaTipsBtn);
        kalistaTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "kalista";
            }

        });
        ImageButton karmaTipsBtn = findViewById(R.id.karmaTipsBtn);
        karmaTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "karma";
            }

        });
        ImageButton karthusTipsBtn = findViewById(R.id.karthusTipsBtn);
        karthusTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "karthus";
            }

        });
        ImageButton kassadinTipsBtn = findViewById(R.id.kassadinTipsBtn);
        kassadinTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "kassadin";
            }

        });
        ImageButton katarinaTipsBtn = findViewById(R.id.katarinaTipsBtn);
        katarinaTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "katarina";
            }

        });
        ImageButton kayleTipsBtn = findViewById(R.id.kayleTipsBtn);
        kayleTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "kayle";
            }

        });
        ImageButton kaynTipsBtn = findViewById(R.id.kaynTipsBtn);
        kaynTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "kayn";
            }

        });
        ImageButton kennenTipsBtn = findViewById(R.id.kennenTipsBtn);
        kennenTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "kennen";
            }

        });
        ImageButton khazixTipsBtn = findViewById(R.id.khazixTipsBtn);
        khazixTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "khazix";
            }

        });
        ImageButton kindredTipsBtn = findViewById(R.id.kindredTipsBtn);
        kindredTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "kindred";
            }

        });
        ImageButton kledTipsBtn = findViewById(R.id.kledTipsBtn);
        kledTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "kled";
            }

        });
        ImageButton kogmawTipsBtn = findViewById(R.id.kogmawTipsBtn);
        kogmawTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "kogmaw";
            }

        });
        ImageButton leblancTipsBtn = findViewById(R.id.leblancTipsBtn);
        leblancTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "leblanc";
            }

        });
        ImageButton leesinTipsBtn = findViewById(R.id.leesinTipsBtn);
        leesinTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "leesin";
            }

        });
        ImageButton leonaTipsBtn = findViewById(R.id.leonaTipsBtn);
        leonaTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "leona";
            }

        });
        ImageButton lissandraTipsBtn = findViewById(R.id.lissandraTipsBtn);
        lissandraTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "lissandra";
            }

        });
        ImageButton lucianTipsBtn = findViewById(R.id.lucianTipsBtn);
        lucianTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "lucian";
            }

        });
        ImageButton luluTipsBtn = findViewById(R.id.luluTipsBtn);
        luluTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "lulu";
            }

        });
        ImageButton luxTipsBtn = findViewById(R.id.luxTipsBtn);
        luxTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "lux";
            }

        });
        ImageButton malphiteTipsBtn = findViewById(R.id.malphiteTipsBtn);
        malphiteTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "malphite";
            }

        });
        ImageButton malzaharTipsBtn = findViewById(R.id.malzaharTipsBtn);
        malzaharTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "malzahar";
            }

        });
        ImageButton maokaiTipsBtn = findViewById(R.id.maokaiTipsBtn);
        maokaiTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "maokai";
            }

        });
        ImageButton masteryiTipsBtn = findViewById(R.id.masteryiTipsBtn);
        masteryiTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "masteryi";
            }

        });
        ImageButton missfortuneTipsBtn = findViewById(R.id.missfortuneTipsBtn);
        missfortuneTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "missfortune";
            }

        });
        ImageButton mordekaiserTipsBtn = findViewById(R.id.mordekaiserTipsBtn);
        mordekaiserTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "mordekaiser";
            }

        });
        ImageButton morganaTipsBtn = findViewById(R.id.morganaTipsBtn);
        morganaTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity2.class);
                startActivity(startIntent);
                champion = "morgana";
            }

        });
    }
}

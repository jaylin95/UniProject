package com.example.jaysonlinhaychiu.uniprojectdraft2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class ChampList_N_To_S extends AppCompatActivity {

    static String champion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_champ_list__n__to__s);

        ImageButton namiTipsBtn = findViewById(R.id.namiTipsBtn);
        namiTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "nami";
            }

        });
        ImageButton nasusTipsBtn = findViewById(R.id.nasusTipsBtn);
        nasusTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "nasus";
            }

        });
        ImageButton nautilusTipsBtn = findViewById(R.id.nautilusTipsBtn);
        nautilusTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "nautilus";
            }

        });
        ImageButton nidaleeTipsBtn = findViewById(R.id.nidaleeTipsBtn);
        nidaleeTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "nidalee";
            }

        });
        ImageButton nocturneTipsBtn = findViewById(R.id.nocturneTipsBtn);
        nocturneTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "nocturne";
            }

        });
        ImageButton nunuTipsBtn = findViewById(R.id.nunuTipsBtn);
        nunuTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "nunu";
            }

        });
        ImageButton olafTipsBtn = findViewById(R.id.olafTipsBtn);
        olafTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "olaf";
            }

        });
        ImageButton oriannaTipsBtn = findViewById(R.id.oriannaTipsBtn);
        oriannaTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "orianna";
            }

        });
        ImageButton ornnTipsBtn = findViewById(R.id.ornnTipsBtn);
        ornnTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "ornn";
            }

        });
        ImageButton pantheonTipsBtn = findViewById(R.id.pantheonTipsBtn);
        pantheonTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "pantheon";
            }

        });
        ImageButton poppyTipsBtn = findViewById(R.id.poppyTipsBtn);
        poppyTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "poppy";
            }

        });
        ImageButton quinnTipsBtn = findViewById(R.id.quinnTipsBtn);
        quinnTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "quinn";
            }

        });
        ImageButton rakanTipsBtn = findViewById(R.id.rakanTipsBtn);
        rakanTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "rakan";
            }

        });
        ImageButton rammusTipsBtn = findViewById(R.id.rammusTipsBtn);
        rammusTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "rammus";
            }

        });
        ImageButton reksaiTipsBtn = findViewById(R.id.reksaiTipsBtn);
        reksaiTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "reksai";
            }

        });
        ImageButton renektonTipsBtn = findViewById(R.id.renektonTipsBtn);
        renektonTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "renekton";
            }

        });
        ImageButton rengarTipsBtn = findViewById(R.id.rengarTipsBtn);
        rengarTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "rengar";
            }

        });
        ImageButton rivenTipsBtn = findViewById(R.id.rivenTipsBtn);
        rivenTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "riven";
            }

        });
        ImageButton rumbleTipsBtn = findViewById(R.id.rumbleTipsBtn);
        rumbleTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "rumble";
            }

        });
        ImageButton ryzeTipsBtn = findViewById(R.id.ryzeTipsBtn);
        ryzeTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "ryze";
            }

        });
        ImageButton sejuaniTipsBtn = findViewById(R.id.sejuaniTipsBtn);
        sejuaniTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "sejuani";
            }

        });
        ImageButton shacoTipsBtn = findViewById(R.id.shacoTipsBtn);
        shacoTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "shaco";
            }

        });
        ImageButton shenTipsBtn = findViewById(R.id.shenTipsBtn);
        shenTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "shen";
            }

        });
        ImageButton shyvanaTipsBtn = findViewById(R.id.shyvanaTipsBtn);
        shyvanaTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "shyvana";
            }

        });
        ImageButton singedTipsBtn = findViewById(R.id.singedTipsBtn);
        singedTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "singed";
            }

        });
        ImageButton sionTipsBtn = findViewById(R.id.sionTipsBtn);
        sionTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "sion";
            }

        });
        ImageButton sivirTipsBtn = findViewById(R.id.sivirTipsBtn);
        sivirTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "sivir";
            }

        });
        ImageButton skarnerTipsBtn = findViewById(R.id.skarnerTipsBtn);
        skarnerTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "skarner";
            }

        });
        ImageButton sonaTipsBtn = findViewById(R.id.sonaTipsBtn);
        sonaTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "sona";
            }

        });
        ImageButton sorakaTipsBtn = findViewById(R.id.sorakaTipsBtn);
        sorakaTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "soraka";
            }

        });
        ImageButton swainTipsBtn = findViewById(R.id.swainTipsBtn);
        swainTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "swain";
            }

        });
        ImageButton syndraTipsBtn = findViewById(R.id.syndraTipsBtn);
        syndraTipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TipsAndTricksActivity3.class);
                startActivity(startIntent);
                champion = "syndra";
            }

        });
    }
}

package com.example.jaysonlinhaychiu.uniprojectdraft2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class TipsAndTricksActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips_and_tricks3);
        ImageView champIconPlaceholder = findViewById(R.id.champIconPlaceholder);
        TextView champTitle = findViewById(R.id.champTitle);
        TextView tipsAndTricksText = findViewById(R.id.tipsAndTricksText);

        switch (ChampList_N_To_S.champion) {
            case "nami":
                champIconPlaceholder.setImageResource(R.drawable.nami_square);
                champTitle.setText(R.string.nami_title);
                tipsAndTricksText.setText(R.string.nami_tips);

                break;
            case "nasus":
                champIconPlaceholder.setImageResource(R.drawable.nasus_square);
                champTitle.setText(R.string.nasus_title);
                tipsAndTricksText.setText(R.string.nasus_tips);

                break;
            case "nautilus":
                champIconPlaceholder.setImageResource(R.drawable.nautilus_square);
                champTitle.setText(R.string.nautilus_title);
                tipsAndTricksText.setText(R.string.nautilus_tips);

                break;
            case "nidalee":
                champIconPlaceholder.setImageResource(R.drawable.nidalee_square);
                champTitle.setText(R.string.nidalee_title);
                tipsAndTricksText.setText(R.string.nidalee_tips);

                break;
            case "nocturne":
                champIconPlaceholder.setImageResource(R.drawable.nocturne_square);
                champTitle.setText(R.string.nocturne_title);
                tipsAndTricksText.setText(R.string.nocturne_tips);

                break;
            case "nunu":
                champIconPlaceholder.setImageResource(R.drawable.nunu_square);
                champTitle.setText(R.string.nunu_title);
                tipsAndTricksText.setText(R.string.nunu_tips);

                break;
            case "olaf":
                champIconPlaceholder.setImageResource(R.drawable.olaf_square);
                champTitle.setText(R.string.olaf_title);
                tipsAndTricksText.setText(R.string.olaf_tips);

                break;
            case "orianna":
                champIconPlaceholder.setImageResource(R.drawable.orianna_square);
                champTitle.setText(R.string.orianna_title);
                tipsAndTricksText.setText(R.string.orianna_tips);

                break;
            case "ornn":
                champIconPlaceholder.setImageResource(R.drawable.ornn_square);
                champTitle.setText(R.string.ornn_title);
                tipsAndTricksText.setText(R.string.ornn_tips);

                break;
            case "pantheon":
                champIconPlaceholder.setImageResource(R.drawable.pantheon_square);
                champTitle.setText(R.string.pantheon_title);
                tipsAndTricksText.setText(R.string.pantheon_tips);

                break;
            case "poppy":
                champIconPlaceholder.setImageResource(R.drawable.poppy_square);
                champTitle.setText(R.string.poppy_title);
                tipsAndTricksText.setText(R.string.poppy_tips);

                break;
            case "quinn":
                champIconPlaceholder.setImageResource(R.drawable.quinn_square);
                champTitle.setText(R.string.quinn_title);
                tipsAndTricksText.setText(R.string.quinn_tips);

                break;
            case "rakan":
                champIconPlaceholder.setImageResource(R.drawable.rakan_square);
                champTitle.setText(R.string.rakan_title);
                tipsAndTricksText.setText(R.string.rakan_tips);

                break;
            case "rammus":
                champIconPlaceholder.setImageResource(R.drawable.rammus_square);
                champTitle.setText(R.string.rammus_title);
                tipsAndTricksText.setText(R.string.rammus_tips);

                break;
            case "reksai":
                champIconPlaceholder.setImageResource(R.drawable.reksai_square);
                champTitle.setText(R.string.reksai_title);
                tipsAndTricksText.setText(R.string.reksai_tips);

                break;
            case "renekton":
                champIconPlaceholder.setImageResource(R.drawable.renekton_square);
                champTitle.setText(R.string.renekton_title);
                tipsAndTricksText.setText(R.string.renekton_tips);

                break;
            case "rengar":
                champIconPlaceholder.setImageResource(R.drawable.rengar_square);
                champTitle.setText(R.string.rengar_title);
                tipsAndTricksText.setText(R.string.rengar_tips);

                break;
            case "riven":
                champIconPlaceholder.setImageResource(R.drawable.riven_square);
                champTitle.setText(R.string.riven_title);
                tipsAndTricksText.setText(R.string.riven_tips);

                break;
            case "rumble":
                champIconPlaceholder.setImageResource(R.drawable.rumble_square);
                champTitle.setText(R.string.rumble_title);
                tipsAndTricksText.setText(R.string.rumble_tips);

                break;
            case "ryze":
                champIconPlaceholder.setImageResource(R.drawable.ryze_square);
                champTitle.setText(R.string.ryze_title);
                tipsAndTricksText.setText(R.string.ryze_tips);

                break;
            case "sejuani":
                champIconPlaceholder.setImageResource(R.drawable.sejuani_square);
                champTitle.setText(R.string.sejuani_title);
                tipsAndTricksText.setText(R.string.sejuani_tips);

                break;
            case "shaco":
                champIconPlaceholder.setImageResource(R.drawable.shaco_square);
                champTitle.setText(R.string.shaco_title);
                tipsAndTricksText.setText(R.string.shaco_tips);

                break;
            case "shen":
                champIconPlaceholder.setImageResource(R.drawable.shen_square);
                champTitle.setText(R.string.shen_title);
                tipsAndTricksText.setText(R.string.shen_tips);

                break;
            case "shyvana":
                champIconPlaceholder.setImageResource(R.drawable.shyvana_square);
                champTitle.setText(R.string.shyvana_title);
                tipsAndTricksText.setText(R.string.shyvana_tips);

                break;
            case "singed":
                champIconPlaceholder.setImageResource(R.drawable.singed_square);
                champTitle.setText(R.string.singed_title);
                tipsAndTricksText.setText(R.string.singed_tips);

                break;
            case "sion":
                champIconPlaceholder.setImageResource(R.drawable.sion_square);
                champTitle.setText(R.string.sion_title);
                tipsAndTricksText.setText(R.string.sion_tips);

                break;
            case "sivir":
                champIconPlaceholder.setImageResource(R.drawable.sivir_square);
                champTitle.setText(R.string.sivir_title);
                tipsAndTricksText.setText(R.string.sivir_tips);

                break;
            case "skarner":
                champIconPlaceholder.setImageResource(R.drawable.skarner_square);
                champTitle.setText(R.string.skarner_title);
                tipsAndTricksText.setText(R.string.skarner_tips);

                break;
            case "sona":
                champIconPlaceholder.setImageResource(R.drawable.sona_square);
                champTitle.setText(R.string.sona_title);
                tipsAndTricksText.setText(R.string.sona_tips);

                break;
            case "soraka":
                champIconPlaceholder.setImageResource(R.drawable.soraka_square);
                champTitle.setText(R.string.soraka_title);
                tipsAndTricksText.setText(R.string.soraka_tips);

                break;
            case "swain":
                champIconPlaceholder.setImageResource(R.drawable.swain_square);
                champTitle.setText(R.string.swain_title);
                tipsAndTricksText.setText(R.string.swain_tips);

                break;
            case "syndra":
                champIconPlaceholder.setImageResource(R.drawable.syndra_square);
                champTitle.setText(R.string.syndra_title);
                tipsAndTricksText.setText(R.string.syndra_tips);

                break;
        }
    }
}

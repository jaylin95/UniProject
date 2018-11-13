package com.example.jaysonlinhaychiu.uniprojectdraft2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class TipsAndTricksActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips_and_tricks);
        ImageView champIconPlaceholder = findViewById(R.id.champIconPlaceholder);
        TextView champTitle = findViewById(R.id.champTitle);
        TextView tipsAndTricksText = findViewById(R.id.tipsAndTricksText);


        switch (ChampList_A_to_G.champion) {
            case "aatrox":
                champIconPlaceholder.setImageResource(R.drawable.aatrox_square);
                champTitle.setText(R.string.aatrox_title);
                tipsAndTricksText.setText(R.string.aatrox_tips);

                break;
            case "ahri":
                champIconPlaceholder.setImageResource(R.drawable.ahri_square);
                champTitle.setText(R.string.ahri_title);
                tipsAndTricksText.setText(R.string.ahri_tips);
                break;
            case "akali":
                champIconPlaceholder.setImageResource(R.drawable.akali_square);
                champTitle.setText(R.string.akali_title);
                tipsAndTricksText.setText(R.string.akali_tips);
                break;
            case "alistar":
                champIconPlaceholder.setImageResource(R.drawable.alistar_square);
                champTitle.setText(R.string.alistar_title);
                tipsAndTricksText.setText(R.string.alistar_tips);
                break;
            case "amumu":
                champIconPlaceholder.setImageResource(R.drawable.amumu_square);
                champTitle.setText(R.string.amumu_title);
                tipsAndTricksText.setText(R.string.amumu_tips);
                break;
            case "anivia":
                champIconPlaceholder.setImageResource(R.drawable.anivia_square);
                champTitle.setText(R.string.anivia_title);
                tipsAndTricksText.setText(R.string.anivia_tips);
                break;
            case "annie":
                champIconPlaceholder.setImageResource(R.drawable.annie_square);
                champTitle.setText(R.string.annie_title);
                tipsAndTricksText.setText(R.string.annie_tips);
                break;
            case "ashe":
                champIconPlaceholder.setImageResource(R.drawable.ashe_square);
                champTitle.setText(R.string.ashe_title);
                tipsAndTricksText.setText(R.string.ashe_tips);
                break;
            case "aurelion":
                champIconPlaceholder.setImageResource(R.drawable.aurelion_square);
                champTitle.setText(R.string.aurelion_sol_title);
                tipsAndTricksText.setText(R.string.aurelion_tips);
                break;
            case "azir":
                champIconPlaceholder.setImageResource(R.drawable.azir_square);
                champTitle.setText(R.string.azir_title);
                tipsAndTricksText.setText(R.string.azir_tips);
                break;
            case "bard":
                champIconPlaceholder.setImageResource(R.drawable.bard_square);
                champTitle.setText(R.string.bard_title);
                tipsAndTricksText.setText(R.string.bard_tips);
                break;
            case "blitzcrank":
                champIconPlaceholder.setImageResource(R.drawable.blitzcrank_square);
                champTitle.setText(R.string.blitzcrank_title);
                tipsAndTricksText.setText(R.string.blitzcrank_tips);
                break;
            case "brand":
                champIconPlaceholder.setImageResource(R.drawable.brand_square);
                champTitle.setText(R.string.brand_title);
                tipsAndTricksText.setText(R.string.brand_tips);
                break;
            case "braum":
                champIconPlaceholder.setImageResource(R.drawable.braum_square);
                champTitle.setText(R.string.braum_title);
                tipsAndTricksText.setText(R.string.braum_tips);
                break;
            case "caitlyn":
                champIconPlaceholder.setImageResource(R.drawable.caitlyn_square);
                champTitle.setText(R.string.caitlyn_title);
                tipsAndTricksText.setText(R.string.caitlyn_tips);
                break;
            case "camille":
                champIconPlaceholder.setImageResource(R.drawable.camille_square);
                champTitle.setText(R.string.camille_title);
                tipsAndTricksText.setText(R.string.camille_tips);
                break;
            case "cassiopeia":
                champIconPlaceholder.setImageResource(R.drawable.cassiopeia_square);
                champTitle.setText(R.string.cassiopeia_title);
                tipsAndTricksText.setText(R.string.cassiopeia_tips);
                break;
            case "chogath":
                champIconPlaceholder.setImageResource(R.drawable.chogath_square);
                champTitle.setText(R.string.cho_gath_title);
                tipsAndTricksText.setText(R.string.chogath_tips);
                break;
            case "corki":
                champIconPlaceholder.setImageResource(R.drawable.corki_square);
                champTitle.setText(R.string.corki_title);
                tipsAndTricksText.setText(R.string.corki_tips);
                break;
            case "darius":
                champIconPlaceholder.setImageResource(R.drawable.darius_square);
                champTitle.setText(R.string.darius_title);
                tipsAndTricksText.setText(R.string.darius_tips);
                break;
            case "diana":
                champIconPlaceholder.setImageResource(R.drawable.diana_square);
                champTitle.setText(R.string.diana_title);
                tipsAndTricksText.setText(R.string.diana_tips);
                break;
            case "drmundo":
                champIconPlaceholder.setImageResource(R.drawable.dr_mundo_square);
                champTitle.setText(R.string.dr_mundo_title);
                tipsAndTricksText.setText(R.string.drmundo_tips);
                break;
            case "draven":
                champIconPlaceholder.setImageResource(R.drawable.draven_square);
                champTitle.setText(R.string.draven_title);
                tipsAndTricksText.setText(R.string.draven_tips);
                break;
            case "ekko":
                champIconPlaceholder.setImageResource(R.drawable.ekko_square);
                champTitle.setText(R.string.ekko_title);
                tipsAndTricksText.setText(R.string.ekko_tips);
                break;
            case "elise":
                champIconPlaceholder.setImageResource(R.drawable.elise_square);
                champTitle.setText(R.string.elise_title);
                tipsAndTricksText.setText(R.string.elise_tips);
                break;
            case "evelynn":
                champIconPlaceholder.setImageResource(R.drawable.evelynn_square);
                champTitle.setText(R.string.evelynn_title);
                tipsAndTricksText.setText(R.string.evelynn_tips);
                break;
            case "ezreal":
                champIconPlaceholder.setImageResource(R.drawable.ezreal_square);
                champTitle.setText(R.string.ezreal_title);
                tipsAndTricksText.setText(R.string.ezreal_tips);
                break;
            case "fiddlesticks":
                champIconPlaceholder.setImageResource(R.drawable.fiddlesticks_square);
                champTitle.setText(R.string.fiddlesticks_title);
                tipsAndTricksText.setText(R.string.fiddlesticks_tips);
                break;
            case "fiora":
                champIconPlaceholder.setImageResource(R.drawable.fiora_square);
                champTitle.setText(R.string.fiora_title);
                tipsAndTricksText.setText(R.string.fiora_tips);
                break;
            case "fizz":
                champIconPlaceholder.setImageResource(R.drawable.fizz_square);
                champTitle.setText(R.string.fizz_title);
                tipsAndTricksText.setText(R.string.fizz_tips);
                break;
            case "galio":
                champIconPlaceholder.setImageResource(R.drawable.galio_square);
                champTitle.setText(R.string.galio_title);
                tipsAndTricksText.setText(R.string.galio_tips);
                break;
            case "gangplank":
                champIconPlaceholder.setImageResource(R.drawable.gangplank_square);
                champTitle.setText(R.string.gangplank_title);
                tipsAndTricksText.setText(R.string.gangplank_tips);
                break;
            case "garen":
                champIconPlaceholder.setImageResource(R.drawable.garen_square);
                champTitle.setText(R.string.garen_title);
                tipsAndTricksText.setText(R.string.garen_tips);
                break;
            case "gnar":
                champIconPlaceholder.setImageResource(R.drawable.gnar_square);
                champTitle.setText(R.string.gnar_title);
                tipsAndTricksText.setText(R.string.gnar_tips);
                break;
            case "gragas":
                champIconPlaceholder.setImageResource(R.drawable.gragas_square);
                champTitle.setText(R.string.gragas_title);
                tipsAndTricksText.setText(R.string.gragas_tips);
                break;
            case "graves":
                champIconPlaceholder.setImageResource(R.drawable.graves_square);
                champTitle.setText(R.string.graves_title);
                tipsAndTricksText.setText(R.string.graves_tips);
                break;
        }





        }


    }

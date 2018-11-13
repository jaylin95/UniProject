package com.example.jaysonlinhaychiu.uniprojectdraft2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class TipsAndTricksActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips_and_tricks2);
        ImageView champIconPlaceholder = findViewById(R.id.champIconPlaceholder);
        TextView champTitle = findViewById(R.id.champTitle);
        TextView tipsAndTricksText = findViewById(R.id.tipsAndTricksText);

        switch (ChampList_H_to_M.champion) {
            case "hecarim":
                champIconPlaceholder.setImageResource(R.drawable.hecarim_square);
                champTitle.setText(R.string.hecarim_title);
                tipsAndTricksText.setText(R.string.hecarim_tips);

                break;
            case "heimerdinger":
                champIconPlaceholder.setImageResource(R.drawable.heimerdinger_square);
                champTitle.setText(R.string.heimerdinger_title);
                tipsAndTricksText.setText(R.string.heimerdinger_tips);

                break;
            case "illaoi":
                champIconPlaceholder.setImageResource(R.drawable.illaoi_square);
                champTitle.setText(R.string.illaoi_title);
                tipsAndTricksText.setText(R.string.illaoi_tips);

                break;
            case "irelia":
                champIconPlaceholder.setImageResource(R.drawable.irelia_square);
                champTitle.setText(R.string.irelia_title);
                tipsAndTricksText.setText(R.string.irelia_tips);

                break;
            case "ivern":
                champIconPlaceholder.setImageResource(R.drawable.ivern_square);
                champTitle.setText(R.string.ivern_title);
                tipsAndTricksText.setText(R.string.ivern_tips);

                break;
            case "janna":
                champIconPlaceholder.setImageResource(R.drawable.janna_square);
                champTitle.setText(R.string.janna_title);
                tipsAndTricksText.setText(R.string.janna_tips);

                break;
            case "jarvan":
                champIconPlaceholder.setImageResource(R.drawable.jarvan_square);
                champTitle.setText(R.string.jarvan_title);
                tipsAndTricksText.setText(R.string.jarvan_tips);

                break;
            case "jax":
                champIconPlaceholder.setImageResource(R.drawable.jax_square);
                champTitle.setText(R.string.jax_title);
                tipsAndTricksText.setText(R.string.jax_tips);

                break;
            case "jayce":
                champIconPlaceholder.setImageResource(R.drawable.jayce_square);
                champTitle.setText(R.string.jayce_title);
                tipsAndTricksText.setText(R.string.jayce_tips);

                break;
            case "jhin":
                champIconPlaceholder.setImageResource(R.drawable.jhin_square);
                champTitle.setText(R.string.jhin_title);
                tipsAndTricksText.setText(R.string.jhin_tips);

                break;
            case "jinx":
                champIconPlaceholder.setImageResource(R.drawable.jinx_square);
                champTitle.setText(R.string.jinx_title);
                tipsAndTricksText.setText(R.string.jinx_tips);

                break;
            case "kaisa":
                champIconPlaceholder.setImageResource(R.drawable.kaisa_square);
                champTitle.setText(R.string.kaisa_title);
                tipsAndTricksText.setText(R.string.kaisa_tips);

                break;
            case "kalista":
                champIconPlaceholder.setImageResource(R.drawable.kalista_square);
                champTitle.setText(R.string.kalista_title);
                tipsAndTricksText.setText(R.string.kalista_tips);

                break;
            case "karma":
                champIconPlaceholder.setImageResource(R.drawable.karma_square);
                champTitle.setText(R.string.karma_title);
                tipsAndTricksText.setText(R.string.karma_tips);

                break;
            case "karthus":
                champIconPlaceholder.setImageResource(R.drawable.karthus_square);
                champTitle.setText(R.string.karthus_title);
                tipsAndTricksText.setText(R.string.karthus_tips);

                break;
            case "kassadin":
                champIconPlaceholder.setImageResource(R.drawable.kassadin_square);
                champTitle.setText(R.string.kassadin_title);
                tipsAndTricksText.setText(R.string.kassadin_tips);

                break;
            case "katarina":
                champIconPlaceholder.setImageResource(R.drawable.katarina_square);
                champTitle.setText(R.string.katarina_title);
                tipsAndTricksText.setText(R.string.katarina_tips);

                break;
            case "kayle":
                champIconPlaceholder.setImageResource(R.drawable.kayle_square);
                champTitle.setText(R.string.kayle_title);
                tipsAndTricksText.setText(R.string.kayle_tips);

                break;
            case "kayn":
                champIconPlaceholder.setImageResource(R.drawable.kayn_square);
                champTitle.setText(R.string.kayn_title);
                tipsAndTricksText.setText(R.string.kayn_tips);

                break;
            case "kennen":
                champIconPlaceholder.setImageResource(R.drawable.kennen_square);
                champTitle.setText(R.string.kennen_title);
                tipsAndTricksText.setText(R.string.kennen_tips);

                break;
            case "khazix":
                champIconPlaceholder.setImageResource(R.drawable.khazix_square);
                champTitle.setText(R.string.khazix_title);
                tipsAndTricksText.setText(R.string.khazix_tips);

                break;
            case "kindred":
                champIconPlaceholder.setImageResource(R.drawable.kindred_square);
                champTitle.setText(R.string.kindred_title);
                tipsAndTricksText.setText(R.string.kindred_tips);

                break;
            case "kled":
                champIconPlaceholder.setImageResource(R.drawable.kled_square);
                champTitle.setText(R.string.kled_title);
                tipsAndTricksText.setText(R.string.kled_tips);

                break;
            case "kogmaw":
                champIconPlaceholder.setImageResource(R.drawable.kogmaw_square);
                champTitle.setText(R.string.kogmaw_title);
                tipsAndTricksText.setText(R.string.kogmaw_tips);

                break;
            case "leblanc":
                champIconPlaceholder.setImageResource(R.drawable.leblanc_square);
                champTitle.setText(R.string.leblanc_title);
                tipsAndTricksText.setText(R.string.leblanc_tips);

                break;
            case "leesin":
                champIconPlaceholder.setImageResource(R.drawable.leesin_square);
                champTitle.setText(R.string.leesin_title);
                tipsAndTricksText.setText(R.string.leesin_tips);

                break;
            case "leona":
                champIconPlaceholder.setImageResource(R.drawable.leona_square);
                champTitle.setText(R.string.leona_title);
                tipsAndTricksText.setText(R.string.leona_tips);

                break;
            case "lissandra":
                champIconPlaceholder.setImageResource(R.drawable.lissandra_square);
                champTitle.setText(R.string.lissandra_title);
                tipsAndTricksText.setText(R.string.lissandra_tips);

                break;
            case "lucian":
                champIconPlaceholder.setImageResource(R.drawable.lucian_square);
                champTitle.setText(R.string.lucian_title);
                tipsAndTricksText.setText(R.string.lucian_tips);

                break;
            case "lulu":
                champIconPlaceholder.setImageResource(R.drawable.lulu_square);
                champTitle.setText(R.string.lulu_title);
                tipsAndTricksText.setText(R.string.lulu_tips);

                break;
            case "lux":
                champIconPlaceholder.setImageResource(R.drawable.lux_square);
                champTitle.setText(R.string.lux_title);
                tipsAndTricksText.setText(R.string.lux_tips);

                break;
            case "malphite":
                champIconPlaceholder.setImageResource(R.drawable.malphite_square);
                champTitle.setText(R.string.malphite_title);
                tipsAndTricksText.setText(R.string.malphite_tips);

                break;
            case "malzahar":
                champIconPlaceholder.setImageResource(R.drawable.malzahar_square);
                champTitle.setText(R.string.malzahar_title);
                tipsAndTricksText.setText(R.string.malzahar_tips);

                break;
            case "maokai":
                champIconPlaceholder.setImageResource(R.drawable.maokai_square);
                champTitle.setText(R.string.maokai_title);
                tipsAndTricksText.setText(R.string.maokai_tips);

                break;
            case "masteryi":
                champIconPlaceholder.setImageResource(R.drawable.masteryi_square);
                champTitle.setText(R.string.masteryi_title);
                tipsAndTricksText.setText(R.string.masteryi_tips);

                break;
            case "missfortune":
                champIconPlaceholder.setImageResource(R.drawable.missfortune_square);
                champTitle.setText(R.string.missfortune_title);
                tipsAndTricksText.setText(R.string.missfortune_tips);

                break;
            case "mordekaiser":
                champIconPlaceholder.setImageResource(R.drawable.mordekaiser_square);
                champTitle.setText(R.string.mordekaiser_title);
                tipsAndTricksText.setText(R.string.mordekaiser_tips);

                break;
            case "morgana":
                champIconPlaceholder.setImageResource(R.drawable.morgana_square);
                champTitle.setText(R.string.morgana_title);
                tipsAndTricksText.setText(R.string.morgana_tips);

                break;
        }
    }
}

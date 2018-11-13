package com.example.jaysonlinhaychiu.uniprojectdraft2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class TipsAndTricksActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips_and_tricks4);
        ImageView champIconPlaceholder = findViewById(R.id.champIconPlaceholder);
        TextView champTitle = findViewById(R.id.champTitle);
        TextView tipsAndTricksText = findViewById(R.id.tipsAndTricksText);

        switch (ChampList_T_To_Z.champion) {
            case "tahmkench":
                champIconPlaceholder.setImageResource(R.drawable.tahmkench_square);
                champTitle.setText(R.string.tahmkench_title);
                tipsAndTricksText.setText(R.string.tahmkench_tips);

                break;
            case "taliyah":
                champIconPlaceholder.setImageResource(R.drawable.taliyah_square);
                champTitle.setText(R.string.taliyah_title);
                tipsAndTricksText.setText(R.string.taliyah_tips);

                break;
            case "talon":
                champIconPlaceholder.setImageResource(R.drawable.talon_square);
                champTitle.setText(R.string.talon_title);
                tipsAndTricksText.setText(R.string.talon_tips);


                break;
            case "taric":
                champIconPlaceholder.setImageResource(R.drawable.taric_square);
                champTitle.setText(R.string.taric_title);
                tipsAndTricksText.setText(R.string.taric_tips);

                break;
            case "teemo":
                champIconPlaceholder.setImageResource(R.drawable.teemo_square);
                champTitle.setText(R.string.teemo_title);
                tipsAndTricksText.setText(R.string.teemo_tips);

                break;
            case "thresh":
                champIconPlaceholder.setImageResource(R.drawable.thresh_square);
                champTitle.setText(R.string.thresh_title);
                tipsAndTricksText.setText(R.string.thresh_tips);

                break;
            case "tristana":
                champIconPlaceholder.setImageResource(R.drawable.tristana_square);
                champTitle.setText(R.string.tristana_title);
                tipsAndTricksText.setText(R.string.tristana_tips);

                break;
            case "trundle":
                champIconPlaceholder.setImageResource(R.drawable.trundle_square);
                champTitle.setText(R.string.trundle_title);
                tipsAndTricksText.setText(R.string.trundle_tips);

                break;
            case "tryndamere":
                champIconPlaceholder.setImageResource(R.drawable.tryndamere_square);
                champTitle.setText(R.string.tryndamere_title);
                tipsAndTricksText.setText(R.string.tryndamere_tips);

                break;
            case "twistedfate":
                champIconPlaceholder.setImageResource(R.drawable.twistedfate_square);
                champTitle.setText(R.string.twistedfate_title);
                tipsAndTricksText.setText(R.string.twistedfate_tips);

                break;
            case "twitch":
                champIconPlaceholder.setImageResource(R.drawable.twitch_square);
                champTitle.setText(R.string.twitch_title);
                tipsAndTricksText.setText(R.string.twitch_tips);

                break;
            case "udyr":
                champIconPlaceholder.setImageResource(R.drawable.udyr_square);
                champTitle.setText(R.string.udyr_title);
                tipsAndTricksText.setText(R.string.udyr_tips);

                break;
            case "urgot":
                champIconPlaceholder.setImageResource(R.drawable.urgot_square);
                champTitle.setText(R.string.urgot_title);
                tipsAndTricksText.setText(R.string.urgot_tips);

                break;
            case "varus":
                champIconPlaceholder.setImageResource(R.drawable.varus_square);
                champTitle.setText(R.string.varus_title);
                tipsAndTricksText.setText(R.string.varus_tips);

                break;
            case "vayne":
                champIconPlaceholder.setImageResource(R.drawable.vayne_square);
                champTitle.setText(R.string.vayne_title);
                tipsAndTricksText.setText(R.string.vayne_tips);

                break;
            case "veigar":
                champIconPlaceholder.setImageResource(R.drawable.veigar_square);
                champTitle.setText(R.string.veigar_title);
                tipsAndTricksText.setText(R.string.veigar_tips);

                break;
            case "velkoz":
                champIconPlaceholder.setImageResource(R.drawable.velkoz_square);
                champTitle.setText(R.string.velkoz_title);
                tipsAndTricksText.setText(R.string.velkoz_tips);

                break;
            case "vi":
                champIconPlaceholder.setImageResource(R.drawable.vi_square);
                champTitle.setText(R.string.vi_title);
                tipsAndTricksText.setText(R.string.vi_tips);

                break;
            case "viktor":
                champIconPlaceholder.setImageResource(R.drawable.viktor_square);
                champTitle.setText(R.string.viktor_title);
                tipsAndTricksText.setText(R.string.viktor_tips);

                break;
            case "vladimir":
                champIconPlaceholder.setImageResource(R.drawable.vladimir_square);
                champTitle.setText(R.string.vladimir_title);
                tipsAndTricksText.setText(R.string.vladimir_tips);

                break;
            case "volibear":
                champIconPlaceholder.setImageResource(R.drawable.volibear_square);
                champTitle.setText(R.string.volibear_title);
                tipsAndTricksText.setText(R.string.volibear_tips);

                break;
            case "warwick":
                champIconPlaceholder.setImageResource(R.drawable.warwick_square);
                champTitle.setText(R.string.warwick_title);
                tipsAndTricksText.setText(R.string.warwick_tips);

                break;
            case "wukong":
                champIconPlaceholder.setImageResource(R.drawable.wukong_square);
                champTitle.setText(R.string.wukong_title);
                tipsAndTricksText.setText(R.string.wukong_tips);

                break;
            case "xayah":
                champIconPlaceholder.setImageResource(R.drawable.xayah_square);
                champTitle.setText(R.string.xayah_title);
                tipsAndTricksText.setText(R.string.xayah_tips);

                break;
            case "xerath":
                champIconPlaceholder.setImageResource(R.drawable.xerath_square);
                champTitle.setText(R.string.xerath_title);
                tipsAndTricksText.setText(R.string.xerath_tips);

                break;
            case "xinzhao":
                champIconPlaceholder.setImageResource(R.drawable.xinzhao_square);
                champTitle.setText(R.string.xinzhao_title);
                tipsAndTricksText.setText(R.string.xinzhao_tips);

                break;
            case "yasuo":
                champIconPlaceholder.setImageResource(R.drawable.yasuo_square);
                champTitle.setText(R.string.yasuo_title);
                tipsAndTricksText.setText(R.string.yasuo_tips);

                break;
            case "yorick":
                champIconPlaceholder.setImageResource(R.drawable.yorick_square);
                champTitle.setText(R.string.yorick_title);
                tipsAndTricksText.setText(R.string.yorick_tips);

                break;
            case "zac":
                champIconPlaceholder.setImageResource(R.drawable.zac_square);
                champTitle.setText(R.string.zac_title);
                tipsAndTricksText.setText(R.string.zac_tips);

                break;
            case "zed":
                champIconPlaceholder.setImageResource(R.drawable.zed_square);
                champTitle.setText(R.string.zed_title);
                tipsAndTricksText.setText(R.string.zed_tips);

                break;
            case "ziggs":
                champIconPlaceholder.setImageResource(R.drawable.ziggs_square);
                champTitle.setText(R.string.ziggs_title);
                tipsAndTricksText.setText(R.string.ziggs_tips);

                break;
            case "zilean":
                champIconPlaceholder.setImageResource(R.drawable.zilean_square);
                champTitle.setText(R.string.zilean_title);
                tipsAndTricksText.setText(R.string.zilean_tips);

                break;
            case "zoe":
                champIconPlaceholder.setImageResource(R.drawable.zoe_square);
                champTitle.setText(R.string.zoe_title);
                tipsAndTricksText.setText(R.string.zoe_tips);

                break;
            case "zyra":
                champIconPlaceholder.setImageResource(R.drawable.zyra_square);
                champTitle.setText(R.string.zyra_title);
                tipsAndTricksText.setText(R.string.zyra_tips);

                break;

        }
    }
}

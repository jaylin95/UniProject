package com.example.jaysonlinhaychiu.uniprojectdraft2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class SearchForSummonerActivity extends AppCompatActivity {

    static String summoner;
    static String platform = "EUW";
    EditText summonerSearchInput;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_for_summoner);

        summonerSearchInput = findViewById(R.id.summonerSearchInput);


        Button searchBtn = findViewById(R.id.searchBtn);
        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent startIntent = new Intent(getApplicationContext(), SummonerSearchActivity.class);
                startActivity(startIntent);
                summoner = summonerSearchInput.getText().toString();


            }

        });

        RadioGroup regionGroup = findViewById(R.id.regionGroup);
        regionGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.euwRegionBtn:
                        platform = "EUW";
                        break;

                    case R.id.naRegionBtn:
                        platform = "NA";
                        break;

                    case R.id.krRegionBtn:
                        platform = "KR";
                        break;
                }
            }

        });
    }

}

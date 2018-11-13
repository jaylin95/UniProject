package com.example.jaysonlinhaychiu.uniprojectdraft2;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.api.endpoints.summoner.dto.Summoner;
import net.rithms.riot.constant.Platform;

public class SummonerSearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summoner_search);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1);

        try {

            ApiConfig config = new ApiConfig().setKey("RGAPI-59277877-aacd-40c2-acd2-8686a9e48422");
            RiotApi api = new RiotApi(config);
            Summoner summoner = api.getSummonerByName(Platform.getPlatformByName(SearchForSummonerActivity.platform), SearchForSummonerActivity.summoner);
            adapter.add("Name: " + summoner.getName());
            adapter.add("Summoner ID: " + summoner.getId());
            adapter.add("Account ID: " + summoner.getAccountId());
            adapter.add("Summoner Level: " + summoner.getSummonerLevel());
            adapter.add("Profile Icon ID: " + summoner.getProfileIconId());


        } catch (RiotApiException e) {
            System.out.println("Error " + e.getMessage());
        }

        ListView sumSearchResult = findViewById(R.id.sumSearchResult);
        sumSearchResult.setAdapter(adapter);
    }
}

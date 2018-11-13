package com.example.jaysonlinhaychiu.uniprojectdraft2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();
        textView = findViewById(R.id.summonerText);

        loadUserInformation();



        Button myProfileBtn = findViewById(R.id.myProfileBtn);
        myProfileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), MyProfileActivity.class);
                startActivity(startIntent);
            }

        });

        Button sumSearchBtn = findViewById(R.id.sumSearchBtn);
        sumSearchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), SearchForSummonerActivity.class);
                startActivity(startIntent);
            }

        });

        Button champList_a_to_g_Btn = findViewById(R.id.champList_a_to_g_Btn);
        champList_a_to_g_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), ChampList_A_to_G.class);
                startActivity(startIntent);
            }



        });

        Button champList_h_to_m_Btn = findViewById(R.id.champList_h_to_m_Btn);
        champList_h_to_m_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), ChampList_H_to_M.class);
                startActivity(startIntent);
            }



        });

        Button champList_n_to_s_Btn = findViewById(R.id.champList_n_to_s_Btn);
        champList_n_to_s_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), ChampList_N_To_S.class);
                startActivity(startIntent);
            }



        });

        Button champList_t_to_z_Btn = findViewById(R.id.champList_t_to_z_Btn);
        champList_t_to_z_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), ChampList_T_To_Z.class);
                startActivity(startIntent);
            }



        });


    }

    private void loadUserInformation() {
        FirebaseUser user = mAuth.getCurrentUser();
        if (user != null) {

            if (user.getDisplayName() != null) {
                textView.setText(user.getDisplayName());
            }
        }
    }

}

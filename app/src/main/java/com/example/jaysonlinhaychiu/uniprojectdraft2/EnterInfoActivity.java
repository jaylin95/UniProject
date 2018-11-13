package com.example.jaysonlinhaychiu.uniprojectdraft2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;

public class EnterInfoActivity extends AppCompatActivity {

    EditText editText;

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_info);

        mAuth = FirebaseAuth.getInstance();
        editText = findViewById(R.id.enterSummoner);

        loadUserInformation();

        /*Spinner selectRegionSpinner = findViewById(R.id.selectRegion);

        ArrayAdapter<String> selectRegionAdapter = new ArrayAdapter<String>(EnterInfoActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.regions));

        selectRegionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        selectRegionSpinner.setAdapter(selectRegionAdapter);*/

        Button saveBtn = findViewById(R.id.saveBtn);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String summonerName = editText.getText().toString();

                if(summonerName.isEmpty()){
                    editText.setError("Please enter a summoner name");
                    editText.requestFocus();
                    return;
                }

                FirebaseUser user = mAuth.getCurrentUser();

                if(user!=null){
                    UserProfileChangeRequest profile = new UserProfileChangeRequest.Builder()
                            .setDisplayName(summonerName)
                            .build();

                    user.updateProfile(profile)
                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    finish();
                                    startActivity(new Intent(EnterInfoActivity.this,MainActivity.class));
                                    if (task.isSuccessful()){
                                        Toast.makeText(EnterInfoActivity.this, "Profile Updated", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }




            }



        });
    }

    @Override
    protected void onStart() {
        FirebaseUser user = mAuth.getCurrentUser();
        super.onStart();
        if (user != null) {
            if (user.getDisplayName() != null) {
                finish();
                startActivity(new Intent(this, MainActivity.class));
            }
        }
    }

    private void loadUserInformation() {
        FirebaseUser user = mAuth.getCurrentUser();
        if (user != null) {

            if (user.getDisplayName() != null) {
                editText.setText(user.getDisplayName());
            }
        }

    }
}

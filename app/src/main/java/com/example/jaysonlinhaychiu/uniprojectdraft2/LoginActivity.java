package com.example.jaysonlinhaychiu.uniprojectdraft2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    FirebaseAuth mAuth;
    EditText emailText, passwordText;
    ProgressBar progressBar2;

    @Override
    protected void onStart() {
        super.onStart();
        if(mAuth.getCurrentUser() != null){
            finish();
            startActivity(new Intent(this, EnterInfoActivity.class));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailText = findViewById(R.id.emailText);
        passwordText = findViewById(R.id.passwordText);
        progressBar2 = findViewById(R.id.progressBar2);
        mAuth = FirebaseAuth.getInstance();

        TextView regTxtBtn = findViewById(R.id.regTxtBtn);
        regTxtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent startIntent = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(startIntent);
            }

        });



        Button loginBtn = findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = emailText.getText().toString().trim();
                String password = passwordText.getText().toString().trim();

                if(email.isEmpty()){
                    emailText.setError("Please enter email");
                    emailText.requestFocus();
                    return;
                }

                if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    emailText.setError("Please enter a valid email address");
                    return;
                }

                if(password.isEmpty()){
                    passwordText.setError("Please enter password");
                    passwordText.requestFocus();
                    return;
                }

                if(password.length()<6){
                    passwordText.setError("Minimum length of password is 6");
                    passwordText.requestFocus();
                    return;
                }

                progressBar2.setVisibility(View.VISIBLE);

                mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressBar2.setVisibility(View.GONE);
                        if(task.isSuccessful()){
                            finish();
                            Intent startIntent = new Intent(LoginActivity.this, EnterInfoActivity.class);
                            startIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(startIntent);
                        }else{
                            Toast.makeText(getApplicationContext(), task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                        }
                    }
                });



            }



        });



    }
}

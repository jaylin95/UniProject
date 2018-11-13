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
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

public class RegisterActivity extends AppCompatActivity {

    EditText emailText, passwordText;
    ProgressBar progressBar;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        emailText = findViewById(R.id.emailText);
        passwordText = findViewById(R.id.passwordText);
        progressBar = findViewById(R.id.progressBar);
        mAuth = FirebaseAuth.getInstance();



        TextView loginTxtBtn = findViewById(R.id.loginTxtBtn);
        loginTxtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent startIntent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(startIntent);
            }

        });

        Button signupBtn = findViewById(R.id.signUpBtn);
        signupBtn.setOnClickListener(new View.OnClickListener() {
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

                progressBar.setVisibility(View.VISIBLE);

                mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressBar.setVisibility(View.GONE);
                        if(task.isSuccessful()){
                            finish();
                            startActivity(new Intent(RegisterActivity.this,EnterInfoActivity.class));
                            Toast.makeText(getApplicationContext(),"User registered", Toast.LENGTH_SHORT).show();
                        }else{
                            if(task.getException() instanceof FirebaseAuthUserCollisionException){
                                Toast.makeText(getApplicationContext(),"Email already in use", Toast.LENGTH_SHORT).show();
                            }
                            else{
                                Toast.makeText(getApplicationContext(),task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });


            }
        });

    }
}

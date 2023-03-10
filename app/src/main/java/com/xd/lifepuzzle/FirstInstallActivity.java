package com.xd.lifepuzzle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
/**
 * Description: opening page of our app which is now in MainActivity
 *              This class is now used for debugging purposes
 *
 */
public class FirstInstallActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_installation_page);

    }
    /**
     * Description: opens login activity
     *
     */
    public void onLoginClicked(View view){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    /**
     * Description: opens signup activity
     */
    public void onSignupClicked(View view){
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }


}


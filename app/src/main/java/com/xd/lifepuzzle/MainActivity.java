package com.xd.lifepuzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

// MAIN ACTIVITY IS THE PAGE WITH LOGIN AND SIGN UP
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ADD UTILS FOR PERMISSIONS

    }

    public void firstInstallButtonClicked(View view){
        Intent intent = new Intent(this, FirstInstallActivity.class);
        startActivity(intent);
    }

    public void loginButtonClicked(View view){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void loginButtonClicked2(View view){
        Intent intent = new Intent(this, Login2Activity.class);
        startActivity(intent);
    }

    public void signupButtonClicked(View view){
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }

    public void mainMenuButtonClicked(View view){
        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);
    }

    public void puzzleButtonClicked(View view){
        Intent intent = new Intent(this, PuzzleActivity.class);
        startActivity(intent);
    }

    public void settingsButtonClicked(View view){
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    public void caregiverButtonClicked(View view){
        Intent intent = new Intent(this, CaregiverActivity.class);
        startActivity(intent);
    }

    public void memoryButtonClicked(View view){
        Intent intent = new Intent(this, MemoryActivity.class);
        startActivity(intent);
    }




}
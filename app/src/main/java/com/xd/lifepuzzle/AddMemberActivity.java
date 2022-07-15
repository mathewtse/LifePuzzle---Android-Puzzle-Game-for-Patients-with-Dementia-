package com.xd.lifepuzzle;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;

public class AddMemberActivity extends AppCompatActivity {
//    lateinit var cameraResult : ActivityResultLauncher<Intent>
    public ActivityResultLauncher<Intent> cameraResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_member);
//        Resources res = getResources();
//        cameraResult = res.getStringArray(R.array.camera_options_list);

        try{
            Bundle bundle = getIntent().getExtras();
            String currentMember = bundle.getString(EditMemberActivity.CURRENT_MEMBER_KEY);
            Toast.makeText(AddMemberActivity.this, currentMember, Toast.LENGTH_SHORT).show();
        } catch (Exception e){
            Toast.makeText(AddMemberActivity.this, "No Member", Toast.LENGTH_SHORT).show();
        }


    }

    /**
     * Description: opens dialog box to take a photo or get one from file explorer
     */
    public void onAddMemberPhotoClicked(View view){
        Toast.makeText(AddMemberActivity.this, "No onAddMemberPhotoClicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);

//        Dialog dialogBoxes = DialogBoxes()
//        val bundle = Bundle()
//        bundle.putString(DialogBoxes.WHICH_KEY, DialogBoxes.CAMERA_KEY)
//        bundle.putString(DialogBoxes.CAMERA_KEY, "Pick Profile Picture")
//        dialogBoxes.arguments = bundle
//
//        dialogBoxes.show(supportFragmentManager, "tag")
//        dialogBoxes.getArguments()


//        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        intent.putExtra(MediaStore.EXTRA_OUTPUT, imgUri);
//        cameraResult.launch(intent);

//        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//        intent.putExtra(MediaStore.EXTRA_OUTPUT, imgUri)
//        cameraResult.launch(intent)
    }

    /**
     * Description: gets an audio file from file explorer
     */
    public void onAddAudioMessageClicked(View view){
        Toast.makeText(AddMemberActivity.this, "No onAddAudioMessageClicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);
    }

    /**
     * Description: gets a video file from file explorer
     */
    public void onAddVideoClicked(View view){
        Toast.makeText(AddMemberActivity.this, "No onAddVideoClicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);
    }

    /**
     * Description: saves member to database and opens main menu
     */
    public void onSaveMemberClicked(View view){
        Toast.makeText(AddMemberActivity.this, "No onSaveMemberClicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);
    }

    /**
     * Description: deletes member from database
     * Post-condition: member is deleted from database
     */
    public void onDeleteMemberClicked(View view){
        Toast.makeText(AddMemberActivity.this, "onDeleteMemberClicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);
    }
}
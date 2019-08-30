package com.example.myprojectfragments;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentManager;

public class MainActivity2 extends AppCompatActivity {

    QuestionsFragment fragment1;
    ScoreFragment fragment2;
    FragmentManager manager;
    int intValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//Creating fragments
        manager = getSupportFragmentManager();
        fragment1 = (QuestionsFragment) manager.findFragmentById(R.id.questionsFragment);
        fragment2 = (ScoreFragment) manager.findFragmentById(R.id.scoreFragment);


    }


//Method that receives the position of item selected from list view
    public int getTopic(){
        Intent intent = getIntent();
        intValue = intent.getIntExtra("intVariableName", 0);
        return  intValue;
    }

//Method that updates current score in fragment 2
    public void onScoreChange(int score) {
        fragment2.updateScore(score);
    }

    //Code to add  action bar with buttons on top
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int curId = item.getItemId();
        switch (curId) {
            case R.id.menu_settings:
                Toast.makeText(this, "settings menu", Toast.LENGTH_LONG).show();
                break;
            case R.id.menu_exit:
                showMessage();
                break;
            case R.id.menu_refresh:
                Toast.makeText(this, "refresh menu", Toast.LENGTH_LONG).show();
                break;


        }
        return super.onOptionsItemSelected(item);
    }

    //Code to display dialog box when exit button is clicked
    public void showMessage() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("CONFIRMATION");
        builder.setMessage("Are you sure you want to exit?");
        builder.setIcon(android.R.drawable.ic_dialog_alert);

        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent1 = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent1);
                Toast.makeText(getApplicationContext(), "yes button clicked", Toast.LENGTH_LONG).show();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "no button clicked", Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();


    }


}

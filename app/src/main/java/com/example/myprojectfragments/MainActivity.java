package com.example.myprojectfragments;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//Adding elements to list view
        listView = (ListView)findViewById(R.id.listview);
        String[] values = new String []{"MATHS","SCIENCE","GENERAL ","INVENTIONS"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,values){
//To change the size and colour of elements inside list view
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view =super.getView(position, convertView, parent);

                TextView textView=(TextView) view.findViewById(android.R.id.text1);
                textView.setTextColor(Color.BLACK);
                textView.setTextSize(30);

                return view;
            }
        };

        listView.setAdapter(adapter);

        //Method that takes the position of item(i.e, topic) selected from list view and calls the MainActivity2
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                if (position == 0){
                    Intent intent = new Intent(view.getContext(),MainActivity2.class);
                    intent.putExtra("intVariableName", 0);
                    startActivityForResult(intent,0);
                }
                if (position == 1){
                    Intent intent = new Intent(view.getContext(),MainActivity2.class);
                    intent.putExtra("intVariableName", 1);
                    startActivityForResult(intent,1);
                }
                if (position == 2){
                    Intent intent = new Intent(view.getContext(),MainActivity2.class);
                    intent.putExtra("intVariableName", 2);
                    startActivityForResult(intent,2);
                }
                if (position == 3){
                    Intent intent = new Intent(view.getContext(),MainActivity2.class);
                    intent.putExtra("intVariableName", 3);
                    startActivityForResult(intent,3);
                }

            }
        });
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
                Intent intent1 = new Intent(MainActivity.this, MainActivity.class);
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

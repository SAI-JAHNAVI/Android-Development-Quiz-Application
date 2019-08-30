package com.example.myprojectfragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Anim extends MainActivity {
    TextView textView2;
    int intValue;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anim_flow);
        textView2 = (TextView)findViewById(R.id.ssss);
        //take the value of score from QuestionsFragment
        Intent intent = getIntent();
        intValue = intent.getIntExtra("intVariableName", 0);
        textView2.setText("" + intValue);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Anim.this, MainActivity.class);
                startActivity(intent1);
            }
        });





    }


}

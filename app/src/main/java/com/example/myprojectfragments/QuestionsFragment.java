package com.example.myprojectfragments;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

public class QuestionsFragment extends Fragment {
    MainActivity2 activity;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3, mSubmit;
    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;
    private Questions questions;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = (MainActivity2)getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.fragment_questions, container, false);
            mQuestionView = (TextView)rootview.findViewById(R.id.question);
            mButtonChoice1 = (Button)rootview.findViewById(R.id.choice1);
            mButtonChoice2 = (Button)rootview.findViewById(R.id.choice2);
            mButtonChoice3 = (Button)rootview.findViewById(R.id.choice3);
            mSubmit = (Button)rootview.findViewById(R.id.submit);

            //variable that takes the position value from getTopic() of MainActivity2
            int mtopic = activity.getTopic();
            //code to create an object of the selected topic
               switch (mtopic){
                   case 0:
                       questions = new MathsQuestions();
                        break;
                   case 1:
                       questions = new ScienceQuestions();
                       break;
                   case 2:
                       questions = new GeneralQuestions();
                       break;
                   case 3:
                       questions = new InventionsQuestions();
                       break;

               }
               updateQuestion();
//code to update questions and score in the fragment
            mButtonChoice1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mButtonChoice1.getText() == mAnswer) {
                        mScore = mScore + 1;
                        activity.onScoreChange(mScore);
                        if(mQuestionNumber == 5){
                            showMessage();
                        }
                        else
                        updateQuestion();
                        Toast.makeText(getActivity(), "correct", Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(getActivity(), "wrong", Toast.LENGTH_SHORT).show();
                        if(mQuestionNumber == 5){
                            showMessage();
                        }
                        else
                        updateQuestion();
                    }
                }
            });
            mButtonChoice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mButtonChoice2.getText() == mAnswer) {
                        mScore = mScore + 1;
                        activity.onScoreChange(mScore);
                        if(mQuestionNumber == 5){
                            showMessage();
                        }
                        else
                        updateQuestion();
                        Toast.makeText(getActivity(), "correct", Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(getActivity(), "wrong", Toast.LENGTH_SHORT).show();
                        if(mQuestionNumber == 5){
                            showMessage();
                        }
                        else
                        updateQuestion();
                    }
                }
            });
            mButtonChoice3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mButtonChoice3.getText() == mAnswer) {
                        mScore = mScore + 1;
                        activity.onScoreChange(mScore);
                        if(mQuestionNumber == 5){
                            showMessage();
                        }
                        else
                        updateQuestion();
                        Toast.makeText(getActivity(), "correct", Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(getActivity(), "wrong", Toast.LENGTH_LONG).show();
                        if(mQuestionNumber == 5){
                            showMessage();
                        }
                        else
                        updateQuestion();
                    }

                }
            });
            mSubmit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), Anim.class);
                    intent.putExtra("intVariableName", mScore);
                    startActivity(intent);


                }
            });

            return rootview;
        }

//Method to update questions from the selected topic
        private void updateQuestion(){

            mQuestionView.setText(questions.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(questions.getChoice1(mQuestionNumber));
            mButtonChoice2.setText(questions.getChoice2(mQuestionNumber));
            mButtonChoice3.setText(questions.getChoice3(mQuestionNumber));

            mAnswer = questions.getCorrectAnswer(mQuestionNumber);

            mQuestionNumber++;
        }
//Method to display a dialog box when last question is reached
    public void showMessage(){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("GAME OVER");
        builder.setMessage("Your Score is" + mScore);
        builder.setMessage("Start New Game??");
        builder.setIcon(android.R.drawable.ic_dialog_alert);

        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent1 = new Intent(getActivity(), MainActivity.class);
                getActivity().startActivity(intent1);
                Toast.makeText(getActivity(),"yes button clicked",Toast.LENGTH_LONG).show();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(getActivity(), Anim.class);
                intent.putExtra("intVariableName", mScore);
                getActivity().startActivity(intent);
                Toast.makeText(getActivity(),"no button clicked",Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();

    }

}


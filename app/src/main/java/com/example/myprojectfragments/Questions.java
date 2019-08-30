package com.example.myprojectfragments;
// Interface which has methods implemented by all topics in the listView
public interface Questions {

    String getQuestion(int a);
    String getChoice1(int a);
    String getChoice2(int a);
    String getChoice3(int a);
    String getCorrectAnswer(int a);

}

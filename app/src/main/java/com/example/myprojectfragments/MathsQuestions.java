package com.example.myprojectfragments;

public class MathsQuestions implements Questions{
    private String mQuestions[]={

            "8*8=?" ,
            "14/2=?",
            "6+6=?",
            "10000%2",
            "1*0"
    };
    private String mChoices[][]={

            {"16","64","15"},
            {"8","7","6"},
            {"7","12","1"},
            {"0","56","1"},
            {"5","3","0"}
    };
    private String mCorrectAnswers[] = { "64","7","12","0","0"};

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }
    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }
    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }
    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;

    }
}



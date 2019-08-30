package com.example.myprojectfragments;

public class ScienceQuestions implements Questions {
    private String mQuestions[]={

            "Brass gets discoloured in air because of the presence of which of the following gases in air?" ,
            "Which of the following is a non metal that remains liquid at room temperature?",
            "Chlorophyll is a naturally occurring chelate compound in which central metal is",
            "Reading of a barometer going down is an indication of",
            "What is the unit for measuring the amplitude of a sound?"
    };
    private String mChoices[][]={

            {"Oxygen","Hydrogen sulphide","Carbon dioxide"},
            {"Phosphorous","Bromine","Helium"},
            {"magnesium","iron","calcium"},
            {"storm","intense heat","rainfall"},
            {"Decibel","Coulomb","Hum"}
    };
    private String mCorrectAnswers[] = { "Hydrogen sulphide","Bromine","magnesium","rainfall","Decibel"};

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



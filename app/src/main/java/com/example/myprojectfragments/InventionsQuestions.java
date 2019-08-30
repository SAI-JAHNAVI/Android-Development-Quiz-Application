package com.example.myprojectfragments;

public class InventionsQuestions implements Questions {
    private String mQuestions[]={

            "Who invented the BALLPOINT PEN?" ,
            "Which scientist discovered the radioactive element radium?",
            "What is the name of the CalTech seismologist who invented the scale used to measure the magnitude of earthquakes?",
            "Who had an explosive idea and first patented DYNAMITE?",
            "Who invented the Spinning Jenny?"
    };
    private String mChoices[][]={

            {"Biro Brothers","Waterman Brothers","Bicc Brothers"},
            {"Benjamin Franklin","Albert Einstein","Marie Curie"},
            {"Charles Richter","Hiram Walker","Giuseppe Mercalli"},
            {"R. Gluber","Nobel","Fawks"},
            {"Thornton Hargreaves","Peter Hargreaves","James Hargreaves"}
    };
    private String mCorrectAnswers[] = { "Biro Brothers","Marie Curie","Charles Richter","Nobel","James Hargreaves"};

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



package com.example.myprojectfragments;

public class GeneralQuestions implements Questions {
     String mQuestions[]={

            "Hitler party which came into power in 1933 is known as" ,
            "Entomology is the science that studies",
            "Grand Central Terminal, Park Avenue, New York is the world's",
             "The chief constituent of gobar gas is",
             "World's busiest airports by passenger traffic is"
    };
    private String mChoices[][]={

            {"Labour Party","Nazi Party","Ku-Klux-Klan"},
            {"Behavior of human beings","The formation of rocks","Insects"},
            {"largest railway station","highest railway station","longest railway station"},
            {"ethane","methane","hydrogen"},
            {"Hartsfield-Jackson Atlanta International Airport,USA","Lhasa Airport, Tibet","King Abdul Aziz International Airport, Saudi Arabia"}
    };
    private String mCorrectAnswers[] = { "Nazi Party","Insects","largest railway station","ethane","Hartsfield-Jackson Atlanta International Airport,USA"};

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



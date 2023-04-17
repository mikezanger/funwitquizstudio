package Main;

public abstract class Question {
    //class variables
    private final String theQuestion;
    private final String theAnswer;

    //constructor
    public Question(String question, String answer){
        this.theQuestion = question;
        this.theAnswer = answer;
    }

    //methods
    //getters
    public String getTheQuestion() {return this.theQuestion; }

    public String getTheAnswer() {return this.theAnswer; }


    public abstract boolean checkAnswer(String answer);
}

package Main;

public class TrueOrFalse extends Question {
    //ClassVariables

    //Constructors
    public TrueOrFalse(String question, String answer) {
        super(question, answer);
    }

    //Methods
    @Override
    public boolean checkAnswer(String answer) {

        if (answer.toUpperCase().equals(this.getTheAnswer().toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}


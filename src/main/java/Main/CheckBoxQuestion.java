package Main;

public class CheckBoxQuestion extends Question {
    //ClassVariables

    //Constructors
    public CheckBoxQuestion(String question, String answer) {
        super(question, answer);
    }

    //Methods
    @Override
    public boolean checkAnswer(String answer) {
        String actualAnswer = this.getTheAnswer();
        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
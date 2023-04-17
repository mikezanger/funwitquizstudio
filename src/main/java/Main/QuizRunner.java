package Main;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoiceQuestion myMultipleChoiceQuestion = new MultipleChoiceQuestion("What color is the sky?\nA: Blue\nB: Green\nEnter a single letter as an answer", "A");
        myQuiz.addQuestion(myMultipleChoiceQuestion);

        CheckBoxQuestion myCheckBoxQuestion = new CheckBoxQuestion("What colors are in a rainbow?\nA: Blue\nB: Green\nC: Black", "A,B");
        myQuiz.addQuestion(myCheckBoxQuestion);

        TrueOrFalse myTrueOrFalseQuestion = new TrueOrFalse("The Earth is Flat?\nTrue\nFalse", "False");
        myQuiz.addQuestion(myTrueOrFalseQuestion);

        myQuiz.runQuiz();
    }
}

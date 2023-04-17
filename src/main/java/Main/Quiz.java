package Main;

import java.util.ArrayList;
import java.util.Scanner;

//add question
//run the quiz
//grade the quiz
public class Quiz {
    //Class Variables
    private ArrayList<Question> questions = new ArrayList<Question>();
    private int numberOfQuestionsCorrect = 0;
    private Scanner scanner = new Scanner(System.in);
    //Constructors
    public Quiz(){

    }
    //Methods
    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void runQuiz() {
        for (Question question: questions) {
            System.out.println(question.getTheQuestion());
            String usersAnswer = this.getUsersAnswers();
            boolean userGotQuestionCorrect =  question.checkAnswer(usersAnswer);
            if(userGotQuestionCorrect) {
                this.numberOfQuestionsCorrect++;
            }
        }
    double percentageCorrect = (this.numberOfQuestionsCorrect / this.questions.size()) * 100;
        System.out.println("Users Grade: " + percentageCorrect + "%") ;
    }

    private String getUsersAnswers() {
        String usersAnswer = scanner.nextLine();
        return usersAnswer;
    }
}


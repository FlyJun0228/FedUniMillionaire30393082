package au.edu.federation.itech3107.fedunimillionaire30393082.Bean;

import java.util.Arrays;
import java.util.List;

public class Question {
    private String category;
    private String type;
    private String difficulty;
    private String question;
    private String correct_answer;
    private List<String> incorrect_answers;

    public String getQuestion() {
        return question;
    }

    public String getCategory() {
        return category;
    }

    public String getCorrect_answer() {
        return correct_answer;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getType() {
        return type;
    }

    public List getIncorrect_answers() {
        return incorrect_answers;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setCorrect_answer(String correct_answer) {
        this.correct_answer = correct_answer;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void setIncorrect_answers(String[] incorrect_answers) {
        this.incorrect_answers = Arrays.asList(incorrect_answers);
    }

    public void setType(String type) {
        this.type = type;
    }

}

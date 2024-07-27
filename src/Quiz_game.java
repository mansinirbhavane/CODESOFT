import java.util.List;
public class Quiz_game {
    private String question;
    private List<String> options;
    private int correctAnswer;
    private long timeLimit;

    public Quiz_game(String question, List<String> options, int correctAnswer, long timeLimit) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
        this.timeLimit = timeLimit;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public long getTimeLimit() {
        return timeLimit;
    }
}


package Quiz.QuizWebApplication.DTO.Leaderboard;

import lombok.Data;

import java.util.List;

@Data
public class savePlayerDataDTO {
    public String getUid() {
        return uid;
    }

    public String getQuizId() {
        return quizId;
    }

    private String quizId;
    private String uid;
    private String playerName;
    private int  correctAnswers;
    private int incorrectAnswers;



    public int getCorrectAnswers() {
        return correctAnswers;
    }



    public int getIncorrectAnswers() {
        return incorrectAnswers;
    }



    public int getStreak() {
        return streak;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    private int streak;
    private int score;
    private int time;
    private List<String> answers;


}

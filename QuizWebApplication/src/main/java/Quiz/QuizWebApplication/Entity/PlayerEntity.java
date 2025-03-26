package Quiz.QuizWebApplication.Entity;

import lombok.Data;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document(collection = "player")
public class PlayerEntity {
    private String id;

    public void setUid(String uid) {
        this.uid = uid;
    }

    private  String uid;

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    private String playerName;
    private String email;
//    private String Password;
    private String otp;
    public void setCaptchaResponse(String captchaResponse) {
        this.captchaResponse = captchaResponse;
    }

    private String captchaResponse;

    public boolean isVerified() {
        return Verified;
    }

        private boolean Verified;

    public void setTime(int time) {
        this.time = time;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }

    public void setIncorrectAnswers(int incorrectAnswers) {
        this.incorrectAnswers = incorrectAnswers;
    }

    public void setCorrectAnswers(int correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    private int  correctAnswers;
        private int incorrectAnswers;
        private int streak;
        private int score;
        private int time;

    public String getQuizId() {
        return quizId;
    }

    public void setQuizId(String quizId) {
        this.quizId = quizId;
    }

    private String quizId;
        private List<String> answers;


    public void setOtpExpirationTime(LocalDateTime otpExpirationTime) {
        this.otpExpirationTime = otpExpirationTime;
    }

    public LocalDateTime getOtpExpirationTime() {
        return otpExpirationTime;
    }

    private LocalDateTime otpExpirationTime;

//    public String getPassword() {
//        return Password;
//    }
//
//    public void setPassword(String password) {
//        Password = password;
//    }




    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }



    public void setVerified(boolean verified) {
        Verified = verified;
    }



}


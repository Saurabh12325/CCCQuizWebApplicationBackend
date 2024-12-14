package Quiz.QuizWebApplication.Entity;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "admin")
public class AdminEntity {

  private String email;
  private String password;
  private String otp;
  private boolean Verified;

  private List<String> quizId;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
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

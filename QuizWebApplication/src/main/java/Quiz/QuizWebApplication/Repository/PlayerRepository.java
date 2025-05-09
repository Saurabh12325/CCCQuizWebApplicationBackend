package Quiz.QuizWebApplication.Repository;

import Quiz.QuizWebApplication.DTO.Leaderboard.savePlayerDataDTO;
import Quiz.QuizWebApplication.DTO.PlayerRegistrationDTO;
import Quiz.QuizWebApplication.Entity.PlayerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface PlayerRepository extends MongoRepository<PlayerEntity,String> {
    Optional<PlayerEntity> findByEmail(String playerLoginDTO);

    PlayerEntity findByUid(String uid);


}

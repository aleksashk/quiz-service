package quiz.service.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import quiz.service.app.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
}

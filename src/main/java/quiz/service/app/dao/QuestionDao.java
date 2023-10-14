package quiz.service.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quiz.service.app.model.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {
}

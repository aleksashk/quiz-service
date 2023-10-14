package quiz.service.app.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import quiz.service.app.dao.QuestionDao;
import quiz.service.app.dao.QuizDao;
import quiz.service.app.model.Question;
import quiz.service.app.model.Quiz;

import java.util.List;

@Service
public class QuizService {

    private final QuestionDao questionDao;
    private final QuizDao quizDao;

    public QuizService(QuestionDao questionDao, QuizDao quizDao) {
        this.questionDao = questionDao;
        this.quizDao = quizDao;
    }

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        List<Question> questions = questionDao.findRandomQuestionsByCategory(category, numQ);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestionList(questions);
        quizDao.save(quiz);

        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }
}

package quiz.service.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import quiz.service.app.model.Question;
import quiz.service.app.service.QuestionService;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }


    @GetMapping("allQuestions")
    public List<Question> getAllQuestion() {
        return questionService.getAllQuestions();
    }
}

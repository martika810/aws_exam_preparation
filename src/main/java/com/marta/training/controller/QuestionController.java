package com.marta.training.controller;

import com.marta.training.domain.Module;
import com.marta.training.domain.Question;
import com.marta.training.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class QuestionController {

    @Autowired
    private QuestionService service;

    @GetMapping("/")
    public String serveQuestion(Model model) throws IOException {
        Question question= service.getRandomQuestion(Module.Deployment);
        model.addAttribute("question",question);
        return "question";
    }

}

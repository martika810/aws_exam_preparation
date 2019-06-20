package com.marta.training.controller;

import com.marta.training.domain.Module;
import com.marta.training.domain.Question;
import com.marta.training.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.Random;

@Controller
public class QuestionController {

    @Autowired
    private QuestionService service;

    @GetMapping("/")
    public String serveQuestion(Model model) throws IOException {
        int moduleNumberSelected = (new Random().nextInt(1000)%2)+1;
        System.out.println("Module selected="+moduleNumberSelected);
        Module selectedModule = Module.getValueOf(moduleNumberSelected);
        Question question= service.getRandomQuestion(selectedModule);
        model.addAttribute("question",question);
        return "question";
    }

}

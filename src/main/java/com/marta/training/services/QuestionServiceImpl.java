package com.marta.training.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.marta.training.domain.Module;
import com.marta.training.domain.Question;
import org.springframework.stereotype.Component;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.util.Random;

@Component
public class QuestionServiceImpl implements QuestionService {
    private final ObjectMapper objectMapper;

    public QuestionServiceImpl(){
        objectMapper = new ObjectMapper();
    }
    @Override
    public Question getRandomQuestion(Module selectedModule) throws IOException {
        int selectedQuestion =new Random().nextInt(selectedModule.getNumberAvailableQuestions())+1;
        String questionRawFromFile = "";
        try {
            questionRawFromFile = IOUtils.toString(this.getClass().getResourceAsStream("/questions/"+selectedModule.getFolder()+"/"+selectedQuestion+".json"),
                    "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Question selectedObjectQuestion = objectMapper.readValue(questionRawFromFile, Question.class);
        return selectedObjectQuestion;
    }
}

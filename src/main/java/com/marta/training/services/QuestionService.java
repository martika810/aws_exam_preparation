package com.marta.training.services;

import com.marta.training.domain.Module;
import com.marta.training.domain.Question;

import java.io.IOException;

public interface QuestionService {

    public Question getRandomQuestion(Module selectedModule) throws IOException;
}

package com.marta.training.services;

import com.marta.training.domain.Module;
import com.marta.training.domain.Question;
import org.junit.Test;
import org.junit.Assert;

import java.io.IOException;

public class QuestionServiceImplTest {

    private QuestionService service = new QuestionServiceImpl();

    @Test
    public void getRandomQuestion() throws IOException {
        Question question1 = service.getRandomQuestion(Module.Deployment);
        Assert.assertTrue(!question1.getTopic().isEmpty());
        Assert.assertTrue(!question1.getQuestion().isEmpty());
    }
}

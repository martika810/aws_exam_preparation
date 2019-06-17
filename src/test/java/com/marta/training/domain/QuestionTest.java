package com.marta.training.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class QuestionTest {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void deserialize() throws IOException {
        String questionInText =IOUtils.toString(this.getClass().getResourceAsStream("/questions/1_deployment/29.json"),"UTF-8");
        Question questionInObject = objectMapper.readValue(questionInText,Question.class);
        Assert.assertEquals("elastic beanstalk",questionInObject.getTopic());
        Assert.assertEquals("E",questionInObject.getCorrectAnswer().get(0));

    }
}

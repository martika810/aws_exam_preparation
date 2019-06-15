package com.marta.training.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class AnswersTest {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void deserialize() throws IOException {
        String answersInText =IOUtils.toString(this.getClass().getResourceAsStream("/answers.json"),"UTF-8");
        Answers answersInObject = objectMapper.readValue(answersInText,Answers.class);
        Assert.assertEquals("True",answersInObject.getA());
    }
}

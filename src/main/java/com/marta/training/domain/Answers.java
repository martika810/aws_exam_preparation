package com.marta.training.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Optional;

public class Answers {
    @JsonProperty("A")
    private String A;

    @JsonProperty("B")
    private String B;

    @JsonProperty("C")
    private String C;

    @JsonProperty("D")
    private String D;

    @JsonProperty("E")
    private String E;

    @JsonProperty("F")
    private String F;

    public Answers(){}

    public Answers(String A, String B) {
        A = A;
        B = B;
    }

    public Answers(String a, String b, String c, String d, String e, String f) {
        A = a;
        B = b;
        C = c;
        D = d;
        E = e;
        F = f;
    }

    public String getA() {
        return A;
    }

    public String getB() {
        return B;
    }

    public String getC() {
        return C;
    }

    public String getD() {
        return D;
    }

    public String getE() {
        return E;
    }

    public String getF() {
        return F;
    }
}

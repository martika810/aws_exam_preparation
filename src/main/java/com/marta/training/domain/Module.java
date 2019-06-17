package com.marta.training.domain;

public enum Module {
    Deployment("1_deployment",34),
    Security("2_security",0);

    private String folder;
    private int numberAvailableQuestions;

    private Module(String folder, int numberAvailableQuestions) {
        this.folder = folder;
        this.numberAvailableQuestions =numberAvailableQuestions;
    }

    public String getFolder() {
        return folder;
    }

    public int getNumberAvailableQuestions() {
        return numberAvailableQuestions;
    }
}

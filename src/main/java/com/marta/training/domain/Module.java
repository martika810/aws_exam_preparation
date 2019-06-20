package com.marta.training.domain;

public enum Module {
    Deployment(1,"1_deployment",38),
    Security(2,"2_security",22);

    private int id;
    private String folder;
    private int numberAvailableQuestions;

    private Module(int id, String folder, int numberAvailableQuestions) {
        this.id = id;
        this.folder = folder;
        this.numberAvailableQuestions =numberAvailableQuestions;
    }

    public int getId(){ return id; }

    public String getFolder() {
        return folder;
    }

    public int getNumberAvailableQuestions() {
        return numberAvailableQuestions;
    }

    public static Module getValueOf(int id) {
        for( Module module:Module.values()){
            if(module.getId() == id){
                return module;
            }
        }
        return null;
    }
}

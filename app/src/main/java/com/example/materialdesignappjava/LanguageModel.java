package com.example.materialdesignappjava;

public class LanguageModel {

    private String name;
    private int imageResource;


    public LanguageModel(String name, int imageResource) {
        this.name = name;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }
}

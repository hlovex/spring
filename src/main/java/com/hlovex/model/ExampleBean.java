package com.hlovex.model;

public class ExampleBean {
    // Number of years to calculate the Ultimate Answer
    private int years;

    // The Answer to Life, the Universe, and Everything
    private String ultimateAnswer;

    public ExampleBean(int years, String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
//        System.out.println(years);
//        System.out.println(ultimateAnswer);
    }

    public int getYears() {
        return years;
    }

    public String getUltimateAnswer() {
        return ultimateAnswer;
    }
}

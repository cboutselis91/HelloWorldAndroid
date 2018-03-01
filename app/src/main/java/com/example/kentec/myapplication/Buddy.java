package com.example.kentec.myapplication;

import java.io.Serializable;

/**
 * Created by Kentec on 2/28/2018.
 */

public class Buddy implements Serializable {

    private boolean quiet;
    private boolean chatty;
    private boolean crier;
    private boolean nachos;
    private boolean candy;
    private boolean popcorn;
    private int option1;
    private int option2;
    private int option3;
    private int option4;
    private String name;

    public Buddy(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Buddy{" +
                "quiet=" + quiet +
                ", chatty=" + chatty +
                ", crier=" + crier +
                ", nachos=" + nachos +
                ", candy=" + candy +
                ", popcorn=" + popcorn +
                ", option1=" + option1 +
                ", option2=" + option2 +
                ", option3=" + option3 +
                ", option4=" + option4 +
                ", name='" + name + '\'' +
                '}';
    }

    public boolean isQuiet() {
        return quiet;
    }

    public void setQuiet(boolean quiet) {
        this.quiet = quiet;
    }

    public boolean isChatty() {
        return chatty;
    }

    public void setChatty(boolean chatty) {
        this.chatty = chatty;
    }

    public boolean isCrier() {
        return crier;
    }

    public void setCrier(boolean crier) {
        this.crier = crier;
    }

    public boolean isNachos() {
        return nachos;
    }

    public void setNachos(boolean nachos) {
        this.nachos = nachos;
    }

    public boolean isCandy() {
        return candy;
    }

    public void setCandy(boolean candy) {
        this.candy = candy;
    }

    public boolean isPopcorn() {
        return popcorn;
    }

    public void setPopcorn(boolean popcorn) {
        this.popcorn = popcorn;
    }

    public int getOption1() {
        return option1;
    }

    public void setOption1(int option1) {
        this.option1 = option1;
    }

    public int getOption2() {
        return option2;
    }

    public void setOption2(int option2) {
        this.option2 = option2;
    }

    public int getOption3() {
        return option3;
    }

    public void setOption3(int option3) {
        this.option3 = option3;
    }

    public int getOption4() {
        return option4;
    }

    public void setOption4(int option4) {
        this.option4 = option4;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

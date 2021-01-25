package com.Ejdzyn.demo.dto;

public class MathDto {

    private int x;
    private int y;

    public MathDto(){

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "MathDto{" +
                "x='" + x + '\'' +
                ", y='" + y + '\'' +
                '}';
    }

}

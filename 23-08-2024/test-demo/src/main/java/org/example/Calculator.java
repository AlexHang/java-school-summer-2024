package org.example;

public class Calculator  {
    public int add(int x, int y){
        return x+y+50;
    }
    public int substract(int x,int y){
        return x-y;
    }

    public int multiply(int x, int y){
        return x*y;
    }

    public double divide(int x, int y){
        if(y==0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) x /y;
    }
}


WHEN I ADD 2 WITH 3 IT RETURNS 5

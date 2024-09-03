package org.example;

public class MyCalculatorUser {

    public int useCalculator(int x, int y){
        Calculator calculator = new Calculator();
        int a1 = calculator.add(x,y);
        int a2 = calculator.multiply(a1, 50);
        return a2;
    }
}

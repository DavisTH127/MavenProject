package com.platform.project.application;

public class Calculator {
    private double add(double num1, double num2){
        double max = Double.MAX_VALUE;
        if((num1 > 0 && num2 > 0) || (num1 < 0 || num2 < 0)){
            if (max - Math.abs(num2) < Math.abs(num1)) {
                System.out.println("a+b is out of bound");
                throw new ArithmeticException("a+b is out of bound");
            }
        }
        return num1+num2;
    }
    // Min <= Num1 + num2 => Num1 < Min - Num2
    private double minus(double num1, double num2) throws IllegalArgumentException {
        double min = Double.MIN_VALUE;
        if((num1 > 0 && num2 > 0) || (num1 < 0 || num2 < 0)){
            if (min - Math.abs(num2) > Math.abs(num1)) {
                System.out.println("a-b is out of bound");
                throw new ArithmeticException("a-b is out of bound");
            }
        }
        return num1 - num2;

    }
    // Num1 * Num2 <= Max  => Num1 >= Max/Num2
    private double multiply(double num1, double num2) throws IllegalArgumentException {
        double max = Double.MAX_VALUE;
        if((num1 > 0 && num2 > 0) || (num1 < 0 || num2 < 0)){
            if (num1 >= max/num2) {
                System.out.println("a*b is out of bound");
                throw new ArithmeticException("a*b is out of bound");
            }
        }
        return num1 * num2;

    }

    //  Num1 <= Max/Num2  ==>  Num 1  >= max * num2
    private double divide(double num1, double num2) throws IllegalArgumentException {
        double max = Double.MAX_VALUE;
        if (num2 == 0) {
            System.out.println("Cannot Divide By zero");
            throw new IllegalArgumentException("Division by zero");
        }else if((num1 > 0 && num2 > 0) || (num1 < 0 || num2 < 0)){
            if (num1 >= max * num2) {
                System.out.println("a/b is out of bound");
                throw new ArithmeticException("a/b is out of bound");
            }
        }
            return num1 / num2;

    }

    public double calculate(double num1, double num2, char op){
        switch (op) {
            case '+':
                return add(num1,num2);
            case '-':
                return minus(num1,num2);
            case '*':
                return multiply(num1,num2);
            case '/':
                return divide(num1,num2);
            default:
                System.out.println("Unsupported Operation Sign");
                throw new IllegalArgumentException("Unsupported Operation Sign");
        }
    }
}

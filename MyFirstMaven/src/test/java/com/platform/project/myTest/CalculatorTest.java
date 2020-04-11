package com.platform.project.myTest;

import com.platform.project.application.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void happyAddition(){
        System.out.println("Running Happy Addition Test"); // Always have Logs to know what your doing
        Calculator calculator = new Calculator();
        double result = calculator.calculate(74,36,'+');
        Assert.assertTrue(110 == result);
    }

    @Test
    public void happyAddition1(){
        System.out.println("Running Happy Addition Test"); // Always have Logs to know what your doing
        Calculator calculator = new Calculator();
        double result = calculator.calculate(74,36,'+');
        Assert.assertTrue(110 == result);
    }

    @Test
    public void happyAddition2(){
        System.out.println("Running Happy Addition2 Test"); // Always have Logs to know what your doing
        Calculator calculator = new Calculator();
        double result = calculator.calculate(8,6,'*');
        double result2 = calculator.calculate(result,-5,'+');
        Assert.assertTrue(43 == result2);
    }

    @Test
    public void happySubtraction(){
        System.out.println("Running Happy Subtraction Test"); // Always have Logs to know what your doing
        Calculator calculator = new Calculator();
        double result = calculator.calculate(3,2,'-');
        Assert.assertTrue(1==result);
    }

    @Test
    public void happyMult(){
        System.out.println("Running Happy Subtraction Test"); // Always have Logs to know what your doing
        Calculator calculator = new Calculator();
        double result = calculator.calculate(3,2,'*');
        Assert.assertTrue(6==result);
    }

    @Test
    public void happyDiv(){
        System.out.println("Running Happy Subtraction Test"); // Always have Logs to know what your doing
        Calculator calculator = new Calculator();
        double result = calculator.calculate(3,3,'/');
        Assert.assertTrue(1==result);
    }
}

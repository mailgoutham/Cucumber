package com.goutham.calculator;

/**
 * User: Goutham Rathnaswamy
 * Date: 30/07/2013
 * Time: 13:41
 */
public class CalculatorService {
    private Integer result;

    public void initialize(){
        result = 0;
    }

    public int getResult() {
        return result;
    }

    public void add(int arg1, int arg2) {
        result = arg1 + arg2;
    }
}

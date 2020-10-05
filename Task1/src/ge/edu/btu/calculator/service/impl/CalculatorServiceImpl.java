package ge.edu.btu.calculator.service.impl;

import ge.edu.btu.calculator.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }

    @Override
    public double sum(double x, double y) {
        double sum = x + y;
        return sum;
    }

    @Override
    public double divide(int x, int y) {
        try{
            double division = x / y;
            return division;
        }catch (ArithmeticException e){
            System.out.println("division by 0");
            return 0;
        }
    }

    @Override
    public double divide(double x, double y) {
        try{
            double division = x / y;
            return division;
        }catch (ArithmeticException e){
            System.out.println("division by 0");
            return 0;
        }
    }
}

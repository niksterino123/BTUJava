public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int prod(int a, int b) {
        return a * b;
    }
}

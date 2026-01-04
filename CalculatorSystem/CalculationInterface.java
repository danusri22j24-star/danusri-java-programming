package CalculatorSystem;

public interface CalculationInterface {
    public int getCalculatorId();
    public void setCalculatorId(int calculatorId);
    public int getResult();
    public void setResult(int result);
    public UserInterface getUser();
    public void setUser(UserInterface user);
    public void compute();
    public void calculate(int a);
    public void calculate(int a,int b);
    public void calculate(int a,int b,int c);
}

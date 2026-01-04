package CalculatorSystem;

public class Multiplier extends Calculation implements MultiplierInterface{

    public Multiplier(int calculatorId,UserInterface user){
        this.setCalculatorId(calculatorId);
        this.setUser(user);

    }
    @Override
    public void compute(){
        this.setResult(getUser().getNum1()*getUser().getNum2()*getUser().getNum3());
        System.out.println(this.getResult());
    }

}

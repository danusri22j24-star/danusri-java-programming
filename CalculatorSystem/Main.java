package CalculatorSystem;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInterface user1 = new User();
        UserInterface user2 = new User();

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter num1:");
        BigInteger num1=new BigInteger(scanner.nextLine());
        user1.setNum1(num1.intValue());

        System.out.println("enter num2:");
        BigInteger num2=new BigInteger(scanner.nextLine());
        user1.setNum2(num2.intValue());

        System.out.println("enter num3:");
        BigInteger num3=new BigInteger(scanner.nextLine());
        user1.setNum3(num3.intValue());

        System.out.println("Enter the type of Calculator(Adder/Multiplier)");
        String type=scanner.nextLine();
        user1.setCalculatorType(type);


        System.out.println("enter num1:");
        BigInteger number1=new BigInteger(scanner.nextLine());
        user2.setNum1(number1.intValue());

        System.out.println("enter num2:");
        BigInteger number2=new BigInteger(scanner.nextLine());
        user2.setNum2(number2.intValue());

        System.out.println("enter num3:");
        BigInteger number3=new BigInteger(scanner.nextLine());
        user2.setNum3(number3.intValue());

        System.out.println("Enter the type of Calculator(Adder/Multiplier)");
        String caltype=scanner.nextLine();
        user2.setCalculatorType(caltype);

         if(user1.getCalculatorType().equals("Adder")){
             CalculationInterface adder=new Adder(4248, user1);
             user1.setAdder(adder);
             System.out.println("======ADDER======");
             adder.compute();
             System.out.println("OVERLOAD");
             adder.calculate(5);
             adder.calculate(5,3);
             adder.calculate(5,3,2);


         }
         else if(user1.getCalculatorType().equals("Multiplier")){
             CalculationInterface multi=new Multiplier(4343,user2);
             user1.setMulti(multi);
             System.out.println("======MULTIPLIER======");
             multi.compute();
         }
         else{
             System.out.println("Type Invalid");
         }

        if(user2.getCalculatorType().equals("Adder")){
            CalculationInterface adder=new Adder(4248,user1);
            user2.setAdder(adder);
            System.out.println("======ADDER======");
            adder.compute();
        }
        else if(user2.getCalculatorType().equals("Multiplier")){
            CalculationInterface multi=new Multiplier(4343,user2);
            user2.setMulti(multi);
            System.out.println("======MULTIPLIER======");
            multi.compute();
        }
        else{
            System.out.println("Type Invalid");
        }

    }
}

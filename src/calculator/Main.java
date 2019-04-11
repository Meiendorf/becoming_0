package calculator;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to simple calculator!");
        System.out.println("Type your equation in format \"x operation y\"");
        System.out.println("For example 65+78.");
        System.out.println("To quit the program close console application.");
        System.out.println("----------------------------------------------");

        Calculator calculator = new Calculator();

        while(true){
            calculator.inputValues();
            calculator.calculate();
            calculator.print();
            System.out.println("----------------------------------------------");
        }
    }
}
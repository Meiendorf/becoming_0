package calculator;

import java.util.Scanner;

//Calculator class that calculates values from Equation class
public class Calculator {

    private Equation equation = new Equation();
    private float result = 0;
    private Scanner in = new Scanner(System.in);

    public float getFirstOperand() {return equation.firstOperand;}
    public float getSecondOperand() {return equation.secondOperand;}
    public String getOperation() {return equation.operation;}
    public boolean isCorrect() {return equation.isCorrect;};
    public float getResult() {return result;}

    Calculator() {

    }

    void inputValues() {
        System.out.print("Write your equation : ");
        String line = in.nextLine();
        this.equation = Equation.parseLine(line);
    }

    void calculate(){
        if (isCorrect()) {
            switch (getOperation()){
                case "+":
                    result = equation.firstOperand + equation.secondOperand;
                    break;
                case "-":
                    result = equation.firstOperand - equation.secondOperand;
                    break;
                case "*":
                    result = equation.firstOperand * equation.secondOperand;
                    break;
                case "/":
                    result = equation.firstOperand / equation.secondOperand;
                    break;
            }
        }
    }

    void print(){
        if(isCorrect()){
            System.out.printf("Equation \"%.2f %s %.2f\" = %.2f\n", getFirstOperand(), getOperation(), getSecondOperand(), result);
        }
        else{
            System.out.println("Equation is wrong!");
        }
    }

}

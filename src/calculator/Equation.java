package calculator;

import java.util.ArrayList;
import java.util.Arrays;

//Class that will store an unsolved equation
public  class Equation{
    public float firstOperand = 0;
    public float secondOperand = 0;
    public String operation = "+";
    //Shows, is equation parsed correctly or not
    public boolean isCorrect = true;

    //It is important that "-" is last operation in order to work with negative numbers
    private static ArrayList<String> operations = new ArrayList<String>(Arrays.asList("+", "/", "*", "-"));
    public static ArrayList<String> getOperations() {return operations;}

    Equation() {

    }
    //Method that parses an equation from string
    //For example -100 * -15
    public static Equation parseLine(String str)
    {
        Equation result = new Equation();
        boolean firstIsNegative = false;
        //Deleting all spaces and tabs
        str = str.replaceAll("\\s+","");

        if(str.length() < 3)
        {
            result.isCorrect = false;
            return result;
        }
        if(str.charAt(0)=='-')
        {
            str = str.substring(1);
            firstIsNegative = true;
        }

        int ind = -1;

        for(String operation : operations) {
            ind = str.indexOf(operation);
            if(ind != -1){
                break;
            }
        }

        if(ind < 1) {
            result.isCorrect = false;
            return result;
        }

        String firstSub = str.substring(0, ind);
        String secondSub = str.substring(ind+1);

        firstSub = firstIsNegative ? "-"+firstSub : firstSub;

        try {
            result.firstOperand = Float.parseFloat(firstSub);
            result.secondOperand = Float.parseFloat(secondSub);
            result.operation = str.charAt(ind)+"";
        }
        catch(Exception e) {
            result.isCorrect = false;
        }

        return result;
    }
}
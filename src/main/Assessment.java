package main;

import util.Input;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Assessment {

    public static Input input = new Input();


    public static void main(String[] args) {
        System.out.println(square(3));
        System.out.println(sum(3,2));
        System.out.println(sum(1.5, 2.5));
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add((double) 3);
        numbers.add((double) 5);
        numbers.add((double) 12);
//        System.out.println(getAverage(numbers));


    }
    public static int square(int number){
        System.out.println(number + " squared is ");
        return number * number;
    }
    public static int sum(int number1, int number2){
        System.out.println(number1 + " + " + number2 + " = " );
        return number1 + number2;
    }
    public static double sum(double number3, double number4) {
        System.out.println(number3 + " + " + number4 + " = ");
        return number3 + number4;
    }
    public static ArrayList getAverage(ArrayList numbersToBeAveraged){
        double average = 0;
        ArrayList<Double> number = new ArrayList<>();
        number.add(double 3);
        for(double number: numbers){
            average += grade;
        }
        return average / grades.size();
    }

    public static double sum(ArrayList numbers) {
        double average = 0;
//        numbersToBeAveraged =
        return numbers += average;
    }

    public static ArrayList capitalizeRecords(ArrayList User){

    }
}

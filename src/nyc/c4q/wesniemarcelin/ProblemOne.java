package nyc.c4q.wesniemarcelin;

/**
 * Created by wesniemarcelin on 8/28/16.
 */
//Write a method named add that takes in two numbers as arguments.
// The function should return the sum of the two numbers.
//
//Examples:
//
//        add(1,2);  // returns 3
//        add(10,12);  // returns 22

//ProblemOne method takes in two parameters and adds the two.
// It then returns the sum.

public class ProblemOne {
    public static int add(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
    //The main prints the returned values, from the add method, to the console
    public static void main(String [] args){
        System.out.println(add(1,2));  // returns 3
        System.out.println(add(10,12));  // returns 22

    }
}

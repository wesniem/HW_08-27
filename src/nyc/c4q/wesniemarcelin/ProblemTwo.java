package nyc.c4q.wesniemarcelin;

/**
 * Created by wesniemarcelin on 8/28/16.
 */
//Write a method named calculateAge that takes two arguments: birth year and
// current year.The method should then calculate the two possible ages based
// on that year, and return the result in the following format:
// (replacing 'NN' with the possible years) : "You are either NN or NN."
//
//        Examples:
//
//        calculateAge(1987, 2016);  // returns 'You are either 28 or 29.

public class ProblemTwo {
    //calculateAge method takes birth year and and current year and subtracts them
    //in order to caluclate an estimate of the age
    public static String calculateAge(int birthYear, int currentYear){
        int age;
        int result2;
        age = currentYear - birthYear;
        result2 = age - 1;
        String output = "You are either " + result2 + " or " + age + ".";

        return output;
    }
    public static void main(String [] args){
        //Prints out the return of the calculateAge method
        System.out.println(calculateAge(1987, 2016));

    }
}

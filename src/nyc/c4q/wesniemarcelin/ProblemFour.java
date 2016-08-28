package nyc.c4q.wesniemarcelin;

/**
 * Created by wesniemarcelin on 8/28/16.
 */
//Write a Java method that takes a string as a parameter and returns true if
//it ends in "ly".
public class ProblemFour {
    //Method used to print the resulted boolean expression
    // from the endsLy method
    public static void printAnswer(boolean a){
        System.out.println(a);
    }
    //Method used to take in a String as a parameter and returns true or false
    //based on whether or not the String ends with the letters ly
    public static boolean endsLy(String word){
        word = word.toLowerCase();
        if(word.endsWith("ly")){
            return true;
        }
        else {
            return false;
        }
    }

    //Main method calls on endsLy function to print out the result from it
    public static void main(String [] args){
        printAnswer(endsLy("family"));//Prints true
        printAnswer(endsLy("BLUE"));//Prints false
        printAnswer(endsLy("SLOWLY"));//Prints true
        printAnswer(endsLy("cat"));//Prints false
        printAnswer(endsLy("dog"));//Prints false
    }
}

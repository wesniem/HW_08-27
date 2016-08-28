package nyc.c4q.wesniemarcelin;

/**
 * Created by wesniemarcelin on 8/28/16.
 */
//Check to see if a string has the same count of 'x's and 'o's.
//        The method must return a boolean and be case insensitive.
//        The string may contain any Unicode character -- not just
//        'x's and 'o's -- and may be of any length.
//
//        Example outputs:
//
//        XO("ooxx")    // returns true
//        XO("xooxx")   // returns false
//        XO("ooxXm")   // returns true
//        XO("zpzpzpp") // returns true because zero 'x's and 'o's are present
//        XO("zzoo")    // returns false

public class ProblemThree {

    public static void returnAnswer(boolean answer){
        System.out.println(answer);
    }
    public static boolean sameXO(String word){
        word = word.toLowerCase();
        boolean isSameCount = false;
        int x = 0;
        int o = 0;
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == 'x'){
                x++;
            }
            else if(word.charAt(i) == 'o'){
                o++;

            }
        }
        if ( x == o){
            isSameCount = true;
        }
        return isSameCount;
    }

    public static void main(String [] args){

        returnAnswer(sameXO("ooxx"));    // returns true
        returnAnswer(sameXO("xooxx"));   // returns false
        returnAnswer(sameXO("ooxXm"));   // returns true
        returnAnswer(sameXO("zpzpzpp")); // returns true because zero 'x's and 'o's are present
        returnAnswer(sameXO("zzoo"));    // returns false

    }
}

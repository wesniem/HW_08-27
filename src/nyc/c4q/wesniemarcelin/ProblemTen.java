package nyc.c4q.wesniemarcelin;

/**
 * Created by wesniemarcelin on 9/4/16.
 */
// QUESTION 10:Counts # of vowels in String


public class ProblemTen {

    public static void main(String[] args) {
        System.out.println(vowels("test string")); // returns 2
        System.out.println(vowels("longer string with more vowels")); // returns 8
    }

    public static int vowels(String word) {
        word = word.toLowerCase();
        int a = 0, e = 0, i = 0, u = 0, o = 0, sum = 0;
        for (int j = 0; j < word.length(); j++) {
            if (word.charAt(j) == 'a') {
                a++;
            }
            if (word.charAt(j) == 'i') {
                i++;
            }
            if (word.charAt(j) == 'o') {
                o++;
            }
            if (word.charAt(j) == 'u') {
                u++;
            }
            if (word.charAt(j) == 'e') {
                e++;
            }
        }
        sum = a + e + i + o + u;
        return sum;
    }
}


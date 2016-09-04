package nyc.c4q.wesniemarcelin;

/**
 * Created by wesniemarcelin on 9/4/16.
 */
public class ProblemEleven {
    // // QUESTION 11:Cut String
    public static void main(String[] args) {
        cutString("this is a test string", 'a'); // returns " test string"
        cutString("this is another test", 'o'); // returns "ther test"
    }

    public static void cutString(String word, char letter) {
        word = word.toLowerCase();
        letter = Character.toLowerCase(letter);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                word = word.substring((i + 1), word.length());
            }
        }
        System.out.println(word);
    }
}

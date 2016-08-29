package nyc.c4q.wesniemarcelin;

/**
 * Created by wesniemarcelin on 8/28/16.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ProblemSeven {
     public static void main(String[] args) {
 	newString("Hello!");
     newString("Hello, world!");
     newString("That's not my name.");
     }
       public static void newString (String input){
           Pattern p = Pattern.compile(" ");
           Matcher m = p.matcher(input);
           boolean b = m.find();
         if (b == true){
             input = input.substring(0,3);
             System.out.println(input + "...");
         }
         else {
             System.out.println(input);
         }
         }
     }

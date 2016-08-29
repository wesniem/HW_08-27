package nyc.c4q.wesniemarcelin;

/**
 * Created by wesniemarcelin on 8/28/16.
 */
import java.util.Scanner;
public class ProblemSix {
    public static void main(String [] args){
 		promptUser("Enter a food: ");
 		String answer = readString();
 		getResponse(answer);

 	}
 public static void getResponse(String food){
 	food = food.toLowerCase();
 	if(food.charAt(0)!='h'){
 		System.out.println("Yuck!");
 		promptUser("Enter a food:");
 		String response = readString();
 		getResponse(response);
 	}
 	if (food.charAt(0) == 'h'){
 		System.out.println("Yum");
 		return;
 	}

 }
 public static void promptUser(String prompt){
   	System.out.println(prompt);
   }

   public static String readString(){
   	 Scanner scanner = new Scanner(System.in);
   	 return scanner.next();
   }
 }


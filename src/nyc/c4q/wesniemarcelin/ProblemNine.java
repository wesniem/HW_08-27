package nyc.c4q.wesniemarcelin;

/**
 * Created by wesniemarcelin on 8/29/16.
 */
public class ProblemNine {

    public static void main(String[] args) {
        print(countCode("aaacodebbb"));//Prints one
        print(countCode("codexxcode"));//Prints two
        print(countCode("cozexxcope"));//Prints two
    }

    public static int countCode(String input) {
        input = input.toLowerCase();
        int count = 0;
        CharSequence pattern = "cde";
        boolean contains = input.contains(pattern);
        if (contains) {
            count++;
        }
        return count;
    }

    public static void print(int x) {
        System.out.println(x);
    }
}
//         else {
//             contains= false;
//         }
//         String findStr = "code";
//         int lastIndex = 0;
//
//         while (lastIndex != -1) {
//
//             lastIndex = input.indexOf(findStr, lastIndex);
//
//             if (lastIndex != -1) {
//                 count++;
//                 lastIndex += findStr.length();
//             }
//         }
    //        if (lastIndex.charAt(2) != 'd') {
//         System.out.println(count);
//         return 0;
//}
//
//     }

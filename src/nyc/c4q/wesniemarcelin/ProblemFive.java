package nyc.c4q.wesniemarcelin;

/**
 * Created by wesniemarcelin on 8/28/16.
 */
//Write a program that creates a single string that represents an 8×8 grid,
//        using newline characters to separate lines. At each position of
//        the grid there is either a space or a “#” character. The
//        characters should form a chess board. Printing the string should
//        show something like this:
//
//        ```
//        # # # #
//        # # # #
//        # # # #
//        # # # #
//        # # # #
//        # # # #
//        # # # #
//        # # # #
//        ```
//        When you have a program that generates this pattern, define a
//        variable size = 8 and change the program so that it works for any
//        size, outputting a grid of the given width and height.
public class ProblemFive {
    public static void main(String[] args) {
        System.out.println(chessBoard(4));
    }

    public static String chessBoard(int limit) {
        String board = "";
        for (int j=0; j < limit; j++) {
            if (j % 2 == 0){
                board += " ";
            }
            for (int i = 0; i < limit; i++) {
                if (i % 2 == 0) {
                    board += "#";
                } else {
                    board += " ";
                }
            }
            board += "\n";
        }
            return board;
    }
}

/*
 * Project with JetBrains Academy - Stage 2/5: The user is the gamemaster 
 * ..."write a program that reads 9 symbols from the input and writes an appropriate 3x3 field...."
 * example:
 * Enter cells: O_OXXO_XX
---------
| O _ O |
| X X O |
| _ X X |
---------
 */
/*
 * Stage 3/5: What's up on the field? 
 * In this stage, you should analyze a Tic-Tac-Toe field. 
 * After printing the field, you need to find the state in which the game is at the moment. Possible states:

    "Game not finished" - when no side has a three in a row but the field has empty cells;
    "Draw" - when no side has a three in a row and the field has no empty cells;
    "X wins" - when the field has three X in a row;
    "O wins" - when the field has three O in a row;
    "Impossible" - when the field has three X in a row as well as three O in a row. Or the field has a lot more X's than O's or vice versa (if the difference is 2 or more, should be 1 or 0).

 */


package ticTacToe;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char a = str.charAt(0);
        char b = str.charAt(1);
        char c = str.charAt(2);
        char d = str.charAt(3);
        char e = str.charAt(4);
        char f = str.charAt(5);
        char g = str.charAt(6);
        char h = str.charAt(7);
        char i = str.charAt(8);
        
        System.out.println("---------");
        System.out.println("| " + a + " " + b + " " + c + " |");
        System.out.println("| " + d + " " + e + " " + f + " |");
        System.out.println("| " + g + " " + h + " " + i + " |");
        System.out.println("---------");
	}

}

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

import java.util.Arrays;
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
        
        char [][] arr = new char[3][3];
        arr[0][0] = a;
        arr[0][1] = b;
        arr[0][2] = c;
        arr[1][0] = d;
        arr[1][1] = e;
        arr[1][2] = f;
        arr[2][0] = g;
        arr[2][1] = h;
        arr[2][2] = i;
                      
       
        String gnf = "Game not finished";
        String draw = "Draw";
        String xs = "X wins";
        String os = "O wins";
        String imp = "Impossible";
        int xCount = 0;
        int oCount = 0;
        
        for (int j=0; j < arr.length; j++) {
        	for (int k =0; k<arr[j].length; k++ ) {
        		if (String.valueOf(arr[j][k]).contains("X")) {
            		xCount++;
        	}
        		if (String.valueOf(arr[j][k]).contains("O")) {
            		oCount++;
        	}
        }
        
     }
                    
        
        for (int j=0; j<arr.length; j++) {
        	String line = null;
        	String line1 = null;
        	String line2 = null;
        	String line3 = null;
        	String line4 = null;
        	String line5 = null;
        	String line6 = null;
        	String line7 = null;
        	String line8 = null;
        	
        	switch (j) {
        	case 0:
        		line1 = (String.valueOf(arr[0][0]) + String.valueOf(arr[0][1]) + String.valueOf(arr[0][2]));
        		line2 = (String.valueOf(arr[1][0]) + String.valueOf(arr[1][1]) + String.valueOf(arr[1][2]));
        		line3 = (String.valueOf(arr[2][0]) + String.valueOf(arr[2][1]) + String.valueOf(arr[2][2]));
        		line4 = (String.valueOf(arr[0][0]) + String.valueOf(arr[1][0]) + String.valueOf(arr[2][0]));
        		line5 = (String.valueOf(arr[0][1]) + String.valueOf(arr[1][1]) + String.valueOf(arr[2][1]));
        		line6 = (String.valueOf(arr[0][2]) + String.valueOf(arr[1][2]) + String.valueOf(arr[2][2]));
        		line7 = (String.valueOf(arr[0][0]) + String.valueOf(arr[1][1]) + String.valueOf(arr[2][2]));
        		line8 = (String.valueOf(arr[0][2]) + String.valueOf(arr[1][1]) + String.valueOf(arr[2][0]));
        		break;
        		
        	       	
        	case 1:
        		line1 = (String.valueOf(arr[0][0]) + String.valueOf(arr[0][1]) + String.valueOf(arr[0][2]));
        		break;
        	
        	case 2:        	
        		line1 = (String.valueOf(arr[1][0]) + String.valueOf(arr[1][1]) + String.valueOf(arr[1][2]));
        		break;
        		
        	case 3:        	
        		line1 = (String.valueOf(arr[2][0]) + String.valueOf(arr[2][1]) + String.valueOf(arr[2][2]));
        		break;	
        		
        	case 4:        	
        		line1 = (String.valueOf(arr[0][0]) + String.valueOf(arr[1][0]) + String.valueOf(arr[2][0]));
        		break;
        		
        	case 5:        	
        		line1 = (String.valueOf(arr[0][1]) + String.valueOf(arr[1][1]) + String.valueOf(arr[2][1]));
        		break;
        		
        	case 6:        	
        		line = (String.valueOf(arr[0][2]) + String.valueOf(arr[1][2]) + String.valueOf(arr[2][2]));
        		break;
        		
        	case 7:        	
        		line1 = (String.valueOf(arr[0][0]) + String.valueOf(arr[1][1]) + String.valueOf(arr[2][2]));
        		break;
        		
        	case 8:        	
        		line1 = (String.valueOf(arr[0][2]) + String.valueOf(arr[1][1]) + String.valueOf(arr[2][0]));
        		break;
        		
        	}
        	try {
        	if (xCount - oCount > 1 || oCount - xCount > 1) {
        		System.out.println(imp);
        	}else if (line1.equals("XXX") || line2.equals("XXX") || line3.equals("XXX") || line4.equals("XXX") || 
        			line5.equals("XXX") || line6.equals("XXX")
        			|| line7.equals("XXX") || line8.equals("XXX")) {
        		System.out.println(xs);
        		break;
        	}else if (line1.equals("OOO") || line2.equals("OOO") || line3.equals("OOO") || line4.equals("OOO") || 
        			line5.equals("OOO") || line6.equals("OOO")
        			|| line7.equals("OOO") || line8.equals("OOO")) {
        		System.out.println(os);
        		break;
        	}else if (xCount - oCount > 1 || oCount - xCount > 1) {
        		System.out.println(imp);
        		break;
        	}
        	else if ((line1.contains(" ") || line2.contains(" ") || line3.contains(" ")) && ((!line1.equals("XXX") ||
        			!line2.equals("XXX") || !line3.equals("XXX") || 
        			!line4.equals("XXX") || !line5.equals("XXX") || !line6.equals("XXX")
        			|| !line7.equals("XXX") || !line8.equals("XXX"))|| ( !line1.equals("OOO") || !line2.equals("OOO") ||
        					!line3.equals("OOO") || 
        			!line4.equals("OOO") || !line5.equals("OOO") || !line6.equals("OOO")
        			|| !line7.equals("OOO") || !line8.equals("OOO")))  )  {
        		System.out.println(gnf);
        		break;
        		
        	}else if((line1.equals("XXX") && line2.equals("OOO")) || (line1.equals("XXX") && line3.equals("OOO"))) {
        		System.out.println(imp);
        		
        		
        	}else if ((line2.equals("XXX") && line3.equals("OOO")) || (line2.equals("XXX") && line1.equals("OOO"))) {
        		System.out.println(imp);
        		
        		
        	}else if ((line3.equals("XXX") && line2.equals("OOO")) || (line3.equals("XXX") && line1.equals("OOO"))) {
        		System.out.println(imp);
        		
        		
        	}
        	else if ((line4.equals("XXX") && line5.equals("OOO")) || (line4.equals("XXX") && line6.equals("OOO"))) {
        		System.out.println(imp);
        		
        		
        	}else if ((line5.equals("XXX") && line6.equals("OOO")) || (line5.equals("XXX") && line4.equals("OOO"))) {
        		System.out.println(imp);
        		
        		
        	}else if ((line6.equals("XXX") && line5.equals("OOO")) || (line6.equals("XXX") && line4.equals("OOO"))) {
        		System.out.println(imp);
        		
        		
        	}      	
        	
        	else {
        		System.out.println(draw);
        	}
        	}
        	catch  (NullPointerException exception )  {
        		System.out.println();
        	}
        	
        		
        	/*  for (int j = 0; j < arr.length; j++) {
        	System.out.println(Arrays.toString(arr[j]) + " ");
        }
        */	
        		
        	
        }
      
	
        
                
        
	}
}

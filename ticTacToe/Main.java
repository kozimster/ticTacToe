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

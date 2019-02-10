package Infix_to_postfix_converter;
import java.util.Scanner;

public class InfixToPostfixCoverter extends StackProgram{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		StackProgram a = new StackProgram();
		
		System.out.print("Enter Infix String: ");
		
		a.infixToPostfix(scan.nextLine());
		
		System.out.println("\n" + a.toString() );
		
	}



}

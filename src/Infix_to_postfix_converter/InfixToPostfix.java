package Infix_to_postfix_converter;

public class InfixToPostfix {
	
	public int getPriority(char c) {
		if ( c == '+' || c == '-') {
			return 1;
		} else {
			return 2;
		}
	}
	
}

package _05_vault;

import java.awt.PageAttributes.ColorType;
import java.util.Random;

public class secage {
	
	public static final String TEXT_RED = "\u001B[31m";
	public static final String TEXT_GREEN = "\u001B[32m";
	public static final String TEXT_RESET = "\u001B[0m";
	public static final String TEXT_YELLOW = "\u001B[33m";
	public static final String TEXT_BLUE = "\u001B[34m";
	public static final String TEXT_PURPLE = "\u001B[35m";
	public static final String TEXT_CYAN = "\u001B[36m";
	public static final String TEXT_WHITE = "\u001B[37m";
	public static final String TEXT_BLACK = "\u001B[30m";



	public static void main(String[] args) {
		
		Vault v = new Vault();
		
		int solve = 0;
		
		for (int i = 0; i < 1000000; i++) {
			
			solve+=1;
			
			boolean a = v.tryCode(solve);
			
			
			if (a == false){
				
				System.out.println(TEXT_RED + "incorrect: " + solve);
				
			}
			if (a == true){
				System.out.println(TEXT_GREEN + "open: " + solve);
				break;
			}
		}
		
		
		}
	}



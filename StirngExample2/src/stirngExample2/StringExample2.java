package stirngExample2;

import java.util.Scanner;

public class StringExample2 {
	
	public static void main(String[] args){
		
		String text = "This is a test text.";
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a term to search the text.");
		String search = keyboard.nextLine();
		
		
		int index = text.indexOf(search);
		
		if (index < 0){
			System.out.println("the Text does not contain that term");
		}else{
			System.out.printf("the search tearm '%s' was found at index %d%n", search, index);
		}
		
		
		System.out.printf("the search term '%s' was found at index %d%n", search, index);
		keyboard.close();
		
	}

}

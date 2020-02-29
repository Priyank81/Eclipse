package quadratic;

import java.util.Scanner;
import java.util.regex.*;

public class Quad {
	
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the quadratic equation");		
		String eq = scan.nextLine();
		System.out.println("entered equation is"+ eq);
		
		Pattern pattern = Pattern.compile("(\\d+)");
		Matcher matcher= pattern.matcher(eq);
		
		//System.out.println(matcher.group(1));
		
		while(matcher.find()) {
			System.out.println(matcher.group(1));
		}
		
		
		
		
		
		
		
		
		
		

	}

}

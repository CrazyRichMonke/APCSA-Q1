// Main.java			
// Pig Latin Converter
// Subhy Alam

import java.util.Scanner;

public class Main
{
	public static boolean isVowel(String s){
		if(s.equals ("A") || s.equals("E")|| s.equals("I")|| s.equals("O")|| s.equals("U")|| s.equals("a") || s.equals("e")|| s.equals("i")|| s.equals("o")|| s.equals("u"))
		{
		return true;
		}
		else{
			return false;
		}
	}
	public static void startsVowel(String s){
		String sub = new String(s.substring(0,1));
		if (!(sub.equals ("A") || sub.equals("E")|| sub.equals("I")|| sub.equals("O")|| sub.equals("U")|| sub.equals("a") || sub.equals("e")|| sub.equals("i")|| sub.equals("o")|| sub.equals("u")));{
			s = s + "way";
		}
	}

	public static void startsConsonant(String s){
		String sub = new String(s.substring(0,1));
		if (sub.equals ("A") || sub.equals("E")|| sub.equals("I")|| sub.equals("O")|| sub.equals("U")|| sub.equals("a") || sub.equals("e")|| sub.equals("i")|| sub.equals("o")|| sub.equals("u"));{
			s = s.substring(1) + s.substring(0,1) + "ay";
		}
	}
	public static String convertWord(String s)
	{ 
		if (Main.isVowel(s)) {
		return (s+ "way").toLowerCase();
	
	} else {
		Main.startsVowel(s);
		Main.startsConsonant(s);
		return s.toLowerCase();
	}
     		     // This statement is provided to allow initial compiling.
	}  
	public static void main (String[] args)
	{
      		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		input.close();
        		 	
		String piggie = Main.convertWord(str);
		System.out.println();
		System.out.println("Converted word: " + piggie);
	}
}


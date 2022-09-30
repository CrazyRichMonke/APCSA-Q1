// Main.java			
// Pig Latin Converter
// Subhy Alam

import java.util.Scanner;

public class PigLatin {

    public static boolean isVowel(String str) {
        if (str.equals("a") || str.equals("A") || str.equals("e") || str.equals("E") || str.equals("i") || str.equals("I") || str.equals("o") || str.equals("O") || str.equals("u") || str.equals("U")) {
            return true;
        } else {
            return false;
        }
    }

    public static String startsVowel(String str) { // doesnt work
            return str + "way";
    }

    public static String startsConsonant(String str) { // doesnt work
        return str.substring(1) + str.substring(0,1) + "ay";
    }

    public static String convertWord(String str) {
        if (PigLatin.isVowel(str) == true) {
            return (str + "way").toLowerCase();
        } else {
            String sub = new String(str.substring(0,1));
            if (sub.equals("a") || sub.equals("A") || sub.equals("e") || sub.equals("E") || sub.equals("i") || sub.equals("I") || sub.equals("o") || sub.equals("O") || sub.equals("u") || sub.equals("U")) {
                return PigLatin.startsVowel(str).toLowerCase();
            } else {
                return PigLatin.startsConsonant(str).toLowerCase();
            }
        }
    }   

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        input.close();

        String piggie = PigLatin.convertWord(str);
        System.out.println();
        System.out.println("Converted word: " + piggie);
    }
}




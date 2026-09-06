import java.util.Scanner;

public class CheckVowelCharacter {

    public static void main(String[] args) {

        System.out.print("\n\n");

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a character to check if it's a vowel:");
        
        char ch = Character.toLowerCase(in.next().charAt(0));
        
        switch (ch) {
            case 'a':
            case 'e':
            case 'o':   
            case 'i':   
            case 'u': 
                System.out.println("This character is a vowel.");
                break;
            
            default: 
                System.out.println("This character is a consonant.");
        }
        
        in.close();
    }
}

import java.util.Scanner;

public class CheckGradeWithSwitch {

    public static void main(String[] args) {

        System.out.print("\n\n");

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your grade");
        
        char grade = Character.toUpperCase(in.next().charAt(0));

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
                
            case 'B':
                System.out.println("Very good");
                break;
                
            case 'C':
                System.out.println("Good");
                break;
                
            case 'D':
                System.out.println("Fair");
                break;
                
            case 'F':
                System.out.println("Failed");
                break;
                
            default:
                System.out.println("Invalid grade");
        }
    }
}

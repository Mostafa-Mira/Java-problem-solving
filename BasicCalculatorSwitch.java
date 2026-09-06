import java.util.Scanner;

public class BasicCalculatorSwitch {

    public static void main(String[] args) {

        System.out.print("\n\n");

        Scanner in=new Scanner(System.in);

        int num1,num2;
        
        System.out.println("Enter two numbers");
        num1=in.nextInt();
        num2=in.nextInt();
        
        System.out.println("Enter '1' to sum them");
        System.out.println("Enter '2' to subtract them");
        System.out.println("Enter '3' to multiply them");
        
        int op=in.nextInt();
        
        switch(op)
        {
            case 1:System.out.println(num1+num2);
            break;
            
            case 2:System.out.println(num1-num2);
            break;
            
            case 3:System.out.println(num1*num2);
            break;
            
            default:System.out.println("invalid input");
        }
        in.close();
    }
}

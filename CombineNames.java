import java.util.Scanner;

public class CombineNames {

    public static void main(String[] args) {

        System.out.print("\n\n");

        Scanner in=new Scanner(System.in);

        String fname="";
        String lname="";
        
        System.out.println("Enter your frist name");
        fname=in.next();
        System.out.println("Enter your last name");
        lname=in.next();
        String name=fname+" "+lname;
        System.out.println("your name is "+name);
    }
}

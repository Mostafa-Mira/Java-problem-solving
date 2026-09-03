import java.util.Scanner;

public class EmployeeSalaryCalculator {

    public static void main(String[] args) {

        System.out.print("\n\n");

        Scanner in=new Scanner(System.in);

        String fname="";
        String lname="";
        
        System.out.println("Enter your frist name");
        fname=in.next();
        System.out.println("Enter your last name");
        lname=in.next();
        
        float salary,net_salary;
        
        System.out.println("enter your salary");
        salary=in.nextFloat();
        net_salary=salary*90/100;
        
        String name=fname+" "+lname;
        System.out.println("your name is "+name);
        System.out.println("your net salary is "+net_salary);
    }
}

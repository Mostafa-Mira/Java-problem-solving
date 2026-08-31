import java.util.Scanner;

public class CalcGradeFromMarks {

    public static void main(String[] args) {

        System.out.print("\n\n");

        Scanner in=new Scanner(System.in);

        float degree;
        
        System.out.println("enter your degree");
        degree=in.nextFloat();
        
        if(degree>=0 && degree<=100)
        {
        
        if(degree>=90)
        {
            System.out.println("your grade is A");
        }
        else if(degree>=80)
        {
            System.out.println("your grade is B");
        }
        else if(degree>=70)
        {
            System.out.println("your grade is C");
        }
        else if(degree>=60)
        {
            System.out.println("your grade is D");
        }
        else
        {
            System.out.println("your grade is F");
        }
        }
        else 
        {
            System.out.println("invalid input");
        }
    }
}

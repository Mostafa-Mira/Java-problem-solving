import java.util.Scanner;

public class CalcAreaOfRectangle {

    public static void main(String[] args) {
        
        System.out.print("\n\n");
        
        Scanner in=new Scanner(System.in);
        
        float length,width,area;
        System.out.println("Enter length and width to calc area for rectangle\n");
        length=in.nextFloat();
        width=in.nextFloat();
        area=length*width;
        System.out.println("area = "+area);
    }
}

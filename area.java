import java.util.*;
class area
{
   public static void main(String args[])
   {
         int area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int l = sc.nextInt();
        System.out.println("Enter breadth:");
        int b = sc.nextInt();
        area = l*b;
        System.out.println("Area of rectangle:"+area);
   }
}
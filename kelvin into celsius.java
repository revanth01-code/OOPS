    import java.util.*;
class heat
{
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         float f;
         System.out.println("Enter celsius  temperature:");
         float c = sc.nextFloat();
         f = (c*9/5)+32;
         System.out.println("Fahrenheit temperatue is :"+f);
      }
}
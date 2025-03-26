import java.util.Scanner;
public class degree{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter temp in C");
float c = input.nextFloat();
System.out.println("Enter temp in F");
float f = input.nextFloat();
float a = (c*(9/5))+32f;
float b = (f-32)*(5/9f);
System.out.print("C to F  :");
System.out.println(a);
System.out.print("F to C  :");
System.out.println(b);
}
}

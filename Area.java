import java.util.Scanner;
public class Area{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter length");
int l = input.nextInt();
System.out.println("Enter breath");
int b = input.nextInt();
System.out.println("Enter height of triangle");
int a = input.nextInt();
System.out.println("Enter base");
int c = input.nextInt();
int Are = l*b;
float d = 0.5f;
double TriArea = a*c*d;
System.out.println("Area of rectangle"+Are);
System.out.println("Area of triangle"+TriArea);
}
}


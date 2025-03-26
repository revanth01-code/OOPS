import java.util.Scanner;
public class age{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter your Age");
int age = input.nextInt();
String a= (age >18) ? "Major" : "Minor";
System.out.print(a);
input.close();
}
}
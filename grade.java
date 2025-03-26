import java.util.Scanner;
public class grade {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter you grade : ");
int grade = input.nextInt();
String result = (grade >9.5) ? "O+" : "A+";
System.out.print(result);
}
}
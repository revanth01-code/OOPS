import java.util.Scanner;
public class factorial{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter a number");
int n = input.nextInt();
long fact = 1;
for(int i=1;i<=n;++i){
 fact = fact*i;}
System.out.print(fact);
}
}
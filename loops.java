import java.util.Scanner;
public class loops{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a number : ");
int n = input.nextInt();
for (int i=1 ; i<=10;++i){
int table = n*i;
System.out.println( n +"x" +i+"=" + table);}
}
}
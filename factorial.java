import java.util.*;
class Fact
{
    public static void main(String args[])
    {
       int number;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number:");
       number = sc.nextInt(); 
       int answer = factorial(number);
       System.out.println("factorial of"+ number + " is " + answer);
       
     } static int factorial(int n){
          if(n==1)
          {
              return 1;
                  }   
    return n * factorial(n-1);
     
      
   }

}
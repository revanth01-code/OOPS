
class simple_calculator{
     void addtion(int a,int b){
        int sum=a+b;
        System.out.println("sum is "+sum);
    }
     void subtraction(int a,int b){
        int diff=a-b;
        System.out.println("difference is "+diff);
    }
}
class Advance_calculator1 extends simple_calculator{
     void multiplication(int a,int b){
        int product=a*b;
        System.out.println("product is "+product);
        }
}
class Ultimate_calculator2 extends Advance_calculator1{
     void division(int a,int b){
        if(b==0){
            System.out.println("error: division by zero");
            }
            else{
                int quotient=a/b;
                System.out.println("quotient is "+quotient);
                }
            }
        }
public class Calculator_ {
    public static void main(String[] args) {
       // Scanner input =  new Scanner(System.in);
       // System.out.println("Enter first number:");
       int a = 5;
        //System.out.println("Enter second number:");
        int b =6;
        Ultimate_calculator2 obj = new Ultimate_calculator2();
        obj.addtion(a,b);
        obj.subtraction(a,b);
        obj.multiplication(a,b);
        obj.division(a,b);
        }
        
    
}

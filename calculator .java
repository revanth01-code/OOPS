public class calculator {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = input.nextInt();
        System.out.println("Enter second number:");
        int b = input.nextInt();
        Ultimate_calculator2 obj = new Ultimate_calculator2();
        obj.addtion(a,b);
        obj.subtraction(a,b);
        obj.multiplication(a,b);
        obj.division(a,b);
        }
        
    
}
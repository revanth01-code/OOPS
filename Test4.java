import java.util.*;
class Employee
{
       public static void main(String args[])
       {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter Employee Details(ename,eid,esal)");
           ename = sc.next();
           eid = sc.nextInt();
           esal = sc.nextFloat();
           System.out.println("--------Displaying Employee Details---------");
           System.out.println("Employee name = "+ename);
           System.out.println("Employee id = "+eid);
           System.out.println("Employee salary ="+esal);
        }
}
           
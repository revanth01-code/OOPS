class shape{
    int length,breath;
    shape(int l,int b){
        this.length=l;
        this.breath=b;
        }
    void  calculateArea(){
        System.out.println("Enter a shape");
    }
    void calculateArea(String Shape){
        if(Shape.equals("Rectangle")){
            System.out.println("Area of Rectangle is "+length*breath);
            }
            else if(Shape.equals("Square")){
                System.out.println("Area of Square is "+length*length);
                }
                else{
                    System.out.println("Invalid Shape");
                    }
                    }
    }
class circle extends shape{
    double radius;
    circle(int l,int b,double r){
        super(l,b);
        this.radius=r;
        }
    void calculateArea(){
        System.out.println("Area of Circle is "+3.14*radius*radius);
        }
        }
public class Shape_main {
    public static void main(String[] args) {
        circle c=new circle(10,20,5);
        c.calculateArea();
        shape n =new shape(10,20);
        n.calculateArea("Rectangle");
        n.calculateArea("Square");
        n.calculateArea("Triangle");
        n.calculateArea();
        }
}

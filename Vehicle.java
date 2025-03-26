class common{
    String Brand;
    int speed;
    public common(String Brand,int speed){
        this.Brand="Unknown";
        this.speed=0;
    }
}
class car extends common{
    int no_of_doors;
    int seating_capacity;
    car(String Brand,int speed,int no_of_doors,int seating_capacity){
        this.Brand = Brand;
        this.speed = speed;
        this.no_of_doors = no_of_doors;
        this.seating_capacity = seating_capacity;
        }
        void display(){
            System.out.println("Brand: "+Brand);
            System.out.println("Speed: "+speed);
            System.out.println("Number of Doors: "+no_of_doors);
            System.out.println("Seating Capacity: "+seating_capacity);
            }
}
class bike extends common{
    boolean has_gears;
    bike(String Brand,int speed,boolean has_gears){
        this.Brand = Brand;
        this.speed = speed;
        this.has_gears = has_gears;
        }
        void display(){
            System.out.println("Brand: "+Brand);
            System.out.println("Speed: "+speed);
            System.out.println("Has Gears: "+has_gears);
            }
}
class truck extends common{
    int capacity;
    truck(String Brand,int speed,int capacity){
        this.Brand = Brand;
        this.speed = speed;
        this.capacity = capacity;
    }
    void display(){
        System.out.println("Brand: "+Brand);
        System.out.println("Speed: "+speed);
        System.out.println("Capacity: "+capacity);
        }
}
public class Vehicle {
    public static void main(String[] args) {
        car c1 = new car("TATA",345,4,5);
        bike b1 = new bike("Hero",98,true);
        truck t1 = new truck("Mahindra",78,2);
        c1.display();
        b1.display();
        t1.display();
    }
}

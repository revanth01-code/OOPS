class Car{
	String CarColor;
	String CarBrand;
	String FuelType;
	double Miliage;
	Car(String CarColor,String CarBrand,String FuelType,double Miliage){
		this.CarColor = CarColor;
		this.CarBrand = CarBrand;
		this.FuelType = FuelType;
		this.Miliage = Miliage;
		}
	void Start(){
		System.out.println("Car Started");
	}
	void Stop(){
		System.out.println("Car Stoped");
	}
	void Service(){
		System.out.println("Car is for Service");
		System.out.println(CarColor);
	}
	}
class CarMain{
	public static void main(String[] args){
		Car c1 = new Car("Black","TATA","Petorl",44.5);
		c1.Start();
	}
	}
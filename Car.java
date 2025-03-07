class Car{
	String CarColor;
	String CarBrand;
	String Fueltype;
	double Miliage;
	Car(String CarColor,String CarBrand,String Fueltype,double Miliage){
		this.CarColor = CarColor;
		this.CarBrand = CarBrand;
		this.Fueltype = Fueltype;
		this.Miliage = Miliage;
		System.out.println(CarColor+" "+CarBrand+" "+Fueltype);
		System.out.println(Miliage);
		}
	void Start(){
		System.out.println("Car Started");
	}
	void Stop(){
		System.out.println("Car Stoped");
	}
	void Service(){
		System.out.println("Your Car is in service");
	}

	public static void main(String[] args){
		Car c1 = new Car("Blue","BMW","Petrol",39.4);
		c1.Start();
		c1.Stop();
		c1.Service();
		Car c2 = new Car("Black","TATA","Petrol",39.4);
		c2.Start();
		c2.Stop();
		c2.Service();
		Car c3 = new Car("Yellow","BMW","Petrol",39.4);
		c3.Start();
		c3.Stop();
		c3.Service();
		}
	}
		
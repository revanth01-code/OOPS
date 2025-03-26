class CarMain{
	String CarColor;
	String CarBrand;
	String FuelType;
	double Miliage;
	CarMain(String CarColor,String CarBrand,String FuelType,double Miliage){
		this.CarColor = CarColor;
		this.CarBrand = CarBrand;
		this.FuelType = FuelType;
		this.Miliage = Miliage;
		System.out.println(CarColor);
		System.out.println(CarBrand);
		System.out.println(FuelType);
		System.out.println(Miliage);
		}//Constructor End
	public void Start(){
		System.out.println("Car Started");
	}//Method End
	public void Stop(){
		System.out.println("Car Stoped");
	}//Method End
	public void Service(){
		System.out.println("Car is for Service");
	}//End Method
	//Main Class Start
	public static void main(String[] args){
		CarMain c1 = new CarMain("Black","TATA","Petorl",44.5);
		c1.Start();
		c1.Stop();
		c1.Service();
		CarMain c2 = new CarMain("Red","Hundyi","Petorl",35.5);
		c2.Start();
		c2.Stop();
		c2.Service();
		CarMain c3 = new CarMain("White","BMW","Petorl",54.5);
		c3.Start();
		c3.Stop();
		c3.Service();
	}
	}
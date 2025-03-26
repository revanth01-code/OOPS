class MyClass{
	static int count = 0;
	final double pi = 3.14;
	MyClass(){
		count = count+1;
		
		}
	public static void main(String[] args){
	MyClass m1 =  new MyClass();
	MyClass m2 =  new MyClass();
	MyClass m3 =  new MyClass();
	MyClass m4 =  new MyClass();
	MyClass m5 =  new MyClass();
	System.out.println(count);
	}
	}
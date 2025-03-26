class Book{
	String Title;
	String Author;
	int YearOfPublisiton;
	Book(String Title,String Author,int YearOfPublisiton){
		this.Title = Title;
		this.Author = Author;
		this.YearOfPublisiton = YearOfPublisiton;
		}
	void Display(){
		System.out.println("Title of the book : "+Title + "\n"  + "Author :" + Author);
		System.out.println("Year of published : "+YearOfPublisiton);
		}
	public static void main(String[] args){
		Book b1 = new Book("Atomic habits","James Clear",2014);
		b1.Display();
		Book b2 = new Book("rich dad poor Dad","Robort.T",2012);
		b2.Display();
		}
	}
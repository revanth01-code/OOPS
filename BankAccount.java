class BankAccount{
	String Name;
	double AccountNumber;
	String IFSC;
	String Branch;
	int Current = 0;
	BankAccount(String Name,double AccountNumber,String IFSC,String Branch){
		this.Name = Name;
		this.AccountNumber = AccountNumber;
		this.IFSC = IFSC;
		this.Branch = Branch;
		System.out.println(Name);
		System.out.println(AccountNumber);
		System.out.println(IFSC);
		System.out.println(Branch);
		}//Constructor End
	void Deposit(int Amount){
		System.out.println("Your Deposited Amount is : "+Amount);
		Current = Current + Amount;
		}
	void Withdraw(int WAmount){
		if (WAmount<=Current){
			System.out.println("You Can Withdraw");
			Current = Current - WAmount;
			System.out.println("Current amount after withdraw is:"+Current);
		}
		else if (WAmount >Current){
			System.out.println("Insufficent funds");
		}
		}//Methods End
		//Main class start
		public static void main(String[] args){
		BankAccount b1 = new BankAccount("Revanth",12345,"34jd","Medak");
		b1.Deposit(30000);
		b1.Withdraw(1000);
		BankAccount b2 = new BankAccount("Rithwik",12345,"34jd","Manciryal");
		b2.Deposit(10000);
		b2.Withdraw(21000);
	}
	}
class Bankaccount{
    String Name;
    String AccountNumber;
    String IFSC;
    String Branch;
    int Current = 0;

    Bankaccount(String Name, String AccountNumber, String IFSC, String Branch){
        this.Name = Name;
        this.AccountNumber = AccountNumber;
        this.IFSC = IFSC;
        this.Branch = Branch;
    }

    void Deposit(int amount){
        System.out.println("Your deposited amount is: " + amount);
        Current = Current + amount;
    }

    void Withdraw(int wamount){
        if (wamount <= Current){
            System.out.println("You can withdraw amount");
            Current = Current - wamount;
        } else {
            System.out.println("Insufficient funds");
        }
        System.out.println("Current balance: " + Current);
    }

    public static void main(String[] args){
        Bankaccount b1 = new Bankaccount("Revanth","234m","icic1234","Medak");
        b1.Deposit(200000);
        b1.Withdraw(3000);

        Bankaccount b2 = new Bankaccount("Sita","567n","hdfc5678","Hyderabad");
        b2.Deposit(100000);
        b2.Withdraw(300000);
    }
}

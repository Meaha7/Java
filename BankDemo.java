import java.util.Scanner;                  //Meaha 

class Account
{
	protected int accnumber;       //Class Account to maintain account Number & balance
	protected double balance;
	
	Account()
	{
		accnumber=0;
		balance=0.0;
	}
	
	Account(int acno,double bal)
	{
		accnumber=acno;
		balance=bal;
	}

}

class SBAccount extends Account
{
	void deposit(double amount)               // to deposit
	{
		if(amount>0)
		balance+=amount;
		else
		System.out.println("Amount Entered is Invalid !x");
	}

	void withdraw(double amount)         //to withdraw
	{
		if(balance>1000)
		balance-=amount;
		else
		System.out.println("Minimum balance is not available");
	}

	void calc_interest()                 //to calculate interest
	{
		double interest;
		interest=0.04*balance;
		balance+=interest;
	}
	SBAccount()
	{
		super();
	}

	SBAccount(int account_number,double init_balance)   
	{
		super(account_number,init_balance);
	}
}

class Customer                         // Customer class to store cust_id,name,address
{
	int cust_id;
	String name,address;
	SBAccount obj=new SBAccount(0,0.0);

	Customer()
	{
		cust_id=0;
		name=null;
		address=null;
		obj.accnumber=0;
		obj.balance=0.0;
	}

	Customer(int id,String cname,String add,int accno,double bal)   // Parametrised COnstructor
	{
		cust_id=id;
		name=cname;
		address=add;
		obj.accnumber=accno;
		obj.balance=bal;
	}

	Scanner sc=new Scanner(System.in);
	void getDetails()                                // To get details
	{
		System.out.print(" Enter id : ");
		cust_id=sc.nextInt();
		System.out.print(" Enter name : ");
		name=sc.next();
		System.out.print(" Enter address : ");
		address=sc.next();	
		System.out.print(" Enter account Number : ");
		obj.accnumber=sc.nextInt();	
		System.out.print(" Enter initial Balance : ");
		obj.balance=sc.nextDouble();
	}

	void transaction(int type)    //transaction done here !
	{
		switch(type)
		{
			case 1:System.out.print(" Enter the amount to be deposited :");
				double one=sc.nextDouble();
				obj.deposit(one);
				System.out.print(" The balance amount after depositing :"+obj.balance);
				break;
			case 2:
			   	System.out.print(" Enter the amount to be withdrawn :");
				double two=sc.nextDouble();
				obj.withdraw(two);
				System.out.print(" The balance amount after withdrawal : "+obj.balance);
				break;
			case 3:obj.calc_interest();
				System.out.print(" The balance amount after adding the interest :"+obj.balance);
				break;
			default:System.out.println(" Enter a valid number");
		}
	}

	void display()
	{
		System.out.println("\tID             : "+cust_id);	
		System.out.println("\tName           : "+name);
		System.out.println("\tAddress        : "+address);
		System.out.println("\tAccount Number : "+obj.accnumber);
		System.out.println("\tAccount Balance: "+obj.balance);
		System.out.println();
	}
}
class BankDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);   // n=5 as per question..I have given it in o/p
		char rep;
		System.out.print(" Enter Number of persons :");  
		int n=sc.nextInt();

		Customer[] person=new Customer[n];

		for(int i=0;i<n;i++)
		{
			person[i]=new Customer();
		}

	for(int i=0;i<n;i++)
	{ 
			int x=i+1;
			System.out.println(" Enter Customer "+i+" Details \n");
			person[i].getDetails();
		

			System.out.print(" Enter 1 for Deposit \n Enter 2 for withdrawal \n Enter 3 for calculating interest :");
		
		
		do
		{

			System.out.print(" Enter Number for operation on account");
			int h=sc.nextInt();
			person[i].transaction(h);
			System.out.print(" Want to Continue? Y or N ? ");
			rep=sc.next().charAt(0);
		}while(rep=='Y');

	        
	}

		for(int i=0;i<n;i++)     // Printing the details At last !!!
		{
			System.out.println(" Customer "+i);
			person[i].display();
		}
	}	
}                                 
                              

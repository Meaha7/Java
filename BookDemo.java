class Book
{                                             // Done By Meaha
	private String BKName;  
        private int BKId;               // Private Data Members
	private String BKAuthor;

	public Book(String Bname ,int BId , String BAuthor)   //Parametrised Constructor
	{
		BKName=Bname;
		BKId=BId;
		BKAuthor=BAuthor;
	}

 	public void BKUpdatedetails(String Name,int Id,String Author)  //Method to accept new value
	{
		BKName=Name;
		BKId=Id;
		BKAuthor=Author;
	}

 	public void BKDisplay() // Method to display the Book Details
	{
		System.out.println("========================================");
		System.out.println(" Book ID       : "+BKId);
		System.out.println(" Book Name     : "+BKName);
		System.out.println(" Book Author   : "+BKAuthor);
		System.out.println("========================================");
		
	}
}

class BookDemo 
{
	public static void main(String[] args) // Main Function
	{
		System.out.println();	
		System.out.println("=*=*=*=*=*=*=   Old Details    *=*=*=*=*");

		Book ob=new Book("C Programming",100,"Dennis Ritchie");
		ob.BKDisplay();

		System.out.println();
		System.out.println("=*=*=*=      Updated Details      =*=*=*");
		ob.BKUpdatedetails("Java Programming",100,"James Gosling");
		ob.BKDisplay();

	}
}

import java.util.*;               // Done By Meaha
import java.io.*;

class InvalidinputException extends Exception         // Exception
{
	String s;
	InvalidinputException(String s2)
	{
		s=s2;
	}
	public String toString()
	{
		return ("Invalid input");
	}

	
}
class Bookshopmethods
{
	int n=5;
	Scanner sc=new Scanner(System.in);                    
	String[] title=new String[n];
	String[] author=new String[n];
	String[] publisher=new String[n];
	int[] price=new int[n];
	int[] stock_position=new int[n];
	
	void setdata()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the  Details of Book "+(i+1));
			System.out.println("Enter the title of the " + (i+1)+" book:");
			title[i]=sc.nextLine();

			System.out.println("Enter the author of the " + (i+1)+" book:");
			author[i]=sc.nextLine();

			System.out.println("Enter the publisher of the " + (i+1)+" book:");
			publisher[i]=sc.nextLine();

			System.out.println("Enter the price of the " + (i+1) + " book:");
			price[i]=sc.nextInt();

			System.out.println("Enter the number of books present in the Book shop:");
			stock_position[i]=sc.nextInt();
			sc.nextLine();
		}
}

void search()
{
	int i;
	System.out.println("************Books present in the Book shop are********");
	for(i=0;i<n;i++)
	{
		System.out.println((i+1) + ". Title of the book:" +title[i]);
	}
	System.out.println("Enter the title of the book needed:");
	String titkey;
	titkey = sc.nextLine(); 
	System.out.println("Enter the author of the book needed:");
	String authkey;
	authkey = sc.nextLine();
	int flag=0;
	for(i=0;i<n;i++)
	{
		if(titkey.equals(title[i])) 
		if( authkey.equals(author[i]))
 		{
  			flag++;
  			break;
		}
	}
	if(flag != 0)
	{
		System.out.println("******Details of the book you needed is*****");
		System.out.println("Title of the book:"+title[i]);
		System.out.println("Author of the book:"+author[i]);
		System.out.println("Publisher of the book:"+publisher[i]);
		System.out.println("Cost of the book:"+price[i]);
		System.out.println("Number of books presernt in the Book shop:"+stock_position[i]);
		System.out.println("Enter no of copies of book required");
		int copies;
		copies=sc.nextInt();
		if(copies>=0)
		{
			if(stock_position[i]>=copies)
			{
				System.out.println("Requested copies are available");
				System.out.println("Total price is: "+copies*price[i]);
			}
	else
	{
		
		System.out.println("Book not present in the store");
	}
	}
	else
	{
		try
		{
			throw new InvalidinputException("invalid input");
		}
			catch (InvalidinputException e)
			{System.out.println("IO Error");
			System.out.println(e);
	      }
           }
}
else
	{
		
		System.out.println("Book not present in the store");
	}
		
}
}

public class Books
{
public static void main(String args[])
{
	int choice;
	Bookshopmethods ob=new Bookshopmethods();
	Scanner sc=new Scanner(System.in);
	
	while(true)
	{
	System.out.println("Menu:1.Input Data 2.Book search 3.Exit");
	System.out.println("Enter your choice");
	choice=sc.nextInt();
	switch(choice)
	{
		case 1: ob.setdata();
		break;
		case 2: ob.search();
		break;
		case 3: System.exit(0);
	}
	}
}
}
// Thank You !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

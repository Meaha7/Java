import java.io.*;
class OperationFailedException extends Exception
{
	String des;
	OperationFailedException()
	{
		super();
	}
	OperationFailedException(String des)
	{
		super(des);
		this.des=des;
	}
	OperationFailedException(String des,Throwable t)
	{
		super(des,t);
	}
	public String toString()
	{
		return des;
	}
}

class BadOperatorException extends Exception
{
	char b;
	BadOperatorException()
	{
		super();
	}
	BadOperatorException(char b)
	{
		super(String.valueOf(b));
		this.b=b;
	}
	public String toString()
	{
		return String.valueOf(b);
	}
}

class BadOperandException extends Exception
{
	int a;
	BadOperandException()
	{
		super();
	}
	BadOperandException(int a)
	{
		super(String.valueOf(a));
		this.a=a;
	}
	public String toString()
	{
		return String.valueOf(a);
	}
}
class OperationException
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		OperationFailedException oe;
		System.out.println("Enter two operands and a operator:");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		char c=(char)br.read();
		try
		{
			if(!(a>=10000 && a<=50000))
			{
				oe=new OperationFailedException("First Operand-Invalid");
				oe.initCause(new BadOperandException(a));
				throw oe;
			}
			if(!(b>=500 && b<=5000))
			{
				oe=new OperationFailedException("second operand-Invalid.");
				oe.initCause(new BadOperandException(b));
				throw oe;
			}

		if(!(c=='+'||c=='-'||c=='*'||c=='/'))
		{
			oe=new OperationFailedException(c+"-Invalid operator");
			oe.initCause(new BadOperatorException(c));
			throw oe;
		}
		int d=0;
		switch(c)
		{
			case '+':d=a+b;
   			break;
			case '-':d=a-b;
			break;
			case '*':d=a*b;
			break;
			case '/':d=a/b;
			default:System.out.println("Invalid operator.");
		}
		System.out.println(d);
		}
		
	catch(OperationFailedException of)
	{
		System.out.println("Exception occured:"+of);
		System.out.println("Root cause:"+of.getCause());
	}
	}
}
//  Thank You !!!!!!!!!!!!!!

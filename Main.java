class Factorial extends Thread
{
	public void run()
	{
		int f=1;
		for(int i=1;i<=10;i++)
		f=f*i;
		System.out.println(f);
		try
		{
			sleep(500);
		}
		catch(InterruptedException e)
		{
		}
	}
}

class SumOfSeries extends Thread
{
	public void run()
	{
		int sum=0;
		for(int i=1;i<=10;i++)
		sum=sum+i;
		System.out.println(sum);
	}
}

class MultiplicationTable extends Thread
{
	public void run()
	{
		for(int i=1;i<=12;i++)
		{
			System.out.println("8 X "+i+"="+8*i);
			try
			{
				sleep(400);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
}
class Main
{
	public static void main(String meaha[])
	{
		Factorial x=new Factorial();
		SumOfSeries y=new SumOfSeries();
		MultiplicationTable z=new MultiplicationTable();
		System.out.println("     ____________________Program Beginning__________________");
		x.start();
		System.out.println("Is Alive ?"+x.isAlive());
		y.start();
		z.start();
		y.setPriority(1);
		try
		{
			z.join();
		}
		catch(InterruptedException ie)
		{
		}
		System.out.println("  Priority which is set for SumOfSeries is: "+y);
		System.out.println("  Thread priority for SumOfSeries = " + y.getPriority());
		System.out.println("  Is Alive ? :"+x.isAlive());
		System.out.println("    ---------------Program terminated--------------");
	}
}

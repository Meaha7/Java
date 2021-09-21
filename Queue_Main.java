class Queue

{

	int a[];

	int front,rear;

	int i=0;

	boolean full=false,empty=true;

	int n;


	Queue(int n)

	{

		this.n = n;

		a = new int[n];

		front = 0;

		rear = 0;

	}


	synchronized void put(int t)

	{

		if(n == rear)

		try
		{
			wait();
		}

		catch(Exception e)
		{
		}

		
		a[rear]=t;

		System.out.println("Producer: "+a[rear]);

		rear++;

		full=true;

		notify();

	}



	synchronized int get()

	{

		int val;

		if(front==rear)

		try
		{
			wait();
		}
		
		catch(Exception e)
		{
		}

		val = a[front];

		front++;

		if(front > rear)

		{

			front =-1;

			rear = -1;

		}

		empty = true;

		notify();

		return(val);

	}

}


class Producer extends Thread 

{

	Queue q;

	Producer(Queue q)

	{

		this.q = q;

	}


	public void run()

	{

		int i=1;

		while(true)

		{

			q.put(i);

			i++;

			try
			{
				sleep(300);
			}
			catch(Exception e)
			{
			}

		}

	}

}



class Consumer extends Thread

{

	Queue q;

	Consumer(Queue q)

	{
		
this.q = q;

	}

	public void run()

	{

		while(true)

		{

			System.out.println("Consumer: "+q.get());

			try

			{
				sleep(300);
			}
			catch(Exception e)
			{
			}

		}

	}

}


class Queue_Main
{
	public static void main(String arg[])throws 
ArrayIndexOutOfBoundsException

	{

		int n=10;

		Queue q = new Queue(n);

		Producer p = new Producer(q);

		Consumer c = new Consumer(q);

		p.start();

		c.start();

	}

}

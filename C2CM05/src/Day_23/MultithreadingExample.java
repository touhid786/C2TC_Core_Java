package Day_23;

public class MultithreadingExample extends Thread {
int st;
String msg;

public MultithreadingExample( String msg,int st) {
	this.st = st;
	this.msg = msg;
}

@Override
public void run() {
	for (int i=1;i<=10;i++)
	{
		try
	{
			Thread.sleep(st);
	}
	catch(Exception e)
	{
		
	}
	System.out.println(msg + i);
}
}
}
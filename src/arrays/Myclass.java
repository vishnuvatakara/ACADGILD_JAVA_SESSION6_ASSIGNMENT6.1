package arrays;

public class Myclass {
	//array of size 10
	int[] array=new int[10];
	int i;
	//initialization
	void initialization()
	{
		for(i=0;i<10;i++)
		{
			array[i]=i+1;
		}
	}
	//printing even numbers
	void evenNum()
	{	System.out.println("even numbers are");
		for(i=0;i<10;i++)
		{
			if(array[i]%2==0)
				System.out.println(array[i]);
		}
	}
	public static void main(String args[]) {
		Myclass obj=new Myclass();
		obj.initialization();
		obj.evenNum();
		
	}
}

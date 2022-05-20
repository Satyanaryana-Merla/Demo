package Variables;

public class instance 
{
	int a=10;
	int b=20;
	int c=a+b;
	public static void main(String args[])
	{
		instance obj=new instance();
		System.out.println(+obj.c);
	}
}
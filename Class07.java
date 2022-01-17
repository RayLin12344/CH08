package Java08;
class CTest
{
	public void test(int x)
	{
		if(x%2==0 & x!=0)
		{
			System.out.println("此樹為偶數");
		}
		else if(x==0)
		{
			System.out.println("此數為0");
		}
		else
		{
			System.out.println("此樹為奇數");
		}
	}
}
public class Class07
{

	public static void main(String[] args)
	{
		CTest ct=new CTest();
		ct.test(3);
		ct.test(8);
		ct.test(0);
	}
}

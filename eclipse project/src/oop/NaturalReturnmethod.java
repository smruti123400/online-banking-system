package oop;

public class NaturalReturnmethod
{
	static int sumofnaturalnumber(int m){
		int sum =0;
		for(int i=1;i<=m;i++)
		{
			sum = sum+i;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
	int s1=	sumofnaturalnumber(5);
	System.out.println(s1);
	int s2 =sumofnaturalnumber(9);
	System.out.println(s2);

	}

}

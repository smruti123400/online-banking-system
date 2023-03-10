package oop;

public class Powerreturnmethod 
{
static int pow(int n, int m)
{
int pw =1;
while (m>0) 
{
	pw = pw*n;
	m--;	
}
return pw;
}
	public static void main(String[] args) 
	{
		int n1 =pow(3,3);
		System.out.println(n1);
		int n2 =pow(6,7);
		System.out.println(n2);

	}

}

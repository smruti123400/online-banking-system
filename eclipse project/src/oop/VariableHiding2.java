package oop;

public class VariableHiding2 extends VariableHiding 
{
float a =85.2f;
void print()
{
	int a =111;
	System.out.println(a);
	System.out.println(VariableHiding.a);
	System.out.println(this.a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			VariableHiding2 obj = new VariableHiding2();
			obj.print();
			System.out.println(obj.a);
		}
	}

}

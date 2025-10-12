package p1;

public class A
{
	public void myFunA()
	{
		System.out.println("inside class A");
	}
}

class B extends A
{
	void myFunB()
	{
		System.out.println("inside class b");
		A ref=new A();
		ref.myFunA();
	}

}

class C
{
	void myFunC()
	{
		System.out.println("inside class c");
		A ref=new A();
		ref.myFunA();
	}
}
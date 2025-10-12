package p2;
import p1.A;

class X
{
	void myFunX()
	{
		System.out.println("inside class x");
		A ref=new A();
		ref.myFunA();
	}
	

}

class Y extends A
{
	void myFunY()
	{
		System.out.println("inside class y");
		A ref=new A();
		ref.myFunA();
	}
}
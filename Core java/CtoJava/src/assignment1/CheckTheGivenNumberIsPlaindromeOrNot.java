package assignment1;

public class CheckTheGivenNumberIsPlaindromeOrNot {

	public static void main(String[] args) {
		int num=111;
		int reverse,r1,r2,r3,q1;
		r1=num%10;
		q1=num/10;
		r2=q1%10;
		r3=q1/10;
		reverse=(r1*100)+(r2*10)+r3;
		if(reverse==num)
		{
			System.out.printf("The given number %d is palindrome",num);
		}
		else
		{
			System.out.printf("The given number %d is not palindrome",num);
		}

	}

}

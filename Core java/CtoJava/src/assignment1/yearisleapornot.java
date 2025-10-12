package assignment1;

public class yearisleapornot {

	public static void main(String[] args) {
			int year=2004;
			if(year%4==0&&year%100!=0||year%400==0)
			{
				System.out.printf("the given year %d is leap year",year);
			}
			else
			{
				System.out.printf("the given year %d is not leap year",year);
			}
		}

	}


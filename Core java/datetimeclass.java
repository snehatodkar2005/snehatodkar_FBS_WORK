class Date
{
int day,month,year;
}//date calss ends here

class Time
{
int hr,min,sec;
}//time class ends here

class Test1
{
public static void main(String[] args)
{
Date d1=new Date();
d1.day=03;
d1.month=09;
d1.year=2025;
System.out.println("Date is "+d1.day+"/"+d1.month+"/"+d1.year);
Time t1=new Time();
t1.hr=12;
t1.min=47;
t1.sec=09;
System.out.println("Time is "+t1.hr+":"+t1.min+":"+t1.sec);
}
}
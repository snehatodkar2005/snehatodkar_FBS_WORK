class Date
{
int day,month,year;
String dow;//reference
}//class date ends here
class Test
{
public static void main(String[] args)
{
Date d1;
d1=new Date();
d1.day=3;
d1.month=9;
d1.year=2025;
d1.dow="wednesday";
System.out.println(d1.day);
System.out.println(d1.month);
System.out.println(d1.year);
System.out.println(d1.dow);
}
}
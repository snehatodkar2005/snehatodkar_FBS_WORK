class Date
{
int day,month,year;
String dow;//reference

void setDay(int a)
{
this.day=a;
}

void setMonth(int m)
{
this.month=m;
}

void setYear(int y)
{
this.year=y;
}

void setDow(String str)
{
this.dow=str;
}
}//class date ends here

class test
{
public static void main(String[] args)
{
Date d1=new Date();
d1.dow="Thuresday";
d1.setDay(4);
d1.setMonth(9);
d1.setYear(2025);
System.out.println(d1.day+"/"+d1.month+"/"+d1.year);
System.out.println(d1.dow);
}//main ends here
}//class test ends here
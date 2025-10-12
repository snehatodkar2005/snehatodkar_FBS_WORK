class vehical{
    String color;
	String brand;
	int speed;
	vehical() {

		this.color = "Grey";
		this.brand = "Honda";
		this.speed = 120;
	}//default constructor
	
	
	vehical(String color, String brand, int speed) {

		this.color = color;
		this.brand = brand;
		this.speed = speed;
	}//parameterized constructor
	
	
	
	String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
	String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	int getSpeed() {
		return speed;
	}
	void setSpeed(int speed) {
		this.speed = speed;
	}//getter setter


	void display()
	{
		System.out.println("Colour"+this.color);
		System.out.println("Brand"+this.brand);
		System.out.println("Speed"+this.speed+"km/h");
	}//display end here
	
	String brake()
	{
		return "brake function applied";
	}
	
}//class vehical end here



class car extends vehical
{
	int noOfDoors;

	car() {
		super();
		this.noOfDoors = 12;
	}//default constructor

	car(String color, String brand, int speed,int noOfDoors) {
		super(color,brand,speed);
		this.noOfDoors = noOfDoors;
	}//parametrized constructor

	int getNoOfDoors() {
		return noOfDoors;
	}

	void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	
	void display()
	{
		super.display();
		System.out.println("No of Doors"+this.noOfDoors);
	}
	
	String brake()
	{
		return "car drum brake applied";
	}
	
}//class car end here



class bike extends vehical 
{
	int engineCapacity;

	bike() {
		super();
		this.engineCapacity = 150;
	}//default constructor

	
	
	bike(String color, String brand, int speed,int engineCapacity) {
		super(color,brand,speed);
		this.engineCapacity = engineCapacity;
	}//parametrized constructor



	int getEngineCapacity() {
		return engineCapacity;
	}



	void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	
	void display()
	{
		super.display();
		System.out.println("Engine Capacity"+this.engineCapacity+" c");
	}
	
	String brake()
	{
			return "bike disc brake applied";
	}
	
	
}//class bike end here



class truck extends vehical
{

	double loadCapacity;

	truck( ) 
	{
		super();
		this.loadCapacity =20;
	}//default constructor

	
	
	truck(String color, String brand, int speed,double loadCapacity) {
		super(color,brand,speed);
		this.loadCapacity = loadCapacity;
	}//parametrized constructor



	double getLoadCapacity() {
		return loadCapacity;
	}



	void setLoadCapacity(double loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
	
	
	void display()
	{
		super.display();
		System.out.println("Load Capacity"+this.loadCapacity+" tons");
	}
	
	String brake()
	{
		return "truck air brake applied";
	}
}//class truck end here


class vehicalTest {

	public static void main(String[] args) {
		vehical vehical1=new vehical("Black","BMW",120);
		vehical1.display();
		System.out.println(vehical1.brake());
		
		vehical1=new car("Black","BMW",120,4);
		vehical1.display();
		System.out.println(vehical1.brake());
		
		vehical1=new bike("Red","R15",329,786);
		vehical1.display();
		System.out.println(vehical1.brake());
		
		vehical1=new truck("Red","Ford",782,1500);
		vehical1.display();
		System.out.println(vehical1.brake());
		

	}//main end here

}//class vehicaltest end here
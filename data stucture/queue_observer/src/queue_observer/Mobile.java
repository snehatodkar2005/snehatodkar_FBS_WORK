package queue_observer;

public class Mobile implements Observer{
	private float temp;
	Observable WeatherStation;
	
	public Mobile() {
	}
	
	public Mobile(Observable v1)
	{
		this.WeatherStation=v1;
		v1.subscribe(this);
	}
	public void update(float temp) {
        this.temp = temp;
        display();
    }

    public void display() {
        System.out.println("Mobile Display Updated Temperature: " + temp);
    }

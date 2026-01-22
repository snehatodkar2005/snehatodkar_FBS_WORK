package queue_observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observer{

	List<Observer> mylist=new ArrayList();
	private float temp;


	@Override
	public void subscribe(Observer o) {
		// TODO Auto-generated method stub
		mylist.add(o);
		
	}

	@Override
	public void unSubscribe(Observer o) {
		System.out.println("you have not subscribe");
		
	}
	@Override
	public void nofifyAllObserver() {
		for(Observer ref:mylist)
		{
			ref.update(temp);
		}
	}
	
	public void tempChanged()
	{
		nofifyAllObserver();
	}
	
	public void changeTemp(float temp)
	{
		this.temp =temp;
        tempChanged();
	}

	
	
}

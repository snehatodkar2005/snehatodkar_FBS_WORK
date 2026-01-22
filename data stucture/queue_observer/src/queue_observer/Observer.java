package queue_observer;

public interface Observer {
	public void subscribe(Observer o);
	public void unSubscribe(Observer o);
	public void nofifyAllObserver();
	

}

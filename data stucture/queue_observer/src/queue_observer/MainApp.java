package queue_observer;

public class MainApp {


    public static void main(String[] args) {

        WeatherStation ws = new WeatherStation();

        Mobile m1=new Mobile(ws);
        Mobile m2=new Mobile(ws);
        
//        Display d1 = new Display();
//        Display d2 = new Display();

//        ws.subscribe(d1);
//        ws.subscribe(d2);
//
//        ws.changeTemp(32.5f);
//        ws.changeTemp(40.0f);
        
        
    }
}


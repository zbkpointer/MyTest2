package example04;

import example03.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;
    private Observable weatherData ;


    public CurrentConditionDisplay(Observable weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);

    }


    @Override
    public void display() {
        System.out.println("Current Condition :"+"temp"+temp+"degrees,"+"humidity"+humidity+"% ");
    }

    @Override
    public void update(Observable o, Object arg) {
            if (o instanceof WeatherData){
                WeatherData weatherData = (WeatherData)o;
                this.temp = weatherData.getTemp();
                this.humidity = weatherData.getHumidity();
            }
    }
}

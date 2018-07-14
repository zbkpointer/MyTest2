package example04;

import example03.DisplayElement;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class ForeCastDisplay implements Observer, DisplayElement {
    private float temp;
    private ArrayList<Float> tempArray;
    private Observable weatherData ;

    public ForeCastDisplay(Observable o){
        this.weatherData = o;
        weatherData.addObserver(this);
        tempArray = new ArrayList<>();
    }


    @Override
    public void display() {
        System.out.println("The max temp is:"+maxTemp()+"degree");
        System.out.println("The mix temp is:"+minTemp()+"degree");
        System.out.println();
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            tempArray.add(weatherData.getTemp());
        }
    }


    public float maxTemp(){

        float max = tempArray.get(0);
        for (int i = 0; i <tempArray.size() ; i++) {
            max =Math.max(max,tempArray.get(i));
        }

        return max;
    }

    public float minTemp(){
        float min = tempArray.get(0);
        for (int i = 0; i <tempArray.size() ; i++) {
            min =Math.min(min,tempArray.get(i));
        }

        return min;
    }
}

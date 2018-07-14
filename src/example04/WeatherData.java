package example04;


import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {
   // private ArrayList observers;
    private float temp;
    private float humidity;
    private float pressure;


    public WeatherData() {
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp,float humidity,float pressure){
        this.temp=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}

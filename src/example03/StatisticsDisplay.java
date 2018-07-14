package example03;

import example02.FlyBehaviour;

import java.util.ArrayList;
import java.util.Iterator;

public class StatisticsDisplay implements Observer,DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;
    private Subject weatherData;
    private ArrayList<Float> tempArray;


    public StatisticsDisplay(Subject weatherData){
        tempArray = new ArrayList<>();
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Current Condition :"+"temp is :"+temp+" degrees,"+"humidity is:"+humidity+"% ");
        System.out.printf("Average temp is :%.2f degrees\n",avgTemp());
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        tempArray.add(temp);
    }

    public float avgTemp(){
       // Iterator iterator = tempArray.iterator();
        float sum = 0.0f;
        float avgTemp = 0.0f;
        for (int i = 0; i < tempArray.size(); i++) {
            sum  = tempArray.get(i) + sum;
        }

        avgTemp = sum/tempArray.size();

        return avgTemp;
    }

}

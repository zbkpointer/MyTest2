package example03;

import java.util.ArrayList;

public class ForeCastDisplay implements Observer,DisplayElement {
    private float temp;
    private Subject weatherData;
    private ArrayList<Float> tempArray;

    public ForeCastDisplay(Subject weatherData){
        weatherData.registerObserver(this);
        tempArray = new ArrayList<>();
    }


    @Override
    public void display() {
        System.out.println("The max temp is:"+maxTemp()+"degree");
        System.out.println("The mix temp is:"+minTemp()+"degree");
        System.out.println();
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        tempArray.add(temp);
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

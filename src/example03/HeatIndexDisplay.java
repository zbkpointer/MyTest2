package example03;

public class HeatIndexDisplay implements DisplayElement,Observer {
    private float temp;
    private float humidity;
    private Subject weatherData;


    public HeatIndexDisplay(Subject weatherData){
        weatherData.registerObserver(this);

    }
    @Override
    public void display() {
        System.out.println("current heat is :"+heatIndex());
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
    }

    public float heatIndex(){
        float heatIndex = 0.0f;

        heatIndex = temp + humidity/100;


        return heatIndex ;
    }
}

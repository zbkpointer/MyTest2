package example03;

public class WeatherStation  {
    public static void main(String[] args) {

        WeatherData weatherStation = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherStation);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherStation);
        ForeCastDisplay foreCastDisplay = new ForeCastDisplay(weatherStation);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherStation);

        weatherStation.setMeasurements(30.1f,24.6f,0);

        heatIndexDisplay.display();
        weatherStation.setMeasurements(32.2f,25.7f,0);
        heatIndexDisplay.display();
        weatherStation.setMeasurements(33.3f,27.8f,0);

       // currentConditionDisplay.display();
        heatIndexDisplay.display();


    }
}

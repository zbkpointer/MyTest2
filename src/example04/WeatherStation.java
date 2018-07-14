package example04;

import java.util.Observable;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForeCastDisplay foreCastDisplay = new ForeCastDisplay(weatherData);

        weatherData.setMeasurements(23.7f,32.8f,10f);

        foreCastDisplay.display();

        weatherData.setMeasurements(23.5f,32.2f,10f);

        foreCastDisplay.display();

    }
}

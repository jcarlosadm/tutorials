package br.com.weather.withapi;

import java.util.Observable;
import java.util.Observer;

import br.com.weather.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;
    
    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        this.observable.addObserver(this);
    }
    
    @Override
    public void display() {
        System.out.println("Current conditions: "+ this.temperature
                + "F degrees and "+this.humidity+"% humidity");

    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.display();
        }

    }

}

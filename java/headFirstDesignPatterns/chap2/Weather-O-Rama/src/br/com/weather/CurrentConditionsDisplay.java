package br.com.weather;

import br.com.headfirst.observer.Observer;
import br.com.headfirst.observer.Subject;

/**
 * Define um visualizador de dados sobre o tempo
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    
    /**
     * Temperatura
     */
    private float temperature;
    
    /**
     * Umidade
     */
    private float humidity;
    
    /**
     * Referência para objeto que guarda dados meteorológicos
     */
    @SuppressWarnings("unused")
    private Subject weatherData;
    
    /**
     * Construtor
     * @param weatherData Referência para objetos com dados meteorológicos
     */
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+ this.temperature
                + "F degrees and "+this.humidity+"% humidity");

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.display();

    }

}

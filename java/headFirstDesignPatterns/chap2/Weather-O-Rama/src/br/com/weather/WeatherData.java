package br.com.weather;

import java.util.ArrayList;

import br.com.headfirst.observer.Observer;
import br.com.headfirst.observer.Subject;

/**
 * Classe concreta que implementa Subject
 *
 */
public class WeatherData implements Subject {

    /**
     * Lista de Observers
     */
    private ArrayList<Observer> observers;
    
    /**
     * Temperatura
     */
    private float temperature;
    
    /**
     * Umidade
     */
    private float humidity;
    
    /**
     * Pressão
     */
    private float pressure;
    
    /**
     * Construtor padrão
     */
    public WeatherData() {
        this.observers = new ArrayList<>();
    }
    
    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        int i = this.observers.indexOf(o);
        
        if(i >= 0)
            this.observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(this.temperature, this.humidity, this.pressure);
        }
        
    }

    /**
     * Indica mudanças nas medidas, notificando Observers
     */
    public void measurementsChanged(){
        this.notifyObservers();
    }
    
    /**
     * Configura novas medidas
     * @param temperature Temperatura
     * @param humidity Umidade
     * @param pressure Pressão
     */
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }
}

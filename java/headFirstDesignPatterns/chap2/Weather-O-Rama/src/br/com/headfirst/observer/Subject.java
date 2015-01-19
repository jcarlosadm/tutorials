package br.com.headfirst.observer;

/**
 * Subject do padrão Observer
 *
 */
public interface Subject {
    /**
     * Registra Observer na lista de notificação
     * @param o Objeto Observer
     */
    public void registerObserver(Observer o);
    
    /**
     * Remove Observer da lista de notificação
     * @param o Objeto Observer
     */
    public void removeObserver(Observer o);
    
    /**
     * Notifica objetos da lista de Observers
     */
    public void notifyObservers();
}

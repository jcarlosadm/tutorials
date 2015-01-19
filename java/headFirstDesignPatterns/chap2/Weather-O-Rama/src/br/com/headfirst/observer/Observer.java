package br.com.headfirst.observer;

/**
 * Observer do padrão Observer
 *
 */
public interface Observer {
    /**
     * Atualiza dados com base no Subject
     * @param temp Temperatura
     * @param humidity Umidade
     * @param pressure Pressão
     */
    public void update(float temp, float humidity,float pressure);
}

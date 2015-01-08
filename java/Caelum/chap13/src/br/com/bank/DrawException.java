package br.com.bank;
/**
 * Classe que lança execessão ao sacar valor da conta
 */
@SuppressWarnings("serial")
public class DrawException extends Exception{
    /**
     * Contrutor padrão
     * @param message messagem padrão para o erro
     */
    public DrawException(String message){
        super(message);
    }
}

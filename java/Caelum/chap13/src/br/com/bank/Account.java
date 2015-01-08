package br.com.bank;

/**
 * Classe que representa uma conta do banco
 */
public class Account {
    /**
     * Saldo da conta
     */
    private double total;

    /**
     * Construtor padrão
     * @param total saldo inicial da conta
     */
    public Account(double total) {
        this.setTotal(total);
    }

    /**
     * Saque
     * @param value Valor a ser sacado
     * @throws DrawException Classe responsável por lançar erro
     */
    public void draw(double value) throws DrawException{
        if(this.getTotal() < value)
            throw new DrawException("Saldo insuficiente");
        else
            this.setTotal(this.getTotal() - value);
    }

    /**
     * Obtém o saldo da conta
     * @return retorna o saldo da conta
     */
    public double getTotal() {
        return total;
    }

    /**
     * Define o saldo
     * @param total Saldo da conta
     */
    private void setTotal(double total) {
        this.total = total;
    }
}

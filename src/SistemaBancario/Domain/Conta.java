package SistemaBancario.Domain;

public class Conta {

    private double saldo;

    /*metodo construtor*/
    public Conta(double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo");
        }
        this.saldo = saldoInicial;
    }


    public double getSaldo() {
        return saldo;
    }


    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito inválido");
        }
        saldo += valor;
    }


    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque inválido");
        }
        if (valor > saldo) {
            throw new IllegalStateException("Saldo insuficiente");
        }
        saldo -= valor;
    }
}
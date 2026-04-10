package SistemaBancario.Domain;

public class Conta {

        public double saldo;

        public void verSaldo(){
            System.out.println("Seu saldo é de R$"+saldo);
        }

        public void depositar(double valor){
            saldo += valor;
            System.out.println("Depósito realizado!");
        }

        public void sacar(double valor){
            if (valor<= saldo) {
                saldo -= valor;
                System.out.println("Saque Realizado!");
            } else {
                System.out.println("Saldo insuficiente");
            }
        }

    }



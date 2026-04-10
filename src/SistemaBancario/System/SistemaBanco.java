package SistemaBancario.System;
import SistemaBancario.Domain.Conta;

import java.util.Scanner;

public class SistemaBanco {
        Scanner scanner = new Scanner(java.lang.System.in);
        Conta conta = new Conta();

        public void iniciar() {
            int opcao = -1;

            conta.saldo = 400;

            while (opcao != 4) {

                java.lang.System.out.println("----Menu----");
                java.lang.System.out.println("1 - Ver Saldo");
                java.lang.System.out.println("2 - Depositar");
                java.lang.System.out.println("3 - Sacar");
                java.lang.System.out.println("4 - Sair");

                java.lang.System.out.println("Selecione: ");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        conta.verSaldo();
                        break;

                    case 2:
                        java.lang.System.out.println("Valor para depositar: ");
                        double deposito = scanner.nextDouble();
                        conta.depositar(deposito);
                        break;

                    case 3:
                        java.lang.System.out.println("Valor para Sacar: ");
                        double saque = scanner.nextDouble();
                        conta.sacar(saque);
                        break;

                    case 4:
                        java.lang.System.out.println("Saindo...");
                        break;

                    default:
                        java.lang.System.out.println("Opção inválida");
                }
            }

        }

}

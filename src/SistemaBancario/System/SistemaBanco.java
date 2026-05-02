package SistemaBancario.System;
import SistemaBancario.Domain.Conta;

import java.util.Scanner;

public class SistemaBanco {
        Scanner scanner = new Scanner(java.lang.System.in);
        Conta conta = new Conta(400);

        public void iniciar() {
            int opcao = -1;

            while (opcao != 4) {

                System.out.println("----Menu----");
                System.out.println("1 - Ver Saldo");
                System.out.println("2 - Depositar");
                System.out.println("3 - Sacar");
                System.out.println("4 - Sair");

                java.lang.System.out.println("Selecione: ");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Seu saldo é de R$"+ conta.getSaldo());
                        break;

                    case 2:
                        try{
                        System.out.println("Valor para deposito: ");
                        double deposito = scanner.nextDouble();

                        conta.depositar(deposito);
                        System.out.println("Valor invalido!");
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 3:
                        try{
                        System.out.println("Valor para saque: ");
                        double saque = scanner.nextDouble();

                        conta.sacar(saque);
                        System.out.println("Saque realizado com sucesso!");
                        } catch (Exception e){
                            System.out.println(e.getMessage());
                        }
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

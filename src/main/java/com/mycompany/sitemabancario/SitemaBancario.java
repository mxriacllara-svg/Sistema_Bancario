package com.mycompany.sitemabancario;

import java.util.Scanner;

public class SitemaBancario {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Cliente cliente1 = new Cliente("Maria", "1234578900", "999999999");
        
        Cliente cliente2 = new Cliente("João", "98765432100", "888888888");
        
        
        Conta conta1 = new Conta(1001, cliente1);
        Conta conta2 = new Conta(1002, cliente2);
        Conta contaSelecionada;
        
        conta1.depositar(1000);
        conta2.depositar(2000);
        
        System.out.print("Digite o número da conta: ");
        int contaAtual = scanner.nextInt();
        if(contaAtual == 1001){
                contaSelecionada = conta1;
        }
        else if(contaAtual == 1002){
            contaSelecionada = conta2;
        } else {
            System.out.println("Conta invalida.");
            contaSelecionada = null;
        }
       
        
        int opcao;
        
        do{
            System.out.println("\n===== SISTEMA BANCARIO =====\n\n");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Consultar dados da conta");
            System.out.println("0 - Sair");
            System.out.print("Digite a sua  opção: ");
            opcao = scanner.nextInt();
            
            

            switch(opcao) {

                case 1:
                    System.out.println("Seu saldo é: R$" + (contaSelecionada.getSaldo()));
                    break;

                case 2:
                    System.out.print("Digite o valor do deposito: R$");
                    double valorDeposito = scanner.nextDouble();
                    contaSelecionada.depositar(valorDeposito);

                    break;

                case 3:
                    System.out.print("Digite o valor do saque: R$");
                    double valorSaque = scanner.nextDouble();
                    contaSelecionada.sacar(valorSaque);

                    break;

                case 4:
                    System.out.print("Digite o valor da transferência: R$");
                    double valorTransfe = scanner.nextDouble();
                        if(valorTransfe <= (conta1.getSaldo())){
                            contaSelecionada.transferencia(500, conta2);
                        }else{
                            System.out.println("Saldo insuficiente!");
                        }
                    
                    break;

                case 5:
                        System.out.println("Titular: " + (contaSelecionada.getTitular().getNome()));
                        System.out.println("Conta: " + (contaSelecionada.getNumero()));
                        System.out.println("CPF do titular: " + (contaSelecionada.getTitular().getCpf()));
                        System.out.println("Numero de celular: " + (contaSelecionada.getTitular().getTelefone()));
                        
                    break;

                case 0:
                    break;

                default:
                    break;
            }
        
        }while(opcao != 0);
       
             
    }
}

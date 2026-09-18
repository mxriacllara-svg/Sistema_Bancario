package com.mycompany.sitemabancario;

public class SitemaBancario {

    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Maria", "1234578900", "999999999");
        
        Cliente cliente2 = new Cliente("João", "98765432100", "888888888");
        
        Conta conta1 = new Conta(1001, cliente1);
        Conta conta2 = new Conta(1002, cliente2);
        
        conta1.depositar(500);
        conta2.depositar(550);
        
        conta1.depositar(100);
        conta2.sacar(35);
        conta1.transferencia(1000, conta2);
        
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
        
        
    }
}

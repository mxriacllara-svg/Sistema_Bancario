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
        
        cliente1.setTelefone("111111111");
        
        
        
        System.out.println(conta1.getNumero());
        System.out.println(conta1.getTitular());
        System.out.println(conta1.getSaldo());
        System.out.println(cliente1.getNome());
        System.out.println(conta1.getTitular().getNome());
        System.out.println(cliente1.getTelefone());
        
        cliente1.setNome("Maria Clara");
        
        System.out.println(cliente1.getNome());
        
        
    }
}

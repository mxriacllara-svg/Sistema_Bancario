package com.mycompany.sitemabancario;

public class Conta {
    
    private int numero;
    private double saldo;
    private Cliente titular;
    
    public Conta(int numero, Cliente titular){
        this.numero = numero;
        this.titular = titular;
    }
    
    public double depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor invalido!");
        }
        return saldo += valor;
    }
    public double sacar(double valor){
        
        if (valor <= 0){
            System.out.println("Valor invalido!");
        }
        if (valor > saldo){
            System.out.println("Valor invalido!");
        }
        return saldo -= valor;
    }
    
    public void transferencia(double valor, Conta destino){
        this.sacar(valor);
        destino.depositar(valor);
    }
    
    public double getSaldo(){
        return saldo;
    }
    public int getNumero() {
    return numero;
    }
    public Cliente getTitular() {
        return titular;
    }
}

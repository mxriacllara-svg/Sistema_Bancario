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
    public void sacar(double valor){
        
        if (valor <= 0){
            return;
        }
        if (valor > saldo){
            return;
        }else{
        saldo -= valor;
        }
    }
    
    public boolean transferencia(double valor, Conta destino){
        this.sacar(valor);
        if(valor <= saldo){
            destino.depositar(valor);
            return true;
        }else{
            System.out.println("Operacao negada!");
            return false;
        }
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

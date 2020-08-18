/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contabancaria;

import Excecao.excecaopersonalizada;

/**
 *
 * @author joaos
 */
public class Conta {
    
    int numero;
    String nome;
    double saldo;
    double limiteSaque;
    
    public Conta(int numero, String nome, double saldo) {
    
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    
}
    
    public void depositar (double valor){
        
        saldo += valor;
        System.out.println("Os " +valor+ " reais foram depositados \n");
    }
    
    public void sacar (double valor) throws excecaopersonalizada {
        
        if(saldo == 0 ){
        
            throw new excecaopersonalizada("A conta não possui saldo");
            
            
        } else if(valor > limiteSaque){
            
            throw new excecaopersonalizada("O valor de saque não pode ser maior que o limite de saque");
            
        } else if (valor > saldo){
            
            throw new excecaopersonalizada("Voce não possui fundos para realizar o saque");
        }
        
        saldo -= valor;
        System.out.println("Os " +valor+ " reais foram sacados");
        
    }
    
    public void limiteSaque (double valor){
        
        limiteSaque = valor;
        
    }

    @Override
    public String toString() {
        return "Dados da conta \n " + "Numero: " + numero + "\n Nome: " + nome + "\n Saldo: " + saldo + "\n Limite de Saque: " + limiteSaque + "\n";
        
    }
    
    
}

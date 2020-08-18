/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caixa;

import Contabancaria.Conta;
import java.util.Scanner;
import java.util.InputMismatchException;
import Excecao.excecaopersonalizada;


/**
 *
 * @author joaos
 */
public class Caixabancario {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        try{
            
        System.out.println("Bem vindo, insira os dados da sua conta\n");
        System.out.println("Numero da conta: ");
        int numero = leitor.nextInt();
        System.out.println("Insira seu nome: ");
        String nome = leitor.next();
        System.out.println("Insira o saldo da sua conta: ");
        double saldo = leitor.nextDouble();
        Conta conta1 = new Conta(numero, nome, saldo);
        conta1.limiteSaque(300);
        
        conta1.toString();
        System.out.println(""+conta1.toString());
        
        System.out.println("Quantos reais voce deseja sacar: ");
        double saca = leitor.nextDouble();
        conta1.sacar(saca);
        
        }catch(excecaopersonalizada e){
            System.out.println(e.getMessage());
        }
    }
}

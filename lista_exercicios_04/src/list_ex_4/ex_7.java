/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_ex_4;

import static list_ex_4.ex_1.input;



/**
 *
 * @author I
 */
public class ex_7 
{
   static double valorReal ()
   {
       System.out.println("informe o valor real a ser mutiplicado pelos elementos do vetor: ");
       double numR = input.nextDouble();
       return numR;
   }
   
   static void imprimirVet (int [] vet, double numR)
   {
       double somador = 0.0;
       for (int i = 0; i < vet.length; i++) 
       {
           System.out.print("{"+vet[i]+"}");
           
           somador = somador + (numR*vet[i]);
       }
       
       System.out.println("o produto dos elementos do vetor pelo numero real é: "+somador);
   }
    public static void main(String[] args) 
    {
        int t = ex_1.tamanho();
        double numR = valorReal();
        int [] vet = ex_1.criaVetor(t);
        vet = ex_1.preencheVet(vet);
        imprimirVet(vet, numR);
 
    }
}

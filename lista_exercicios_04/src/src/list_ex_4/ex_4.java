/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_ex_4;

/**
 *
 * @author I
 */
public class ex_4 
{
     static void imprimir (double vet[])
     {
         double menor = 120;
         for (int i = 0; i < vet.length; i++) 
         {
             System.out.printf("%.2f\n",vet[i]);
             if (vet[i]<menor)
                 menor = vet[i];
         }
         System.out.printf("o menor valor do vetor: %.2f\n",menor);
     }
             
   public static void main(String[] args) 
        {
           int t = ex_1.tamanho();
           double [] vet = ex_2.criarVetor(t);
           vet = ex_2.preencherVetor(vet);
           imprimir(vet);

        }
}

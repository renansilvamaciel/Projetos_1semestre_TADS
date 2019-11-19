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
public class ex_17 
{
                            
    static void imprimirvet (double [] vet)
    {
        for (double item : vet)
        {
            System.out.printf("  %.2f :",item);
        }
        
        System.out.println("  \n");
    }
    
   static void imprimir (double [] vet, double num)
   {
     double somador=0;
     
     
      
       for (int i = 0; i < vet.length; i++) 
       {
           somador = somador + (num * vet[i]);
       }
       
       System.out.printf("o a multiplicacao do valor real pelos elementos do vetor é : %.2f\n",somador);
       
      
   }
    public static void main(String[] args) 
    {
        int t = ex_1.tamanho();
        double [] vet = ex_2.criarVetor(t);
        vet = ex_2.preencherVetor(vet);
        double num = ex_7.valorReal();
        imprimirvet(vet);
        imprimir(vet, num);
    }
}

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
public class ex_11 
{
    static void imprimirVet (double [] vet)
    {
        double somador = 0.0;
         
        
        for (int i = 0; i < vet.length; i++) 
        {
           if (vet[i]%2<=0.99)
           {
                somador = somador+vet[i];  
           }
        }
        double media;
           
        media = somador/vet.length;
        System.out.printf("media: %.2f\n",media);
         for (double item : vet)
         {
             if (item>media)
             {            
                 System.out.printf("{%.2f} ",item);
             }
         }
    }
    public static void main(String[] args) 
    {
        int t = ex_1.tamanho();
        double [] vet = ex_2.criarVetor(t);
        vet = ex_2.preencherVetor(vet);
        imprimirVet(vet);
        
    }
}

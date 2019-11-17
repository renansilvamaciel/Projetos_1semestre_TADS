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
public class ex_9 
{
    
    static void imprimirVet(int [] vetA, int [] vetB)
    {
        int somador=0;
        for (int i = 0; i < vetA.length; i++) 
        {
            somador = somador+(vetA[i]*vetB[i]);
        }
        
        for(int item : vetA)
        {
            System.out.print("{"+item+"}\n");
        }
        System.out.println(" ");
        for(int item : vetB)
        {
            System.out.print("{"+item+"}\n");
        }
        
        
        System.out.println("O produto dos elementos dos dois vetores é: "+somador);
    }
    public static void main(String[] args) 
    {
        int t = ex_1.tamanho();
        int [] vetA = ex_1.criaVetor(t);
        int [] vetB = ex_1.criaVetor(t);
        vetA = ex_1.preencheVet(vetA);
        vetB = ex_1.preencheVet(vetB);
        imprimirVet(vetA, vetB);
        
        
                
    }
}

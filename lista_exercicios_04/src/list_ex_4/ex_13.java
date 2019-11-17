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
public class ex_13 
{
    static void imprimirvet (int [] vetA, int vetB[], int vetC[])
    {
        for (int i = 0; i < vetC.length; i++) // testar fazer com do while 
        {
           
            if (i<vetA.length)
                {
                     vetC[i] = vetA[i];

                }
            
            else if (i > vetA.length)
                       {
                           for (int j = 0; j < vetC[i]; j++) 
                           {
                               vetC[i] = vetB[j];
                           }
                       }
                   
           
           
                   
        }
        
        for (int item : vetC)
            {
                System.out.print(item+" ");
            }
    }
    
    
    public static void main(String[] args) 
    {
        int t = ex_1.tamanho();
        int [] vetA = ex_1.criaVetor(t);
        int [] vetB = ex_1.criaVetor(t);
        int [] vetC = ex_1.criaVetor(t+t);
        
        vetA = ex_1.preencheVet(vetA);
        
        vetB = ex_1.preencheVet(vetB);
        
        imprimirvet(vetA, vetB, vetC);
        
         
        
    }
}

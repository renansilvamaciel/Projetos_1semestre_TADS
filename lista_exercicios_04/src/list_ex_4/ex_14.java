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
public class ex_14 
{
   static void imprimirVetorSequenciais (int []vetA, int [] vetB, int [] vetC)
   {
       int contA = 0, contB = 0;
       
       for (int i = 0; i < vetC.length; i++) 
       {
            if (i%2 == 0)
                {
                   vetC[i] = vetA[contA];
                   
                   contA++;
                }   
                    else 
                        {
                            vetC[i] = vetB[contB];
                            
                            contB++;
                        }
                        
                    System.out.print(vetC[i]+" ");
            
            
       }
   }
   
   static void imprimir (int [] vetA, int [] vetB )
   {
        for (int itemA : vetA)
         {
             System.out.print(itemA + " ");
         }
        System.out.println("     \n");
            for(int itemB : vetB)
                {
                    System.out.print(itemB+" ");
                }
       System.out.println("     \n");
   }
   
   
    public static void main(String[] args) 
    {
       int t = ex_1.tamanho();
       int [] vetA = ex_1.criaVetor(t);
       int [] vetB = ex_1.criaVetor(t);
       int [] vetC = ex_1.criaVetor(t+t);
       vetA = ex_1.preencheVet(vetA);
       vetB = ex_1.preencheVet(vetB);
        imprimir(vetA, vetB);
        imprimirVetorSequenciais(vetA, vetB, vetC);
        
       
       
    }
   
}

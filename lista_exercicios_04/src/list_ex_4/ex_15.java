/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_ex_4;
import list_ex_4.ex_1;

/**
 *
 * @author renan.smaciel
 */
public class ex_15 
{
    
    static void teste (int [] vetA)
    {
        for(int item : vetA)
        {
            System.out.print(item+" ");
        }
        
        System.out.println(" \n");
    }
    
    
    static void imprimirvetOrdenado (int [] vetA,int [] vetB)
        {
//            int Bd = 110;
//                for (int i = 0; i < vetB.length; i++) 
//                    {
//                          for (int j = 0; j < vetA.length; j++) 
//                               {
//                                   if (vetA[j]<Bd && Bd != vetA[j])
//
//                                       {
//                                           Bd = vetA[j];
//                                       }
//                                   else if ()
//                                   {
//                                        Bd =vetA[j];
//                                   }
//                               }
//                           
//                        vetB[i] = Bd;
//                        
//                        System.out.print(vetB[i]+" ");
//                    }
//                System.out.println("   \n");
            
            
                  
        }
    
    static int [] test2 (int [] vetA)
    {
        int aux=0;
        for (int i = 0; i < vetA.length; i++) 
            {
                if (vetA[i]>vetA[i+1])
                {
                   aux = vetA[i];
                    vetA[i] = vetA[i+1];
                    vetA[i+1] = aux;
                   
                }
                
                
            }
        
    }
    
    
    public static void main(String[] args) 
    {
       int t = 
       int [] vetA = ex_1.criaVetor(t);
       int [] vetB = ex_1.criaVetor(t);
       vetA = ex_1.preencheVet(vetA);
        teste(vetA);
        //imprimirvetOrdenado(vetA, vetB);
        
       
       
    }
}

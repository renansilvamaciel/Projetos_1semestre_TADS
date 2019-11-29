/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_ex_4;

/**
 *
 * @author renan.smaciel
 */
public class ex_16 // quase pronto falta fazer gabiarra.
{
    static int [] vetorOrdenadoPar (int [] vetA)
    {
        int aux;
        for (int j = 0; j < vetA.length; j++) 
            {
                for (int i = 0; i < vetA.length-1; i++) 
                    {
                        if (vetA[i]%2==0)
                            {
                               aux = vetA[j];
                                vetA[j] = vetA[i];
                                vetA[i] = aux;
                                break;
                            }
                    }
             }
        return vetA;
    }
    
    
    
    static void imprimirVetORdenado (int [] vetA)
    {
        System.out.println("vetor ordenado: ");
        int k = vetA.length-1;
        for (int i = 0; i < vetA.length; i++) 
        {
            System.out.print (vetA[k]+" ");
            k--;
        }
    }
    
    static void imprimirTest (int [] vetA)
    {
            System.out.println(" vetor baguncado : \n");
            for (int item : vetA)
            {
                System.out.print(item+" ");
            }
            
            System.out.println("  \n");
    }
    
    public static void main(String[] args) 
    {
        int t = ex_1.tamanho();
        int [] vetA = ex_1.criaVetor(t);
        vetA = ex_1.preencheVet(vetA);
        imprimirTest(vetA);
        vetA = vetorOrdenadoPar(vetA);
        imprimirVetORdenado(vetA);
        
    }
}

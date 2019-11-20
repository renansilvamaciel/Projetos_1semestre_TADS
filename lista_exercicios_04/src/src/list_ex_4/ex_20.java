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
public class ex_20 {
    static void copiarVet (int [] vetA , int [] vetB)
    {
        int cont =0;
        for (int i = 0; i < vetA.length; i++) {
                
                if (vetA[i] % 3 == 0)
                    {
                            vetB[cont] = vetA[i];   

                                if ((cont+1)%2>=1)
                                    {
                                        System.out.print(vetB[cont]+" ");
                                    }
                                cont++;
                    }
        }
        
        
    }
    
    
    public static void main(String[] args) 
    {
        int t = ex_1.tamanho();
        int [] vetA = ex_1.criaVetor(t);
        int [] vetB = ex_1.criaVetor(t);
        vetA = ex_1.preencheVet(vetA);
        copiarVet(vetA, vetB);
        
    }
}

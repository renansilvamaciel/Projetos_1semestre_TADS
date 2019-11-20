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
public class ex_19 
{
    static void imprimirVetimpar (int [] vet)
        {
            for (int i = 0; i < vet.length; i++) 
                {
                       if ((i+1)%2>=1)
                        {
                            System.out.print(vet[i]+" ");
                        }
                }
        }
    
    public static void main(String[] args) 
        {
            int t = ex_1.tamanho();
            int [] vet = ex_1.criaVetor(t);
            vet = ex_1.preencheVet(vet);
            imprimirVetimpar(vet);
            
        }
}

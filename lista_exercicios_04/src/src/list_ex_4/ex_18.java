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
public class ex_18 
{
    
    static int numero ()
    {
        int numeroProcurado;
        System.out.println("informe o numero a ser procurado dentro do vetor: ");
            numeroProcurado = ex_1.input.nextInt();
            
            return numeroProcurado;
    }
    static void procuraNum (int [] vet, int numeroProcurado )
           {
              int position=0;
                    for (int i = 0; i < vet.length; i++) 
                    {
                        if (numeroProcurado == vet[i])
                            {
                                position = i;
                                System.out.println("o numero "+numeroProcurado+" está na posicao, "+position+" do vetor.");
                            }       
                    }
                            if (position == 0)
                                    {
                                        System.out.println("seu numero nao está no vetor :/\n");
                                    }
           } 
        public static void main(String[] args) 
        {
           int t = ex_1.tamanho();
           int [] vet = ex_1.criaVetor(t);
           vet = ex_1.preencheVet(vet);
           int numeroprocurado = numero();
           procuraNum(vet, numeroprocurado);
            ex_1.imprimirVetor(vet);
            
        }
}

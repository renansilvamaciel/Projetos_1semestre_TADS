/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_ex_4;

import static list_ex_4.ex_1.input;

/**
 *
 * @author I
 */
public class ex_8 
{
    static int numInt ()
    {
        System.out.println("informe o valor que deseja procurar ");
        int numInt = input.nextInt();
        return numInt;
    }
    
    static void imprimirVet (int [] vet,int numInt)
    {
      boolean naoesta = true;
       for (int i = 0; i < vet.length; i++) 
        {
            if (vet[i] == numInt){
                System.out.println("seu nuemro está presente no vetor ! "+"na posicao: "+i);
                naoesta = false;
            }
           
        }
       
        if (naoesta)
        {
            System.out.println("seu nuemro nao está no vetor");
        }
            
            for(int item : vet)
            {
                System.out.print(item+" ");
            } 
       
    }
    
    public static void main(String[] args) 
    {
        int t = ex_1.tamanho();
        int numInt = numInt();
        int [] vet = ex_1.criaVetor(t);
        vet = ex_1.preencheVet(vet);
        imprimirVet(vet, numInt);
        
        
    }
}

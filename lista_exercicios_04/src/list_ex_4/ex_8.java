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
    }
    
    static void imprimirVet (int [] vet,int numInt)
    {
      
       for (int i = 0; i < vet.length; i++) 
        {
            if (vet[i] == numInt){
                System.out.println("seu nuemro está presente no vetor ! "+"na posicao: "+i);
            }
            else {
                System.out.println("seu numero não está presente no vetor :/ ");
            }
            
            for(int item : vet)
            {
                System.out.println(item+" ");
            }
            
        }
    }
}

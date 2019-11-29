/*
 *Dado um vetor de números inteiros, fazer um programa que imprima o maior elemento do vetor.
 */
package list_ex_4;
import list_ex_4.ex_1;

/**
 *
 * @author I
 */
public class ex_3 
{
   
    static int [] criaVetor (int tamanho)
{
    int [] vet = new int [tamanho];
    return vet;
}
    
    static int [] preencheVetor (int [] vet)
    {
        int num = 0;
        for (int i = 0; i < vet.length; i++) 
        {
           num = (int) (Math.random()*50);
           vet[i]=num; 
        }
        return vet;
    }
    
    static void imprimiVetor (int [] vet)
    {
        int testador = 0;
        for (int i = 0; i < vet.length; i++) 
        {
            System.out.println(vet[i]);
            
            if (vet[i]>testador)
            {
                testador = vet[i];
            }
           
        }
         System.out.println("maior numero do vetor é: "+testador);
    }
    
    public static void main(String[] args) 
    {
        int t = ex_1.tamanho();
        int [] vet = criaVetor(t);
        vet = preencheVetor(vet);
        imprimiVetor(vet);
    }
}

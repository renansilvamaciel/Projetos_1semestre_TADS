/*
 * Dado um vetor de números inteiros, fazer um programa que imprime todos os elementos do vetor
 */
package list_ex_4;

import java.util.Scanner;

/**
 *
 * @author I
 */
public class ex_1 
{
    public static Scanner input = new Scanner(System.in);
    
    static int tamanho ()
    {
        System.out.println("informe o tamnho do vetor: ");
        int tamanho = input.nextInt();
        return tamanho;
    }
    
    
    static int [] criaVetor (int tamanho)
    {
        int [] vet = new int [tamanho];
        
        return vet;
    }
    
    static int [] preencheVet (int vet[])
    {
       int num;
       
        for (int i = 0; i < vet.length; i++) 
        {
            num = (int) (Math.random()*100);
            vet[i] = num;
            
           
        }
       return vet;
    }
    
    static void imprimirVetor (int vet [] )
    {
        for (int item : vet) 
        {
            System.out.print(item+" ");
        }
        
        System.out.println("   ");
    }
    public static void main(String[] args) 
    {
        int t = tamanho();
        int vet [] = criaVetor(t);
        vet = preencheVet(vet);
        imprimirVetor(vet);
        
    }
}
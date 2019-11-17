/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_ex_4; 
import java.util.Scanner;
/**
 *
 * @author I
 */
public class ex_2 
{
    Scanner input = new Scanner(System.in);
    
    
    
    static double [] criarVetor (int tamanho)
    {
        double [] vet = new double [tamanho];
        
        return vet;
    }
    
    static double [] preencherVetor (double vet [])
    {
        for (int i = 0; i < vet.length; i++) 
        {
           double num;
           num = (double) (Math.random()*100);
            
           vet[i] = num;
        }
        return vet;
    }
    
    static void imprimirVetor(double vet[])
    {
        double somador = 0;
        for (int i = 0; i < vet.length; i++) 
        {
            somador = somador+vet[i];
        }
        System.out.printf("a soma dos itens do vetor: %.2f\n",somador);
     
    }
    public static void main(String[] args) 
    {
        int t = ex_1.tamanho();
        double [] vet = criarVetor(t);
        vet = preencherVetor(vet);
        imprimirVetor(vet);
    }
}

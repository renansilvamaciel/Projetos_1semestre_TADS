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
public class ex_6 
{
    
    static void imprimirVetor (int vet [] )
    {
        int somador = 1;
        for (int i = 0; i < vet.length; i++) 
        {
            System.out.println(vet[i]);
            somador = somador*vet[i];
        }
        
        System.out.println("somador: "+somador);
    }
    
    public static void main(String[] args) 
    {
        int t = ex_1.tamanho();
        int [] vet = ex_1.criaVetor(t);
        vet = ex_1.preencheVet(vet);
        imprimirVetor(vet);
        
        
    }
}
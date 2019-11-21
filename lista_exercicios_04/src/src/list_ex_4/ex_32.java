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
public class ex_32 
{
    static void imprimirVet(int [] [] mat,int [] vet)
        {
          int somador = 0;
            
            for (int i = 0; i < mat.length; i++) {
                somador=0;
                
                System.out.print("{");
                for (int j = 0; j < mat[i].length; j++) {
                    System.out.print(mat[i][j]+" ");
                    if (j%2>=1)
                    {
                    somador = somador + mat [j][i];
                    }
                }
                System.out.println("}");
                
                vet[i]= somador;
            }
            System.out.println("\n");
            System.out.println("a soma dos itens de cada coluna: \n");
            for (int i = 0; i < vet.length; i++) {
                System.out.print("coluna "+(i+1)+" = "+vet[i]+", ");
            }
            System.out.println("\n");
        }
}

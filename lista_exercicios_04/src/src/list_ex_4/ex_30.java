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
public class ex_30 
{
        
    static void imprimirmat (int [] vet, int [][] mat)
    {
        for (int i = 0; i < mat.length; i++) {
            System.out.print("{");
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = vet[i];
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("}");
        }
        
        System.out.println("\n");
        System.out.println("vetor: ");
        
        
        
        System.out.print("{");
        for (int item : vet)
        {
            System.out.print(item+" ");
        }
        System.out.println("}");
    }
    
    
    
    
    
    
    public static void main(String[] args) 
    {
      int linha = ex_22.tamanhoMatriz();
      int coluna = ex_22.tamanhoMatriz();
      
      int [] vet = ex_1.criaVetor(linha);
      vet = ex_1.preencheVet(vet);
      
      int [] [] mat = ex_22.criarMatriz(linha, coluna);
      
    }
}

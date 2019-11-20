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
public class ex_25 
{
    static void imprimirMatriz (int [][] mat)
    {
            for (int i = 0; i < mat.length; i++) {
                System.out.print("{");
                for (int j = 0; j < mat[i].length; j++) 
                {
                    mat [i] [j] = i+1;
                    
                    System.out.print(mat[i][j]+" ");
                }
                
                System.out.println("}");
        }
    }
    
    public static void main(String[] args) 
    {
        int linha = ex_22.tamanhoMatriz();
        int coluna = ex_22.tamanhoMatriz();
        
        int [][] mat = ex_22.criarMatriz(linha, coluna);
        
        imprimirMatriz(mat);
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_ex_4;

import java.util.Random;

/**
 *
 * @author I
 */
public class ex_38 
{
    
    static int [] [] preenchemat (int [] [] mat){
        Random aleatorio = new Random();
        for (int i = 0; i < mat.length; i++) {
            
            for (int j = 0; j < mat[i].length; j++) {
              mat [i][j]  = aleatorio.nextInt(60);  
            }
        }
        
        return mat;
    }
    
    static void imprimirDiagonalSup (int [] [] mat)
        {
            for (int i = 0; i < mat.length; i++) {
                System.out.print("{");
                for (int j = 0; j < mat[i].length; j++) {
                    if (j>i)
                    {
                        System.out.print(mat[i][j]+" ");
                    }
                }
                System.out.println("}");
            }
        }
    
    
    public static void main(String[] args) 
    {
        int linha = ex_22.tamanhoMatriz();
        int coluna = ex_22.tamanhoMatriz();
        
        int [] [] mat = ex_22.criarMatriz(linha, coluna);
        
        mat = preenchemat(mat);
        ex_25.imprimirMatriz(mat);
        System.out.println("\n");
        
        imprimirDiagonalSup(mat);
        
        
    }
 
}

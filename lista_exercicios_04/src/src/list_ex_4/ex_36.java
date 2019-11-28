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
public class ex_36 {
    
    static void imprimirMat (int [] [] mat)
    {
        for (int i = 0; i < mat.length; i++) {
            System.out.print("{");
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("}");
        }
    }
    
    
    static void imprimirDiaonal (int [] [] mat)
    {
        for (int i = 0; i < mat.length; i++) {
            System.out.print("{");
            System.out.print(mat[i] [i] +" ");
            for (int j = 0; j < mat[i].length; j++) {
                
            }
            System.out.println("}");
        }
    }
    
    
    
    
    
    
    public static void main(String[] args) {
     int linha = ex_22.tamanhoMatriz();
     int coluna = ex_22.tamanhoMatriz();
     
     int [] [] mat = ex_22.criarMatriz(linha, coluna);
     mat = ex_31.preencheMat(mat);
        imprimirMat(mat);
        System.out.println("\n");
        imprimirDiaonal(mat);
        
    
    }
}

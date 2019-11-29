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
public class ex_22 
{
    static int tamanhoMatriz ()
    {
            int tamanho;
        System.out.println("informe o tamanho da matriz, linha e depois coluna:  ");
            tamanho = ex_1.input.nextInt();
         return tamanho;
    }
    
    
    static int [] [] criarMatriz (int linha, int coluna)
    {
        int [] [] mat = new int [linha] [coluna];
        
        return mat;
    }
    
    
    static void imprimir (int [] [] mat)
    {
        for (int i = 0; i < mat.length; i++) {
            System.out.print("{ "); 
            for (int j = 0; j < mat[i].length; j++) {
                    mat[i][j] = 20;
                    
                    System.out.print(mat[i][j]+" ");
            }
            System.out.println("}");
        }
        
        
    }
    public static void main(String[] args) {
        int linha = tamanhoMatriz();
        int coluna = tamanhoMatriz();
        int [] [] mat = criarMatriz(linha, coluna);
        imprimir(mat);
    }
}

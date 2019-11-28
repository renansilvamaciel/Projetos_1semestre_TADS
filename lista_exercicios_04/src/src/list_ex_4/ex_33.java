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
public class ex_33 
{
    static int [] [] preenchematrizUx (int [][] mat)
        {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                        System.out.println("informe o valor para ser locado na matriz: ");
                            int aux = ex_1.input.nextInt();
                            
                            mat [i][j]=aux;
                }
            }
            return mat;
        }
    
    
    static void imprimirMat (int [] [] mat)
    {
        for (int i = 0; i < mat.length; i++) {
            System.out.print("{");
                for (int j = 0; j < mat[i].length; j++) {
                    
                    if (mat[i][j]<0){
                        
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
       
       int mat [] [] = ex_22.criarMatriz(linha, coluna);
       mat = preenchematrizUx(mat);
        imprimirMat(mat);
        
    }
    
}

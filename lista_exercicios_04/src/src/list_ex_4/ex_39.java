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
public class ex_39 
{
    static void imprimir (int [][] matA, int [] [] matB)
    {
            int somadorA=1;
            int somadorB=1;


            for (int i = 0; i < matA.length; i++) {
                System.out.print("{");
                for (int j = 0; j < matA[i].length; j++) {
                    somadorA=somadorA*matA[i][j];
                    System.out.print(matA[i][j]+" ");
                }
                    System.out.println("}");
            }
            
        System.out.println("\n"
                + "\n");

                for (int i = 0; i < matB.length; i++) 
                    {System.out.print("{");
                        for (int j = 0; j < matB[i].length; j++) 
                            {
                                somadorB=somadorB*matB[i][j];
                                System.out.print(matB[i][j]+" ");
                            }
                            System.out.println("}");
                    }
                
                
                System.out.println("o produto da matriz A: "+somadorA);
                System.out.println("o produto da matriz B: "+somadorB);
    }
    
    
    
    
    public static void main(String[] args) {
        int linha = ex_22.tamanhoMatriz();
        int coluna = ex_22.tamanhoMatriz();
        
        int [] [] matA = ex_22.criarMatriz(linha, coluna);
        int [] [] matB = ex_22.criarMatriz(linha, coluna);
        
        matA = ex_28.preencheMatrizRandom(matA);
        matB = ex_28.preencheMatrizRandom(matB);
        
        imprimir(matA, matB);
    }
}

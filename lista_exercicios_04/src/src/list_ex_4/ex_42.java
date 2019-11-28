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
public class ex_42 
{
        static void prodMaiorValor (int maiorValor_A, int mariorValor_B)
        {
            int prod;
            
            prod = maiorValor_A*mariorValor_B;
            
            System.out.println("o produtor dos maiores valores das matrizes é: "+prod);
            
            System.out.println("mario valor A: "+maiorValor_A);
            System.out.println("mario valor A: "+maiorValor_A);
        }
        
        
        public static void main(String[] args) {
        int linha = ex_22.tamanhoMatriz();
        int coluna = ex_22.tamanhoMatriz();
        
        int [] [] matA = ex_22.criarMatriz(linha, coluna);
        int [] [] matB = ex_22.criarMatriz(linha, coluna);
        
        matA = ex_40.preencheMatrizRandom(matA);
        matB = ex_40.preencheMatrizRandom(matB);
        
        int marioValor_A = ex_41.maiorValor(matA);
        int marioValor_B = ex_41.maiorValor(matB);
        
            prodMaiorValor(marioValor_A, marioValor_B);
            
            
            
            
            System.out.println("\n");
             
            ex_40.imprimiMatrizOriginal(matA);
            System.out.println("\n5");
            ex_40.imprimiMatrizOriginal(matB);
            
            
            
        
    }
}

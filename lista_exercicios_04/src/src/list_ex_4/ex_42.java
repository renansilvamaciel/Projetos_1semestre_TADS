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
        static void prodMaiorValor (int maiorValor_A, int maiorValor_B)
        {
            int prod;
            
            prod = maiorValor_A*maiorValor_B;
            
            System.out.println("o produtor dos maiores valores das matrizes é: "+prod);
            
            System.out.println("mario valor A: "+maiorValor_A);
            System.out.println("mario valor B: "+maiorValor_B);
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
    }
}



// ps: caros professores, Leonildo e Fernando espero ve-los apenas no PI 4. foi
// grande honra aprender com voces. grande abraco. 
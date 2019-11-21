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
public class ex_28 
{
    
    static int [] [] preencheMatrizRandom (int [] [] mat)
        {
            Random aleatorio = new Random();
            
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    mat[i][j] = aleatorio.nextInt(50)+1;
                }
            }
            
            return mat;
        }
    
    static void imprimirMatrizSoma (int [] [] mat)
    {
        
        for (int i = 0; i < mat.length; i++) {
            int somador =0;
                System.out.print("{");
                    for (int j = 0; j < mat[i].length; j++) {
                        somador = somador + mat[i][j];
                            System.out.print (mat[i][j]+" ");

                    }
                        System.out.println("}\n");
                            System.out.println("a soma dos elementos da linha da matriz é: "+somador+"\n");
           
        }
        
    }
    
    
    
        
    
    
    
    
    
    public static void main(String[] args) 
    {
      int linha = ex_22.tamanhoMatriz();
      int coluna = ex_22.tamanhoMatriz();
      
      int [] [] mat = ex_22.criarMatriz(linha, coluna);
      
      mat = preencheMatrizRandom(mat);
      
        imprimirMatrizSoma(mat);
        
        
       
              
        
        
        
    }
}

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
public class ex_40 
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
    
    
    static int findNumber ()
    {
        System.out.print("informe o numero que voce quer procurar na matriz: ");
            int findNum = ex_1.input.nextInt();
            
            return findNum;
    }
    
    
    
    
   static void procuraOcorrencia (int [] [] mat, int findNum)
   {
       boolean notFind = true;
       for (int i = 0; i < mat.length; i++) 
       {
           for (int j = 0; j < mat[i].length; j++) 
           {
               if (mat[i][j] == findNum)
               {
                   System.out.println("o numero "+mat[i][j]+" está na linha : "+i+", coluna: "+j);
                   notFind = false;
               }
           }
           
       }
       
       
       if (notFind)
           {
               System.out.println("Esse numero não está na matriz :/ ");
           }
   }
    
    
    static void imprimiMatrizOriginal (int [] [] mat)
    {
        for (int i = 0; i < mat.length; i++) {
            System.out.print("{");
                for (int j = 0; j < mat[i].length; j++) {
                    System.out.print(mat[i][j]+" ");     
            }
                System.out.println("}");
        }
    }
    
    
    
    public static void main(String[] args) 
    {
        int linha = ex_22.tamanhoMatriz();
        int coluna = ex_22.tamanhoMatriz();
        
        int [] [] mat = ex_22.criarMatriz(linha, coluna);
        
        mat = preencheMatrizRandom(mat);
               
        int Findnum = findNumber();
        System.out.println("\n");
        
        procuraOcorrencia(mat, Findnum);
        
        imprimiMatrizOriginal(mat);
        
        
    }
}

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
public class ex_31 
 {
    
    static int [][] preencheMat (int [] [] mat)
    {
        Random aleatorio = new Random();
       
        
        for (int i = 0; i < mat[i].length; i++) {
            
            for (int j = 0; j < mat.length; j++) {
              mat [j][i]  = aleatorio.nextInt(60)+10;  
            }
        }
        
        return mat;
    }
    
        static void imprimirVet(int [] [] mat,int [] vet)
        {
          int somador;
          int contV=0;
            
            for (int i = 0; i < mat[i].length; i++) {
                somador=0;
                
               
                for (int j = 0; j < mat.length; j++) {
                    
                    
                    somador = somador + mat [j][i];
                }
               
                
                vet[contV]= somador;
                contV++;
            }
            System.out.println("\n");
            System.out.println("a soma dos itens de cada coluna: \n");
            for (int i = 0; i < vet.length; i++) {
                System.out.print("coluna "+(i+1)+" = "+vet[i]+", ");
            }
            System.out.println("\n");
        }

        
        static void imprimiMatOriginal (int [] [] mat)
        {
            for (int i = 0; i < mat.length; i++) {
                System.out.print("{");
                for (int j = 0; j < mat[i].length; j++) {
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println("}");
            }
        }

    public static void main(String[] args) {
        
        int linha = ex_22.tamanhoMatriz();
        int coluna = ex_22.tamanhoMatriz();
        
        int [] vet = ex_1.criaVetor(coluna);
        
        int [] [] mat = ex_22.criarMatriz(linha, coluna);
        
        mat = preencheMat(mat);
        
        imprimiMatOriginal(mat);
        
        imprimirVet(mat,vet);
        
    }
    
}

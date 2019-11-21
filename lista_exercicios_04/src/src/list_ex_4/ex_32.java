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
public class ex_32 
{
    
    static int verificaQtnImpar (int coluna)
        {
            int cont = 0;
            for (int i = 0; i <= coluna; i++) 
            {
                if (i%2>=1)
                {
                    cont++;
                }
            }
            
            return cont;
        }
    
    static void imprimirVet(int [] [] mat,int [] vet)
        {
          int somador;
            int cont = 0;
            
            for (int i = 0; i < mat.length; i++) 
            {
                somador=0;
                
                System.out.print("{");
                    for (int j = 0; j < mat[i].length; j++) 
                    {
                        System.out.print(mat[i][j]+" ");
                            if ((j+1)%2>=1)
                                {
                                    for (int k = 0; k < mat.length; k++) 
                                    {
                                        somador = somador + mat [k][i];
                                        
                                        
                                    }
                                    
                                    vet[i]=somador;
                                    
                                }
                            else {
                                vet[j] = 0;
                            }
                                    
                }
                System.out.println("}");
                
                         
               
            }
            System.out.println("\n");
            System.out.println("a soma dos itens de cada coluna de posicao impar: \n");
            for (int i = 0; i < vet.length; i++) {
                System.out.print("coluna "+(i+1)+" = "+vet[i]+", ");
            }
            System.out.println("\n");
        }
    
    
    
    
    public static void main(String[] args) 
    {
        int linha = ex_22.tamanhoMatriz();
        int coluna = ex_22.tamanhoMatriz();
        
        //int tamanhoVet = verificaQtnImpar(coluna);
        
        int [] vet = ex_1.criaVetor(coluna);
        
        int mat [] [] = ex_22.criarMatriz(linha, coluna);
        
        mat = ex_31.preencheMat(mat);
        
        imprimirVet(mat, vet);
        
        
    }
}

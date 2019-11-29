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
public class ex_37 
{
    
    
    static void Contarcolunas (int [] [] mat){
        int cont = 0;
        int aux =0;
       
        
        for (int i = 0; i < mat[i].length; i++) 
        {
           aux=0;
            for (int j = 0; j < mat.length; j++) 
            {
               
                    aux=aux+mat[j][i];
            }
            
             if (aux==0)
                    {
                        cont++;
                    }
            
        }
        
        System.out.println("numeros de colunas nulas: "+cont);
    }
    
    static void imprimirNulo (int [] [] mat )
    {
        int auxLinha=0,contLinhas = 0;
        
        
        for (int i = 0; i < mat.length; i++) 
        {
            auxLinha=0;
            
                    for (int j = 0; j < mat[i].length; j++) 
                    {
                        auxLinha = auxLinha+mat[i][j];
                       

                    }
        if (auxLinha == 0)
           {
               contLinhas++;
           }
        
             
        }
   
        
         System.out.println("numeros de linhas nulas: "+contLinhas);
        
        
    }
    
    
    
    
    
    public static void main(String[] args) {
        int linha = ex_22.tamanhoMatriz();
        int coluna = ex_22.tamanhoMatriz();
        
        int [] [] mat = ex_22.criarMatriz(linha, coluna);
        mat = ex_33.preenchematrizUx(mat);
        imprimirNulo(mat);
        Contarcolunas(mat);
        System.out.println("\n ");
        
        ex_36.imprimirMat(mat);
    }
    
}

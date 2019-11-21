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
public class ex_29 
{
    static void imprimirmatVet (int [] vet,int [] [] mat)
    {
        for (int i = 0; i < mat.length; i++) {
            System.out.print("{");
            for (int j = 0; j < mat[i].length; j++) {
                
                mat[i][j] = vet [j];
                System.out.print(mat[i][j]+" ");
            }
            
            System.out.println("}");
        }
        
        System.out.println("vetor: ");
        for (int item : vet)
        {
            System.out.print("{"+item+"} ");
        }
        
        
        
    }
    
    
    public static void main(String[] args) {
       int linha = ex_22.tamanhoMatriz();
       int coluna = ex_22.tamanhoMatriz();
       
       int [] vet = ex_1.criaVetor(coluna);
       
       vet = ex_1.preencheVet(vet);
       
       
       int [] [] mat = ex_22.criarMatriz(linha, coluna);
       
        imprimirmatVet(vet, mat); 
    }
}

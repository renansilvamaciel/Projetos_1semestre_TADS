package list_ex_4;

/**
 *
 * @author renan.smaciel
 */
public class ex_41 
{
    static int maiorValor (int [] [] mat) // a funcao procura o  maior valor e devolve ele. 
    {
        int num =0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j]>num)
                {
                    num = mat[i][j];
                }
            }
        }
        
        return num;
    }
    
    
    
    
    
    public static void main(String[] args) 
    {
     int linha = ex_22.tamanhoMatriz();
     int coluna = ex_22.tamanhoMatriz();
     
     int [] [] mat =  ex_22.criarMatriz(linha, coluna);
     mat = ex_40.preencheMatrizRandom(mat);
     
     int num = maiorValor(mat); // o variavel num recebe o maior valor retornado da funcao. 
     
        System.out.println("o maior valor dentro da matriz é:  "+num);
    }
}

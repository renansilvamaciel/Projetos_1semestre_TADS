package list_ex_4;

/**
 *
 * @author I
 */
public class ex_35 
{
    static void imprimir (int [] [] mat)
    {
        int cont =0;
        double media,somador=0;
        for (int i = 0; i < mat.length; i++) {
            System.out.print("{");
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+" ");
                
                if (mat[i][j]>0)
                {
                    somador = somador+mat[i][j];
                    cont++;
                }
            }
             System.out.println("}");
        }
        media = somador/cont;
        System.out.println("a media dos numeros positivos da matriz é: "+media);
        
    }
    
    
    public static void main(String[] args) {
        int linha = ex_22.tamanhoMatriz();
        int coluna = ex_22.tamanhoMatriz();
        
        int [] [] mat = ex_22.criarMatriz(linha, coluna);
        mat = ex_33.preenchematrizUx(mat);
        
        imprimir(mat);
       
    }
}

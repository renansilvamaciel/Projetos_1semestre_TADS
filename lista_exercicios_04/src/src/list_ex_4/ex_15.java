package list_ex_4;


/**
 *
 * @author renan.smaciel
 */
public class ex_15 
{
    
    static void vetbangucado (int [] vetA)
    {
        for(int item :vetA)
        {
            System.out.print(item+"  ");
        }
        System.out.println("  \n");
    }
    
    
    static void imprimirVetCrescente (int [] vetA)
    {
        for(int item : vetA)
        {
            System.out.print(item+" ");
        }
        
        System.out.println(" \n");
    }

    static int [] vetorCrescente (int [] vetA)
    {
        int aux;
        for (int j = 0; j < vetA.length; j++) 
            {
                for (int i = 0; i < vetA.length-1; i++) 
                    {
                        if (vetA[i]>vetA[i+1])
                            {
                               aux = vetA[i];
                                vetA[i] = vetA[i+1];
                                vetA[i+1] = aux;
                            }
                    }
             }
        return vetA;
    }
    
    
    public static void main(String[] args) 
    {
       int t = ex_1.tamanho();
       int [] vetA = ex_1.criaVetor(t);
       
       vetA = ex_1.preencheVet(vetA);
    
       vetbangucado(vetA);
       
       vetorCrescente(vetA);
       
       imprimirVetCrescente(vetA);
       
        
       
       
    }
}

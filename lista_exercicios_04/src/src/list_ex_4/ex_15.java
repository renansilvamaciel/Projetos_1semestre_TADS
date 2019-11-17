package list_ex_4;


/**
 *
 * @author renan.smaciel
 */
public class ex_15 
{
    //metedo de ordenacao da bolha 
   
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

//    para analisar eu testo o valor da posicao atual do meu vetor com a, a proxima posicao,
//    se o valor da minha proxima posicao é menor que o atual, eu armazeno o valor atual em uma 
//    variavel aux e coloco a variavel da proxima posicao na posicao att, e armazeno o valor que está 
//    na variavel att, na proxima posicao. é chamado do metodo de ordenacao da bolha. 
    
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

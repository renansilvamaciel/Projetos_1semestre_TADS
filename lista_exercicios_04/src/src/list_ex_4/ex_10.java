package list_ex_4;

/**
 *
 * @author I
 */
public class ex_10 
{
    static void imprimirVet(double [] vet,double numR)
    {
        double somador = 0.0;
       for (int i = 0; i < vet.length; i++) 
       {
           double vf = vet[i]%2.0;
           if (vf<=1.99)
           {
               somador = somador + (numR*vet[i]);
           }
       }
       
       System.out.printf("o produto dos elementos do vetor pelo numero real é: %.2f\n",somador);
    }
    
    public static void main(String[] args) 
    {
        int t = ex_1.tamanho();
        double [] vet = ex_2.criarVetor(t);
        vet = ex_2.preencherVetor(vet);
        double numR = ex_7.valorReal();
        imprimirVet(vet, numR);         
    }
}

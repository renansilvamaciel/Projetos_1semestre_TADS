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
           System.out.printf("vettor: %.2f\n",vet[i]);
           double vf = vet[i]%2.0;
           if (vf<=1.99)
           {
               System.out.println(vet[i]);
               somador = somador + (numR*vet[i]);
           }
       }
       
       System.out.println("o produto dos elementos do vetor pelo numero real é: "+somador);
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

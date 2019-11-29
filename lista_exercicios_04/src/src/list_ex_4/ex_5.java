// 5. Dado um vetor de números inteiros, fazer um programa que imprima a média dos elementos do vetor.
package list_ex_4;

/**
 *
 * @author I
 */
public class ex_5 
{
    static void imprimirVetor (int [] vet)
    {
        double somador = 0.0;
        for (int i = 0; i < vet.length; i++) 
        {
            System.out.println(vet[i]);
            somador = somador + vet[i];
        }
        System.out.printf("a media dos numeros do vetor é %.2f\n",(somador/vet.length));
    }
    public static void main(String[] args) 
    {
        int t = ex_1.tamanho();
        int [] vet = ex_1.criaVetor(t);
        vet = ex_1.preencheVet(vet);
        imprimirVetor(vet);
        
    }
}

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
public class ex_12 
{
 
    
    static int [] preencheVet (int vet[])
    {
       int num;
       
        for (int i = 0; i < vet.length; i++) 
        {
            num = (int) (Math.random()*100);
            vet[i] = num;
        }
       return vet;
    }
    
    static void imprimivet (int [] vetA,int [] vetB)
    {
       int somadorA = 0;
       int somadorB = 0;
       
            for (int i = 0; i < vetA.length; i++) 
                {
                    System.out.print(vetA[i]+" ");
                    somadorA = somadorA + vetA[i];
                }
        System.out.println("  ");
            for (int i = 0; i < vetB.length; i++) 
                {
                    System.out.print(vetB[i]+" ");
                    somadorB = somadorB + vetB[i];
                }
        System.out.println("   ");
        double mediaA;
        double mediaB;
       
            mediaA = somadorA/vetA.length;
            mediaB = somadorB/vetB.length;
            
           
       
            if (mediaA < mediaB)
                    {
                        System.out.println("a menor media é: "+mediaA+" do vetor A");
                            System.out.print("vetor A: ");
                                for (int item : vetA) 
                                        {
                                            System.out.print(item+" ");
                                        }
                                System.out.println(" ");
                                System.out.println("______________________________________");
                    }
                else 
                    {
                         System.out.println("a menor media é: "+mediaB+" do vetor B");
                            System.out.print("vetor B: ");
                                for (int item : vetB)
                                    {
                                        System.out.print(item+" ");
                                    }
                                System.out.println("  ");
                                System.out.println("______________________________________");
                    }
            
            if (somadorA>somadorB)
                    {
                       System.out.println("a maior soma é " +somadorA+" do vetor A");
                    }
            
                else 
                    {
                       System.out.println("a maior soma é: "+somadorB+" do vetor B");
                    }
       
    }
    
    
    public static void main(String[] args) 
    {
      int t = ex_1.tamanho();
      
      int [] vetA = ex_1.criaVetor(t);
      
      int [] vetB = ex_1.criaVetor(t);
            
      vetB = preencheVet(vetB);
      vetA = preencheVet(vetA);
            
      imprimivet(vetA, vetB);
      
        
      
      
    }
}

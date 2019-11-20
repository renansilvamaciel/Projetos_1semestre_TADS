/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_ex_4;

import java.util.Scanner;

/**
 *
 * @author I
 */
public class ex_21 
{
    
    
    static int tamanhoVetNomes ()
    {
        int qtAlunos;
          System.out.println("informe a quantudade de alunos: ");
                qtAlunos = ex_1.input.nextInt();
                
      return qtAlunos;
    }
    
    static String [] vetNomes_string (int qtalunos)
        {
            String [] vetnome = new String [qtalunos];
            
            for (int i = 0; i < vetnome.length; i++) {
                
                vetnome [i] = "null";
                
            }
            
            return vetnome;
        }
    
    
    static String [] Vetnomes (String [] vetnomes)
    {
        Scanner input = new Scanner(System.in);
        
            for (int i = 0; i < vetnomes.length; i++) 
            {
                 System.out.println("infome o nome dos alunos: ");
                            vetnomes[i] = input.nextLine();
                            
            }
            
            return vetnomes;
    }
    
    
    
    static int [] vetNotas (int [] vetnotas, String [] vetNomes_string)
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < vetnotas.length; i++) {
            System.out.println("infome a nota do aluno "+vetNomes_string[i]);
                 vetnotas[i] = input.nextInt();
        }
        return vetnotas;
    }
    
    static void melhoresAlunos (int [] vetnotas, String [] vetnome) // fucao que mostra os alunos com nota acima da media;
    {
        
        int aux = 0;
        double media;
                
           for (int i = 0; i < vetnotas.length; i++) 
           {
              aux = aux + vetnotas[i];
           }
            
        media = aux / vetnotas.length;
        
        System.out.println("media da sala: "+media);
        
        for (int i = 0; i < vetnome.length; i++) {
                if (vetnotas[i] > media)
                {
                    System.out.println("aluno: "+vetnome[i]+"\n"
                            + "nota: "+vetnotas[i]+" \n");
                }
            
        }
        
          
    }
    
    
     static void imprimirV (int [] vetnota, String [] vetnome)
        
        {
            for (int i = 0; i < vetnome.length; i++) 
                {
                     System.out.println("aluno: "+vetnome[i]+"\n"
                                + "nota: "+vetnota[i]);
                }
        }
     
     
     
     
     
     
    
     public static void main(String[] args) 
     {
        int qtalunos = tamanhoVetNomes ();
        
        String [] vetnomes = vetNomes_string(qtalunos);
        
        int [] vetnota = ex_1.criaVetor(qtalunos);
        
        vetnomes = Vetnomes(vetnomes);
        
        vetnota = vetNotas(vetnota, vetnomes);
        
         melhoresAlunos(vetnota, vetnomes);
         
         
        
         
         System.out.println(" \n");
         
       }
    
}

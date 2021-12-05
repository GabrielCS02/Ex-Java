package br.generation.exercicios;
import java.util.Scanner;
public class Exercicio04
{
    public static void main(String[] args)
    {
        String sexo, resposta;
        int outrosCalmos=0;
        int idade, count=0,calmo=0, nervosa=0, agressivo=0, nerIdade=0, menorCalmo=0;
        Scanner scan = new Scanner(System.in);

        while(count < 10)
        {
            System.out.print("qual e o seu sexo? digite: (M,F,O)"); 
            sexo = scan.next();
            
            System.out.print("Voce e agressivo(A), nervoso(N) ou calmo(C): ");
            resposta = scan.next();
            
            System.out.print("qual e sua idade: ");
            idade = scan.nextInt();
            

            if(sexo.equals("F"))
            { 
                if(resposta.equals("N"))
                {
                    nervosa++;
                    if(idade > 40)
                    {
                        nerIdade++;
                    }
                }
                else if(resposta.equals("C"))
                {
                    calmo++;
                }
                      
            }

            else if(sexo.equals("M"))
            {

                if(resposta.equals("A"))
                    agressivo++;
                else if(resposta.equals("C"))
                    calmo++;
                else
                {
                    nerIdade++;
                }
                
            }
            
            else
            {
                if(resposta.equals("C"))
                {
                    calmo++;
                    outrosCalmos++;
                }
                else
                {
                    nerIdade++;
                }  
            }
            if(idade < 18)
            {
                menorCalmo++;
            }
            count++;
        }
        	scan.close();
        System.out.println("Pessoas calmas " + calmo);
        System.out.println("Mulheres nervosas " + nervosa);
        System.out.println("Homens agressivos " + agressivo);
        System.out.println("Outros calmos: "+ outrosCalmos);
        System.out.println("Nervosos com mais de 40: "+ nerIdade);
        System.out.println("Calmos menos de 18: "+ menorCalmo);
    }
}
/*
 * 2. Faça um programa onde o usuário digita vários números e, quando digitar 0,
 *   o programa para e soma os valores digitados.
 */

package exerciciovlogica;

import java.util.Scanner;

public class ParaESoma
{

    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        
        double numero, soma = 0 ;

        do {
            System.out.println("Digite um número: (Quando digitar ZERO, os valores digitados serão somados!) ");
            numero = ler.nextDouble();
            soma = numero + soma;
            
           }
        
        while (numero > 0);
        
        System.out.println("Soma dos valores totais: " + soma);
    }
    
}

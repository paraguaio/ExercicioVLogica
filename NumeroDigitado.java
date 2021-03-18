//** 1. Faça um programa que receba somente nºs positivos e exiba e calcule:
// o número digitado
// a soma dos números digitados
// a quantidade de números digitados
// a média dos números digitados

package exerciciovlogica;

import java.util.Scanner;

public class NumeroDigitado
{

    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        
        double numero, soma = 0, cont = 0;

        do {
            System.out.println("Digite um número: ");
            numero = ler.nextDouble();
            System.out.println("Soma dos números digitados: " + soma);
            
        if(numero > 0) 
            {
                soma = numero + soma;
                cont++;
            }
           }
        
        while (numero > 0);
        
        System.out.println("Soma dos valores totais: " + soma);
        System.out.println("A quantidade de elementos digitados foi: " + cont);
        System.out.println("A média é: " + soma / cont);
    }
    
}

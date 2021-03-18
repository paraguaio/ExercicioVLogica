/*
 * Criar um programa em Java que consistem em:
- Listar números de 1 a 50;
- Exibir a lista na horizontal e vertical;
- Exibir o tamanho da lista;
- Somar os valores da lista;
 */
package exerciciovlogica;

import java.util.Arrays;


public class ListarNumeros 
{
public static void main(String[] args)
    {

        int [] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,
            24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
        System.out.println("Estes são os números pares do Array: ");
        for (int i = 0; i < 50; i++) 
        {
            System.out.println("São eles: " + numeros[i]);
        }
        
        System.out.println(Arrays.toString(numeros));
        
        System.out.println("O Array contém " + numeros.length + " elementos");
        
        numeros = numeros + soma;
        // não soube como realizar a soma dos arrays :(
        System.out.println("A soma dos elementos é: " + soma);

        
    }    
}

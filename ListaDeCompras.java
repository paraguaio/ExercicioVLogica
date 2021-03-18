/*
 * 5 . Criar um programa em Java que consiste em uma lista de compras:
- Adicionar itens na lista de compras;
- Consultar itens pelo seu índice;
- Alterar itens da Lista de compras;
- Exibir o tamanho da lista de compras;
- Remover itens da lista de compras;
- Classificar em ordem alfabética
- Limpar a lista de compras
Obs: Criar uma interface que exibe o que está acontecendo com o programa

 */
package exerciciovlogica;

import java.util.ArrayList;
import java.util.Collections;


public class ListaDeCompras 
{
    public static void main(String[] args)
    {
        ArrayList<String> compras = new ArrayList<String>();
        compras.add("Banana");
        compras.add("Pêra");
        compras.add("Maçã");
        compras.add("Manga");
        compras.add("Uva");
        compras.add("Melância");
        

        System.out.println("O array é: " + compras);

        Collections.sort(compras);
        System.out.println("---------------------");
        System.out.println("O array é: " + compras);
        

        compras.set(4, "Jabuticaba");
        System.out.println("O índice 4 contém agora: " + compras.get(4));
        System.out.println("O array é: " + compras);
        

        System.out.println("O tamanho do ArrayList é: " + compras.size());
        
        System.out.println("Removendo o índice 1: " + compras.remove(3));
        System.out.println("O array agora é: " + compras);
        System.out.println("O tamanho do ArrayList agora é: " + compras.size());
        
        compras.clear();
       System.out.println("O array agora é: " + compras);
        
    }
}

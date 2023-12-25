package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Program {

	public static void main(String[] args) {
		/* Fazer um programa para ler um arquivo contendo nomes de pessoas (um nome por linha),
		 * armazendo-os em uma lista. Depois, ordenar dos dados dessa lista e mostra-los ordenadamente
		 * na tela. Nota: o caminho do arquivo pode ser informado "hardcode".
		 * exemplo entrar com os dados (Maria Brown, Alex Green, Bob Grey, Anna White, Alex Black, Eduardo Rose
		 * Willian Red, Marta Blue, Alex Brown
		 */
		
		// Criar uma lista para armazenar os nomes
		List<String> list = new ArrayList<>();
		String path = "C:\\temp\\in.txt"; // Definindo caminho do arquivo
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){ // Instanciar um BufferedReader br e fazer a Leitura do arquivo
			String name = br.readLine(); // Ler uma linha do arquivo
			while(name != null) {  // Condição até encontrar nulo adicionar na lista
				list.add(name); // Guardar na lista quando encontrar nullo na linha
				name = br.readLine();  // Ler a próxima linha
			}
			Collections.sort(list); // Colocar a lista ordenada 
			for (String s : list) { // Percorrer a lista for each  
				System.out.println(s); // Imprimir cada um dos elementos
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage()); // Caso haja um erro neste Try aparecerá esta mensagem
		}
		
	}

}

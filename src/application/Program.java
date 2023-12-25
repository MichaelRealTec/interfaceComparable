package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;


public class Program {

	public static void main(String[] args) {
		/* Problema 1:
		 * Fazer um programa para ler um arquivo contendo nomes de pessoas (um nome por linha),
		 * armazendo-os em uma lista. Depois, ordenar dos dados dessa lista e mostra-los ordenadamente
		 * na tela. Nota: o caminho do arquivo pode ser informado "hardcode".
		 * exemplo entrar com os dados (Maria Brown, Alex Green, Bob Grey, Anna White, Alex Black, Eduardo Rose
		 * Willian Red, Marta Blue, Alex Brown
		 * 
		 * Problema 2:
		 * Faça um programa para ler um arquivo contendo funcionários (nome e salário) no formato .csv,
		 * armazenando-os em uma lista. Depois, ordenar a lista por nome e mostrar o resultado na tela. 
		 * Nota: o caminho do arquivo pode ser informado "harcode".
		 */
		
		// Criar uma lista para armazenar os nomes
		List<Employee> list = new ArrayList<>();
		String path = "C:\\temp\\in.txt"; // Definindo caminho do arquivo
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){ // Instanciar um BufferedReader br e fazer a Leitura do arquivo
			String employeeCsv = br.readLine(); // Ler uma linha do arquivo
			while(employeeCsv != null) {  // Condição até encontrar nulo adicionar na lista
				String[] fields = employeeCsv.split(","); // Cria um vetor que corta quando encontra o caracter passado como argumento.
				list.add(new Employee(fields[0], Double.parseDouble(fields[1]))); // Instanciando o funcionário na lista employeeCsv		
				employeeCsv = br.readLine();  // Ler a próxima linha
			}
			Collections.sort(list); // Colocar a lista ordenada 
			for (Employee emp : list) { // Percorrer a lista for each  
				System.out.println(emp.getName() + ", " + emp.getSalary()); // Imprimir cada um dos elementos
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage()); // Caso haja um erro neste Try aparecerá esta mensagem
		}
		
	}

}

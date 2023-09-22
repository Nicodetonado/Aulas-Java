/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em seguida, mostrar os dados do funcionário 
(nome e salário líquido). Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada (somente o salário bruto é 
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe projetada abaixo.*/
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exercicio2_classe {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee salario = new Employee();
		
		System.out.println("Name: ");
		salario.name = sc.nextLine();
		System.out.println("Gross salary: ");
		salario.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		salario.tax = sc.nextDouble();
		
		System.out.println("\nEmployee: " + salario);
		
		System.out.println("\nWhich percentage to increase salaray? ");
		double percentage = sc.nextDouble();
		salario.increseSalary(percentage);
		
		System.out.println("\nEmployee: " + salario);
		
		
		
		sc.close();

	}

}

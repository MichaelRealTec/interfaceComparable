package entities;

public class Employee implements Comparable<Employee>{
	// Atributos
	private String name;
	private Double salary;
	
	// Métodos Getters e Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	// Método Construtor
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	// Métodos
	@Override
	public int compareTo(Employee other) { // compara um objeto com outro
		return name.compareTo(other.getName());
	}
}

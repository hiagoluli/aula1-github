package entities;

public class Employee {
	public String name;
	public Double GrossSalary;
	public Double Tax;
	
	public Double NetSalary() {
		
		return GrossSalary - Tax;
	}
	
	public void IncreaseSalary(Double percentage) {
		GrossSalary += GrossSalary * percentage /100.0;
	}
	
	public String toString() {
		return name + ", $"+ String.format("%.2f", NetSalary());
	}
}

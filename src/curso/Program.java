package curso;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee2;

public class Program {

	public static void main(String[] args) {
		/*String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f\n", product1, price1);
		System.out.printf("%s, wich price is $ %.2f\n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %c\n", age, code, gender);
		System.out.printf("Measure with eigth decimal places: %.8f\n", measure);
		System.out.printf("Rouded (three decimal places): %.3f\n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter your full name");
		String name = sc.nextLine();
		System.out.println("How many bedrooms are there in your house?");
		int bedrooms = sc.nextInt();
		System.out.println("Enter product price:");
		double price = sc.nextDouble();
		System.out.println("Enter your last name, age and height (same line)");
		String name2 = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.println(name);
		System.out.println(bedrooms);
		System.out.printf("%.2f%n", price);
		System.out.println(name2);
		System.out.println(age);
		System.out.printf("%.2f%n", height);
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		Locale.setDefault(Locale.US);
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		emp.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.Tax = sc.nextDouble();
		System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();
		
		System.out.println("Wich percentage to increase salary: ");
		Double percentage = sc.nextDouble();
		emp.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update Data: " + emp);
		
		sc.close();
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();
		Locale.setDefault(Locale.US);
		System.out.print("Name: ");
		stu.name = sc.nextLine();
		System.out.println("Grade 1: ");
		stu.grade1 = sc.nextDouble();
		while (stu.grade1 > 30) {
			System.out.println("NOTA INVALIDA");
			System.out.println("Grade 1: ");
			stu.grade1 = sc.nextDouble();
		}
		System.out.println("Grade 2: ");
		stu.grade2 = sc.nextDouble();
		while (stu.grade2 > 35) {
			System.out.println("NOTA INVALIDA");
			System.out.println("Grade 2: ");
			stu.grade2 = sc.nextDouble();
		}
		System.out.println("Grade 3: ");
		stu.grade3 = sc.nextDouble();
		while (stu.grade3 > 35) {
			System.out.println("NOTA INVALIDA");
			System.out.println("Grade 3: ");
			stu.grade3 = sc.nextDouble();
		}
		if(stu.PassOrFailed()==true) {
			System.out.printf("PASS " + "%.2f",stu.FinalGrade());
		}else {
			System.out.printf("FAILED--> MISSING POINTS: %.2f",stu.MissingPoint());
		}
		
		sc.close();
		*/
		
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Enter account number(4 digitos):");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)?");
		char y_n = sc.next().charAt(0);
		if(y_n == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			conta = new Conta(number, holder, initialDeposit);
		}
		else {
			conta = new Conta(number, holder);
		}
		
		System.out.println("Account Data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		conta.Deposit(depositValue);
		System.out.println("Update account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		conta.withdraw(withdrawValue);
		System.out.println("Update account data:");
		System.out.println(conta);
		sc.close();
		*/
		
		/*
		
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			vect[room] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for(int i=0; i<10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		sc.close();
		*/
		
		
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many employees will be registered");
		int n = sc.nextInt();
		
		List<Employee2> list = new ArrayList<>();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee2(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase:");
		int id = sc.nextInt();
		Employee2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee2 obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
		*/
		
		
		////////////Matriz/////////////
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da matriz: ");
		int m = sc.nextInt();	
		int n = sc.nextInt();
		
		int [][] matriz = new int[m][n];
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite o numero a ser encontrado: ");
		int numero = sc.nextInt();
		
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<n; j++) {
				if(matriz[i][j] == numero) {
					System.out.println("Position:["+ i + "]" + "[" + j + "]");
					if(j > 0) {
						System.out.println("Left:" + matriz[i][j-1] );
					}
					if(i > 0) {
						System.out.println("Up:" + matriz[i-1][j] );
					}
					if(j < matriz[i].length-1) {
						System.out.println("Right:" + matriz[i][j+1] );
					}
					if(i < matriz.length-1) {
						System.out.println("Down:" + matriz[i+1][j] );
					}
				}
			}
		}	
		sc.close();	
		*/
		
		System.out.println("Teste GitHub");
	}
	
	
	

}

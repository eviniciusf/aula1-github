package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicio_list.Employees;

public class Programm {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employees> list = new ArrayList<>();
		Employees e = new Employees();
		
		System.out.print("How many employees will be registered?");
		int n = sc.nextInt();
		
		int id;
		String name;
		double salary;
		
		
	    for(int i = 0; i < n; i++) {
	    	System.out.println();
	    	System.out.println("Employee #"+ (i+1) + ":");
	    	System.out.print("Id: ");
	    	id = sc.nextInt();
	    	sc.nextLine();
	    	System.out.print("Name: ");
	    	name = sc.nextLine();
	    	System.out.print("Salary: ");
	    	salary = sc.nextDouble();
	    	e = new Employees(id, name, salary);
	    	list.add(e);
	    }
	    
	    
	    System.out.print("Enter the employee id that will have salary increase:");
	    id = sc.nextInt();
	    System.out.print("Enter the percentage: ");
	    double percentagem = sc.nextDouble();
	    
	    for (Employees x: list) {
	    	if (x.getId() == id) {
	    		x.increaseSalary(percentagem);
	    	}
	    }
	   System.out.println("List of employees: ");
	    for (Employees x: list) {
	    	System.out.println(x.getId()+", "+x.getName()+", "+x.getSalary());
	    }
	    sc.close();
	}

}

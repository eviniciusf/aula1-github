package exercicio_list;

public class Employees {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employees() {}

	public Employees(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}
	
	public void increaseSalary(Double percentage) {
		this.salary += this.salary * percentage / 100;
	}
	
	
}

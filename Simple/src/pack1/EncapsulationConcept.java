package pack1;

public class EncapsulationConcept {

	public static void main(String[] args) {
		Encapsulation encaps=new Encapsulation();
		encaps.setRoll(101);
		encaps.getRoll();
		encaps.setName("Lappu Jhappu");
		encaps.getName();
		encaps.setSalary(78000.34d);
		encaps.getSalary();
		encaps.setDept("New Digital Program");
		encaps.getDept();

	}

}

class Encapsulation {
	private int roll;
	private String name;
	private double salary;
	private String dept;

	public int getRoll() {
		System.out.println("Roll Number is: "+roll);
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		System.out.println("Name is : "+name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		System.out.println("Salary is : "+salary);
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDept() {
		System.out.println("Department is : "+dept);
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
}
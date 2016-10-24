package manage;

import com.lemanov.polmorph.Contractor;
import com.lemanov.polmorph.Employee;
import com.lemanov.polmorph.Payable;
import com.lemanov.polmorph.Person;

public class TestPayIncreaseInterfaces {
	
	public static void main(String[] args) {
		
		System.out.println("Interfaces polimorphism\n" + "-----------------");
		
		Payable workers[] = new Payable[3];
		
		workers[0] = new Employee("John");
		workers[1] = new Contractor("Mary");
		workers[2] = new Employee("Stieve");
		
		for (Payable p : workers) {
			p.increasePay(30);
		}
		
		System.out.println("");
		
		System.out.println("Inherits polimorphism\n" + "-----------------");
		
		Person workers2[] = new Person[2];
		workers2[0] = new Employee("Matt");
		workers2[1] = new Contractor("Catrin");
		
		for (Person p : workers2) {
			p.promote(30);
		}
		
	}

}

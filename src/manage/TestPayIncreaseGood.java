package manage;

import com.lemanov.polmorph.Contractor;
import com.lemanov.polmorph.Employee;
import com.lemanov.polmorph.Person;

public class TestPayIncreaseGood {

	public static void main(String[] args) {
		
		Person workers[] = new Person[3];
		workers[0] = new Employee("John");
		workers[1] = new Contractor("Mary");
		workers[2] = new Employee("Stieve");
		
		for (Person p : workers) {
			p.promote(30);
		}

	}

}

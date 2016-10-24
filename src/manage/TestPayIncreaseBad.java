package manage;

import com.lemanov.polmorph.Contractor;
import com.lemanov.polmorph.Employee;
import com.lemanov.polmorph.Person;

public class TestPayIncreaseBad {

	public static void main(String[] args) {
		
		Person workers[] = new Person[3];
		workers[0] = new Employee("John");
		workers[1] = new Contractor("Mary");
		workers[2] = new Employee("Stieve");
		
		Employee currentEmployee;
		Contractor currentContractor;
		
		for (Person p : workers) {
			if (p instanceof Employee) {
				currentEmployee = (Employee)p;
				currentEmployee.increasePay(30);
			} else if (p instanceof Contractor) {
				currentContractor = (Contractor)p;
				currentContractor.increasePay(30);
			}
		}

//// The same example but more easy;
//	Person john = new Employee("John");
//	Person mary = new Contractor("Mary");
//	((Employee) john).increasePay(30);
//	((Contractor) mary).increasePay(30);

	}

}

import Abstract.BaseCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import Mernis.MernisService;

public class Main {

	public static void main(final String[] args) {
		final Customer customer = new Customer(1, "FARUK", "CENGÝZ", 1961, "49216182435");
		final BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisService());
		customerManager.Save(customer);
		

	}

}

import Abstract.BaseCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import Mernis.MernisService;

public class Main {

	public static void main(final String[] args) {
		final Customer customer = new Customer(1, "FARUK", "CENGÝZ", 1961, "49216182452");
		final BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisService());
		customerManager.Save(customer);
		// final Customer customer = new
		// Customer(1,"Furkan","Cengiz",1/07/1997,49180183622);
		// final BaseCustomerManager customerManager = new NeroCustomerManager();
		// customerManager.Save(customer);

	}

}

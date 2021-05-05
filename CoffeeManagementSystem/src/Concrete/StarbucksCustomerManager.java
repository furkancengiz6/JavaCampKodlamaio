package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.PersonCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private final PersonCheckService personCheckService;

	public StarbucksCustomerManager(final PersonCheckService personCheckService) {
		this.personCheckService = personCheckService;

	}

	@Override
	public void Save(final Customer customer) {

		if (personCheckService.checkIfRealPerson(customer)) {

			System.out.println("Saved to db :" + customer.getFirstName());
		} else {
			System.out.println("Not a valid person");
		}

	}

}
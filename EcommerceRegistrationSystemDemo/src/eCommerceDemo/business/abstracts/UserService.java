package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface UserService {

	void register(User user);

	void login(User user);
	
	void delete(User user);

	void verification(User user);
	
	void anotherLogin(User user);
}

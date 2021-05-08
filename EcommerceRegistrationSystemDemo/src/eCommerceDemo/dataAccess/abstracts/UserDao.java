package eCommerceDemo.dataAccess.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface UserDao {
	
	void register(User user);
	void login (User user);
	void delete (User user);
	
	

}

package eCommerceDemo.dataAccess.conretes;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void register(User user) {
		System.out.println("Kullanýcý kayýt oldu  :" + user.getFirstName());

	}

	@Override
	public void login(User user) {
		System.out.println("Kullanýcý giriþ yaptý  :" + user.getFirstName());

	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý sistemden silindi :" + user.getFirstName());

	}

}

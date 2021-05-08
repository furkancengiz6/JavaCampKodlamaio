package eCommerceDemo.business.concretes;

import java.util.Scanner;
import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.core.abstracts.EmailValidatorService;
import eCommerceDemo.core.abstracts.GoogleService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private EmailValidatorService emailValidatorService;
	private GoogleService  googleService;

	public UserManager(UserDao userDao, EmailValidatorService emailValidatorService,GoogleService  googleService) {
		this.userDao = userDao;
		this.emailValidatorService = emailValidatorService;
		this.googleService=googleService;
	}

	@Override
	public void register(User user) {
	
		
		if (user.getFirstName().length() < 2) {
			System.out.println("isminiz 2 karakterden uzun olmalýdýr.");

			return;

		}
		if (user.getLastName().length() < 2) {
			System.out.println("Soyisminiz 2 karakterden uzun olmalýdýr.");
			return;
		}

		if (user.getPassword().length() < 6) {
			System.out.println("þifreniz 6 karakter uzunluðunda olmalýdýr.");
			return;
		}
		if (!emailValidatorService.emailValid(user.getEmail())) {
			
			System.out.println("geçerli mail degil.");
			return;

		}

		userDao.register(user);
		

	}

	@Override
	public void verification(User user) {
		int randomCode = (int) (100 * Math.random() * 100);
		Scanner scan = new Scanner(System.in);
		System.out.println("Doðrulama kodu :" + randomCode);
		System.out.println("Doðrulamak için kodu giriniz :");
		int verification = scan.nextInt();
		if (randomCode == verification) {
			System.out.println("Doðrulama baþarýlý ..");
		} else {
			System.out.println("Doðrulama kodu hatalý..");
		}
	}

	@Override
	public void login(User user) {
		
		if (user.getEmail().equals(user) == user.getEmail().equals(user)) {
			System.out.println("giriþ baþarýlý  :" + user.getFirstName());
		}

	}

	@Override
	public void delete(User user) {
		
		
	}

	@Override
	public void anotherLogin(User user) {
		googleService.register("furkancengiz@gmail.com", "123456");
		
	}

}

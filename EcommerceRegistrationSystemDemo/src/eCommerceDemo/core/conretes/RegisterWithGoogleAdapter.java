package eCommerceDemo.core.conretes;

import eCommerceDemo.core.abstracts.GoogleService;
import eCommerceDemo.googleSignUp.RegisterWithGoogle;

public class RegisterWithGoogleAdapter implements GoogleService {

	
	@Override
	public void  register(String email,String password) {
		RegisterWithGoogle google =  new RegisterWithGoogle();
		
		google.register(email,password);
	}

}

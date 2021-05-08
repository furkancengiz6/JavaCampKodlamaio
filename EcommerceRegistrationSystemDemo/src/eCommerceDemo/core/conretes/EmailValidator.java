package eCommerceDemo.core.conretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import eCommerceDemo.core.abstracts.EmailValidatorService;

public class EmailValidator implements EmailValidatorService{
	
	public boolean emailValid(String email) {
		
		String emailPattern="^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern =Pattern.compile(emailPattern, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(email);
		return matcher.find();
	}

}

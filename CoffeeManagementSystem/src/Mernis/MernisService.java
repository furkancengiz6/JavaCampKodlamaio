package Mernis;

import java.rmi.RemoteException;

import Abstract.PersonCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisService implements PersonCheckService {

	@Override
	public boolean checkIfRealPerson(final Customer customer) {
		final KPSPublicSoap mernisCheck = new KPSPublicSoapProxy();
		try {
			return mernisCheck.TCKimlikNoDogrula(Long.parseLong(customer.getNationalitId()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
					customer.getDateOfBirth());
		} catch (final RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}

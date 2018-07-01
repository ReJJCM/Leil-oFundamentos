package view;

import business.UserRegisterFacade;

public class UserController {

	private UserRegisterFacade facade;
	
	public UserController() {
		facade = new UserRegisterFacade();
	}

	public void insert(String name, String email, String nationId, boolean isPerson, boolean isCompany) {
		facade.save(name, email, nationId, isPerson, isCompany);
	}

}

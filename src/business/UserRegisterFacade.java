package business;

import java.sql.SQLException;

import persistence.User;
import persistence.UserDAO;

public class UserRegisterFacade {

	private UserDAO dao;

	public UserRegisterFacade() {
		dao = new UserDAO();
	}

	public void save(String name, String email, String nationId, boolean isPerson, boolean isCompany) {
		User user = new User(name, email, nationId, false, isPerson, isCompany);
		
		try {
			dao.insert(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

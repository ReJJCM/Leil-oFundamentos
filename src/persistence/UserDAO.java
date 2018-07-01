package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserDAO extends AbstractDAO implements GenericDAO<User> {

	public UserDAO() {
		super();
	}

	public void createUserTable() {
		try {
			String sql = "CREATE TABLE USERS ("
					+ "ID INTEGER NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
					+ "NAME VARCHAR(100) NOT NULL," + "EMAIL VARCHAR(100) NOT NULL,"
					+ "NATIONALID VARCHAR(100) NOT NULL," + "SELLER BOOLEAN," + "PERSON BOOLEAN," + "COMPANY BOOLEAN )";
			createDB(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<User> getAll() throws SQLException {
		return null;
	}

	@Override
	public User getOne(int id) throws SQLException {
		return null;
	}

	@Override
	public void update(User user) throws SQLException {
	}

	@Override
	public void delete(User user) throws SQLException {

	}

	@Override
	public void insert(User user) throws SQLException {
		createUserTable();
		Connection con = getConnection();
		PreparedStatement stmt = con.prepareStatement(
				"INSERT INTO USERS (NOME, EMAIL, NATIONALID, SELLER, PERSON, COMPANY) VALUES (?,?,?,?,?,?)");
		stmt.setString(1, user.getName());
		stmt.setString(2, user.getEmail());
		stmt.setString(3, user.getNationalId());
		stmt.setBoolean(4, user.isSeller());
		stmt.setBoolean(5, user.isPerson());
		stmt.setBoolean(6, user.isCompany());
		int ret = stmt.executeUpdate();
		con.close();
	}

}

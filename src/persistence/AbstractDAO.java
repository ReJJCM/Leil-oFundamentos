package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class AbstractDAO {

	public AbstractDAO() {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	void createDB(String query) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:derby:AuctionHouseDB;create=true");
		Statement sta = con.createStatement();
		sta.executeUpdate(query);
		sta.close();
		con.close();
	}

	Connection getConnection() throws SQLException {
		// AuctionHouseDB sera o nome do diretorio criado localmente
		return DriverManager.getConnection("jdbc:derby:AuctionHouseDB");
	}

}

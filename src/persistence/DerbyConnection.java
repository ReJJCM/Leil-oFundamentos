package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DerbyConnection {
	
	private Connection conn;
	
	public DerbyConnection() {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		if (conn == null) {
			try {
				this.conn = DriverManager.getConnection("jdbc:derby:DerbyDB");
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		return conn;
	}
	
	public void closeConnection() {
		
	}
	
	public void createDB() {
		try {
            Connection con = DriverManager.getConnection("jdbc:derby:DerbyDB;create=true");
            Statement sta = con.createStatement();
            String sql = "CREATE TABLE Pessoas ("
                    + "ID INTEGER NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                    + "NOME VARCHAR(100) NOT NULL,"
                    + "TELEFONE CHAR(8) NOT NULL,"
                    + "SEXO CHAR(1) NOT NULL"
                    + ")";
            sta.executeUpdate(sql);
            sta.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
	}
	
}

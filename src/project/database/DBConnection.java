package project.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection implements IDBConnection {

	public static void main(String args[]) {
		if (DBConnection.getConnection() != null) {
			System.out.println("ok connected");
		} else {
			System.out.println("not connected");
		}
	}

	// connection methods returns connection
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;
	}// end of connection method
}

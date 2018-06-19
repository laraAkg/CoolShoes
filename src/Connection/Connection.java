package Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {

	private static Connection conn;

	public Connection(String path) {

		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			conn = (Connection) DriverManager.getConnection("jdbc:ucanaccess://" + path);
		} catch (ClassNotFoundException err) {
			System.out.println("Treiber kann nicht geladen werden");
		} catch (SQLException err) {
			System.out.println("Verbindung kann nicht aufgebaut werden");
		}
	}

}

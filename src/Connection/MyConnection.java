package Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MyConnection {

	private static Connection conn;

	public MyConnection() {

		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			conn = DriverManager.getConnection("jdbc:ucanaccess://C://Users//lucal//Downloads//CoolShoes");
		} catch (ClassNotFoundException err) {
			System.out.println("Treiber kann nicht geladen werden");
		} catch (SQLException err) {
			System.out.println("Verbindung kann nicht aufgebaut werden");
		}
	}

	public ArrayList<String[]> getAllKunde(String tabelle) {
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT KID as ID, KName as Name, KVorname as Vorname, KAdresse as Adresse, KPLZ as PLZ, KOrt as Ort, KEmailAdresse as Email, KPWD as Passwort FROM Kunde");
			ArrayList<String[]> list = new ArrayList();
			while (rs.next()) {
				rs.getInt("ID");
				rs.getString("Name");
				rs.getString("Vorname");
				rs.getString("Adresse");
				rs.getString("PLZ");
				rs.getString("Ort");
				rs.getString("Email");
				rs.getString("Passwort");				
			}
			rs.close();
			stmt.close();
		} catch (SQLException err) {
			System.out.println("ungültiger SQL-Befehl");
		}
		return null;

	}

}

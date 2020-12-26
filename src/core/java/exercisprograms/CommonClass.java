package core.java.exercisprograms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CommonClass {

	public static Connection get_JDBCConnection(String dbUrl, String dbUsername, String dbPassword)
			throws SQLException, ClassNotFoundException {

		Connection con = null;
		/*
		 * Here no need to Handle the Exception let throw Exceptions up the stack and
		 * let the caller handle the Exception appropriately if required.
		 */
		try {
			Class.forName("oracle.jdbc.OracleDriver");

			con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		} catch (ClassNotFoundException clse) {
			System.out.println("Could not load JDBC driver: " + clse.getMessage());
			clse.printStackTrace();
		} catch (SQLException sqle) {
			System.out.println("Could not connect to DB: " + sqle.getMessage());

		}
		System.out.println("Connection is Ready ");
		return con;
	}
}

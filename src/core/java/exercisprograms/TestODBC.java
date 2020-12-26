package core.java.exercisprograms;

import java.sql.*;

public class TestODBC {

	public static void main(String[] args) {
		try {
			System.out.println("SQL Connection ");
			Connection con = null;

			Class.forName("oracle.jdbc.OracleDriver"); 
			con = DriverManager.getConnection("jdbc:oracle:thin:@lnxdb-pdv-vm-255:1521:DV1RAO", "QTCADMIN", "Ym2P4b0P"); 
			System.out.println("Connection is Good");
			
		} catch (SQLException sqle) {
			System.err.println("SQL Exception Occured : " + sqle.getMessage());
			sqle.printStackTrace();

		} catch (ClassNotFoundException clse) {
			System.err.println("Class Not Found Exception Occured : " + clse.getMessage());
			clse.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Error -> " + ex);
			System.err.println("Other Exception Occured : " + ex.getMessage());
			ex.printStackTrace();
		}
	}

}

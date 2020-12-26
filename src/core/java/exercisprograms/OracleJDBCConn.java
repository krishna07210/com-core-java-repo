package core.java.exercisprograms;

import java.sql.*;
import java.lang.Class.*;

public class OracleJDBCConn {

	void displayProfileInfo() {


		String dbUrl  = "jdbc:oracle:thin:@lnxdb-pdv-vm-255:1521:DV1RAO";
		String dbUsername  = "QTCADMIN";
		String dbPassword  = "Ym2P4b0P";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String getProfQry = "SELECT PROFILE_ID, PROFILE_STATUS, AGREEMENT_NAME FROM CCRM_PROFILES WHERE ROWNUM <=5";

		try {
			System.out.println("Program : JDBC SQL Connection Demo Program ");

			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
			System.out.println("Connection Status -> Good");

			stmt = con.createStatement();
			rs = stmt.executeQuery(getProfQry);

			System.out.println("Profile ID \t:  Profile Status   \t:  Agreement Name ");
			System.out.println("----------      ---------------        --------------");
			while (rs.next()) {
				int Profile_ID = rs.getInt("PROFILE_ID");
				String Profile_Status = rs.getString("PROFILE_STATUS");
				String Agrmt_name = rs.getString("AGREEMENT_NAME");
				System.out.println(Profile_ID + "      \t:  " + Profile_Status + "     \t:   " + Agrmt_name);
			}

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
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
				if (con != null) {
					con.close();
					con = null;
				}
			} catch (Exception oth) {
				System.err.println(oth);
				oth.printStackTrace();
			}

		}
	}
}

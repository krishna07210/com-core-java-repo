package core.java.exercisprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Types;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;
import java.sql.DatabaseMetaData;
import java.sql.CallableStatement;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import oracle.jdbc.internal.OracleTypes;

import java.util.AbstractMap;
import java.lang.*;

public class JdbcExample {

	private static String dbUrl = "jdbc:oracle:thin:@lnxdb-pdv-vm-255:1521:DV1RAO";
	private static String dbUsername = "QTCADMIN";
	private static String dbPassword = "Ym2P4b0P";

	public static Connection getConnection() throws SQLException, ClassNotFoundException {

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

	void displayProfileInfo() {

		System.out.println("Statement Example Program");
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String getProfQry = "SELECT PROFILE_ID, PROFILE_STATUS, AGREEMENT_NAME FROM CCRM_PROFILES WHERE ROWNUM <=5";

		System.out.println("displayProfileInfo : Method will display the Profile List ");
		try {
			try {
				con = getConnection();
			} catch (ClassNotFoundException clse) {
				System.out.println("Could not load JDBC driver: " + clse.getMessage());
				clse.printStackTrace();
			} catch (SQLException sqle) {
				System.out.println("Could not connect to DB: " + sqle.getMessage());
			}

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

		} catch (Exception ex) {
			System.out.println("Error -> " + ex);
			System.err.println("Other Exception Occured : " + ex.getMessage());
			ex.printStackTrace();
		}

	}

	void displayProfileInfoInput(int profile_id) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		System.out.println("PreparedStatement Example Program");

		String getProfQry = "SELECT PROFILE_ID, PROFILE_STATUS, AGREEMENT_NAME FROM CCRM_PROFILES WHERE PROFILE_ID = ?";
		System.out.println(
				"displayProfileInfo : Method will display the Profile Info for the Profile ID-> " + profile_id);

		try {
			con = getConnection();
		} catch (ClassNotFoundException clse) {
			System.out.println("Could not load JDBC driver: " + clse.getMessage());
			clse.printStackTrace();
		} catch (SQLException sqle) {
			System.out.println("Could not connect to DB: " + sqle.getMessage());
		}

		try {
			pstmt = con.prepareStatement(getProfQry);

			// 42181
			pstmt.setInt(1, profile_id);

			rs = pstmt.executeQuery();

			System.out.println("Profile ID \t:  Profile Status   \t:  Agreement Name ");
			System.out.println("----------      ---------------        --------------");

			while (rs.next()) {
				int Profile_ID = rs.getInt("PROFILE_ID");
				String Profile_Status = rs.getString("PROFILE_STATUS");
				String Agrmt_name = rs.getString("AGREEMENT_NAME");
				System.out.println(Profile_ID + "      \t:  " + Profile_Status + "     \t:   " + Agrmt_name);
			}
		} catch (

		SQLException sqlpe) {
			System.out.println("Could not connect to DB: " + sqlpe.getMessage());
		}
	}

	void getProfileMetaData() {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;

		System.out.println("ResultSetMetaData Example Program");

		String getProfQry = "SELECT PROFILE_ID, PROFILE_STATUS, AGREEMENT_NAME FROM CCRM_PROFILES";
		System.out.println("displayProfileInfo : Method will display the CCRM_PROFILES Meta Data ");

		try {
			con = getConnection();
		} catch (ClassNotFoundException clse) {
			System.out.println("Could not load JDBC driver: " + clse.getMessage());
			clse.printStackTrace();
		} catch (SQLException sqle) {
			System.out.println("Could not connect to DB: " + sqle.getMessage());
		}

		try {
			pstmt = con.prepareStatement(getProfQry);

			rs = pstmt.executeQuery();

			rsmd = rs.getMetaData();

			System.out.println("Total No of Columns = " + rsmd.getColumnCount());
			System.out.println("Column Name of 1st Column = " + rsmd.getColumnName(1));
			System.out.println("Column Type Name of 1st column:  = " + rsmd.getColumnTypeName(1));
			System.out.println("Column Name of 1st is nullable :  = " + rsmd.isNullable(1));

		} catch (

		SQLException sqlpe) {
			System.out.println("Could not connect to DB: " + sqlpe.getMessage());
		}
	}

	void getDatabaseMetaData() {
		System.out.println("Database MetaData Example Program");
		Connection con = null;
		DatabaseMetaData dbmd = null;

		try {
			try {
				con = getConnection();
			} catch (ClassNotFoundException clse) {
				System.out.println("Could not load JDBC driver: " + clse.getMessage());
				clse.printStackTrace();
			} catch (SQLException sqle) {
				System.out.println("Could not connect to DB: " + sqle.getMessage());
			}

			dbmd = con.getMetaData();

			System.out.println("Driver Name: " + dbmd.getDriverName());
			System.out.println("Driver Version: " + dbmd.getDriverVersion());
			System.out.println("UserName: " + dbmd.getUserName());
			System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
			System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());
			System.out.println("Connection URL : " + dbmd.getURL());

		} catch (

		SQLException sqlpe) {
			System.out.println("Could not connect to DB: " + sqlpe.getMessage());
		}

	}

	void getCallableStatementProc(int profile_ID, String agmt_name) {
		System.out.println("CallableStatement : Calling Procedure Name");
		Connection con = null;
		CallableStatement cstmt = null;
		try {
			try {
				con = getConnection();
			} catch (ClassNotFoundException clse) {
				System.out.println("Could not load JDBC driver: " + clse.getMessage());
				clse.printStackTrace();
			} catch (SQLException sqle) {
				System.out.println("Could not connect to DB: " + sqle.getMessage());
			}

			cstmt = con.prepareCall("{call Proc_CallableStmt(?,?) }");
			cstmt.setInt(1, profile_ID);
			cstmt.setString(2, agmt_name);
			cstmt.executeQuery();

		} catch (

		SQLException sqlpe) {
			System.out.println("Could not connect to DB: " + sqlpe.getMessage());
		}

	}

	public String getCallableStmtgetProfileStatusFunc(int profile_ID) {
		System.out.println("CallableStatement : Calling Function Name");
		Connection con = null;
		CallableStatement cstmt = null;
		String profileStatus = "NA";

		try {
			try {
				con = getConnection();
			} catch (ClassNotFoundException clse) {
				System.out.println("Could not load JDBC driver: " + clse.getMessage());
				clse.printStackTrace();
			} catch (SQLException sqle) {
				System.out.println("Could not connect to DB: " + sqle.getMessage());
			}

			cstmt = con.prepareCall("{? = call get_Profile_Status_fun(?) }");
			cstmt.setInt(2, profile_ID);
			cstmt.registerOutParameter(1, Types.VARCHAR);
			cstmt.execute();
			profileStatus = cstmt.getString(1);
		} catch (

		SQLException sqlpe) {
			System.out.println("Could not connect to DB: " + sqlpe.getMessage());
		}

		return profileStatus;
	}

	public static Map<String, String> getCallableStmtProcOut(String instance_name) {
		System.out.println("CallableStatement : Calling Procedure with Out Parameters Retun as MAP");
		Connection con = null;
		CallableStatement cstmt = null;

		String hostName = null;
		String version = null;
		Map<String, String> mapCollection = null;

		String getDBUSERByUserIdSql = "{call get_DB_Details_prc(?,?,?)}";

		try {
			try {
				con = getConnection();
			} catch (ClassNotFoundException clse) {
				System.out.println("Could not load JDBC driver: " + clse.getMessage());
				clse.printStackTrace();
			} catch (SQLException sqle) {
				System.out.println("Could not connect to DB: " + sqle.getMessage());
			}

			cstmt = con.prepareCall(getDBUSERByUserIdSql);

			cstmt.setString(1, instance_name);
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.registerOutParameter(3, Types.VARCHAR);
			cstmt.execute();
			hostName = cstmt.getString(2);
			version = cstmt.getString(3);

			mapCollection = Stream
					.of(new AbstractMap.SimpleEntry<>("HostName", hostName),
							new AbstractMap.SimpleEntry<>("Version", version))

					.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
			;
		} catch (

		SQLException sqlpe) {
			System.out.println("Could not connect to DB: " + sqlpe.getMessage());
		}
		return mapCollection;
	}

	// public static class ClassCollection {
	// public String hostName;
	// public String instanceName;
	//
	// public ClassCollection(String hostName, String instanceName) {
	// this.hostName = hostName;
	// this.instanceName = hostName;
	// }
	// }

	public static ClassCollection getCallableStmtProcOut1(String instance_name) {
		System.out.println("CallableStatement : Calling Procedure with Out Parameters Retun as Class");
		Connection con = null;
		CallableStatement cstmt = null;

		String hostName = null;
		String version = null;

		String getDBUSERByUserIdSql = "{call get_DB_Details_prc(?,?,?)}";

		try {
			try {
				con = getConnection();
			} catch (ClassNotFoundException clse) {
				System.out.println("Could not load JDBC driver: " + clse.getMessage());
				clse.printStackTrace();
			} catch (SQLException sqle) {
				System.out.println("Could not connect to DB: " + sqle.getMessage());
			}

			cstmt = con.prepareCall(getDBUSERByUserIdSql);

			cstmt.setString(1, instance_name);
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.registerOutParameter(3, Types.VARCHAR);
			cstmt.execute();
			hostName = cstmt.getString(2);
			version = cstmt.getString(3);

		} catch (

		SQLException sqlpe) {
			System.out.println("Could not connect to DB: " + sqlpe.getMessage());
		}
		return new ClassCollection(hostName, version);
	}

	public void getCallableStmtProcOutCursor(int p_profile_ID) {
		System.out.println("CallableStatement : Calling Procedure with Out as Cursor Parameters");
		Connection con = null;
		CallableStatement cstmt = null;
		ResultSet rs;

		int profileID = 0;
		String profileStatus = null;
		String agmtStatus = null;

		String getDBUSERByUserIdSql = "{call get_Prof_Dtl_Refcur_prc(?,?)}";

		try {
			try {
				con = getConnection();
			} catch (ClassNotFoundException clse) {
				System.out.println("Could not load JDBC driver: " + clse.getMessage());
				clse.printStackTrace();
			} catch (SQLException sqle) {
				System.out.println("Could not connect to DB: " + sqle.getMessage());
			}

			cstmt = con.prepareCall(getDBUSERByUserIdSql);

			cstmt.setInt(1, p_profile_ID);
			cstmt.registerOutParameter(2, OracleTypes.CURSOR);
			cstmt.execute();
			rs = (ResultSet) cstmt.getObject(2);

			System.out.println("Profile ID \t:  Profile Status   \t:  Agreement Name ");
			System.out.println("----------      ---------------        --------------");
			while (rs.next()) {

				int Profile_ID = rs.getInt("PROFILE_ID");
				String Profile_Status = rs.getString("PROFILE_STATUS");
				String Agrmt_name = rs.getString("AGREEMENT_NAME");
				System.out.println(Profile_ID + "      \t:  " + Profile_Status + "     \t:   " + Agrmt_name);
			}
		} catch (

		SQLException sqlpe) {
			System.out.println("Could not connect to DB: " + sqlpe.getMessage());
		}
	}

}

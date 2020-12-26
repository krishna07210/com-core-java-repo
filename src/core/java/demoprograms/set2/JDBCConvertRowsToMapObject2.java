package core.java.demoprograms.set2;

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.lang.*;

public class JDBCConvertRowsToMapObject2 {

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

	public List<Map<String, Object>> bindProfileInfo() {

		System.out.println("Statement Profile Info Bind Program");
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String getProfQry = "SELECT PROFILE_ID, PROFILE_STATUS, AGREEMENT_NAME FROM CCRM_PROFILES WHERE profile_ID > 40000 and ROWNUM <=5";

		List<Map<String, Object>> row = new ArrayList<>();

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

			System.out.println(con);

			ResultSetMetaData metaData = rs.getMetaData();
			int colCount = metaData.getColumnCount();
//			columns =null;
			System.out.println("metaData ->" + metaData);
			while (rs.next()) {
//				int Profile_ID = rs.getInt("PROFILE_ID");
//				String Profile_Status = rs.getString("PROFILE_STATUS");
//				String Agrmt_name = rs.getString("AGREEMENT_NAME");
//				System.out.println(Profile_ID + "      \t:  " + Profile_Status + "     \t:   " + Agrmt_name);

				Map<String, Object> columns = new HashMap<String, Object>();
				for (int i = 1; i <= colCount; i++) {
					columns.put(metaData.getColumnLabel(i).toString(), rs.getObject(i));
					System.out.println(
							"i= " + i + " MetaData - " + metaData.getColumnLabel(i) + " Obj -" + rs.getObject(i));

				}

				row.add(columns);
			}

//			System.out.println(row);
		} catch (SQLException sqle) {
			System.err.println("SQL Exception Occured : " + sqle.getMessage());
			sqle.printStackTrace();

		} catch (Exception ex) {
			System.out.println("Error -> " + ex);
			System.err.println("Other Exception Occured : " + ex.getMessage());
			ex.printStackTrace();
		}

		return row;
	}

	
	public List<Map<String, Object>> bindOrderInfo(int ProfileID) {

		System.out.println("Statement Profile Order Bind Program");
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String getProfQry = "select header_ID, Order_number,created_by from ccrm_profile_order where profile_id ="+ProfileID;

		List<Map<String, Object>> row = new ArrayList<>();

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

			System.out.println(con);

			ResultSetMetaData metaData = rs.getMetaData();
			int colCount = metaData.getColumnCount();
//			columns =null;
			System.out.println("metaData ->" + metaData);
			while (rs.next()) {
//				int Profile_ID = rs.getInt("PROFILE_ID");
//				String Profile_Status = rs.getString("PROFILE_STATUS");
//				String Agrmt_name = rs.getString("AGREEMENT_NAME");
//				System.out.println(Profile_ID + "      \t:  " + Profile_Status + "     \t:   " + Agrmt_name);

				Map<String, Object> columns = new HashMap<String, Object>();
				for (int i = 1; i <= colCount; i++) {
					columns.put(metaData.getColumnLabel(i).toString(), rs.getObject(i));
					System.out.println(
							"i= " + i + " MetaData - " + metaData.getColumnLabel(i) + " Obj -" + rs.getObject(i));

				}

				row.add(columns);
			}

//			System.out.println(row);
		} catch (SQLException sqle) {
			System.err.println("SQL Exception Occured : " + sqle.getMessage());
			sqle.printStackTrace();

		} catch (Exception ex) {
			System.out.println("Error -> " + ex);
			System.err.println("Other Exception Occured : " + ex.getMessage());
			ex.printStackTrace();
		}

		return row;
	}

	
	private RowClass getLookupObjFor(Map<String, Object> row) {

		String Profile_ID = null;
		String Profile_Status = null;
		String Agrmt_name = null;

		try {
			Profile_ID = row.get("PROFILE_ID").toString();

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Profile_Status = row.get("PROFILE_STATUS").toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Agrmt_name = row.get("AGREEMENT_NAME").toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new RowClass(Integer.parseInt(Profile_ID), Profile_Status, Agrmt_name);
	}

	public void displayProfileInfo(List<Map<String, Object>> rows) {

		if (rows.isEmpty()) {
			System.out.println("Result Set is Empty");
		}

		System.out.println(rows);
		for (Map map : rows) {

			for (int i = 0; i < rows.size(); i++) {
				RowClass rowClass = getLookupObjFor(rows.get(i));
				int pid = rowClass.getProfile_ID();
				String psts = rowClass.getProfile_Status();
				String agmt = rowClass.getAgrmt_name();
//				System.out.println(pid + "    :  " + psts + "     :   " + agmt);
			}
		}
	}
}

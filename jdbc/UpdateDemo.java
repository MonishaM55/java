package com.quinnox.jdbc;

import java.sql.*;
import java.util.*;
public class UpdateDemo {
	public static void main(String args[]) {
		Connection con;
		PreparedStatement pstmt;
		ResultSet rs;
		int cnt = 0;
		String sqlUpdate;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
			sqlUpdate = "UPDATE employees" + "set job_id= ?"
					+ "WHERE employeeNumber=?";
			pstmt = con.prepareStatement(sqlUpdate);
			Scanner s = new Scanner(System.in);
			System.out.println("enter Employee id:");
			int eid = s.nextInt();
			s.nextLine();
			System.out.println("enter new job id:");
			String strm = s.nextLine();
			pstmt.setString(1, strm);
			pstmt.setInt(2, eid);
			int rowAffected = pstmt.executeUpdate();
			System.out.println("Row affected" + rowAffected);
			strm = "Sales Head";
			eid = 1370;
			pstmt.setString(1, strm);
			pstmt.setInt(2, eid);
			rowAffected = pstmt.executeUpdate();
			System.out.println("Row affected" + rowAffected);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

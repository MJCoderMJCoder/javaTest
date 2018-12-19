/**
 * 
 */
package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.util.DBUtil;

/**
 * @author MJCoder
 *
 */
public class MySQLTest {
	private static Connection conn = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;

	/**
	 * 
	 */
	public MySQLTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getConnection();
			// ps = conn.prepareStatement("SELECT * FROM sys.sys_config");
			ps = conn.prepareStatement("SELECT * FROM card_table");
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("password：" + rs.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeDB(conn, ps, rs);
		}
	}

}

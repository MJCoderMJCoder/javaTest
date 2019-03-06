/**
 * 
 */
package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Aliyun {
	public static void main(String[] args) {
		Connection conn = null;
		String sql;
		String url = "jdbc:mysql://47.97.199.20:3306?zeroDateTimeBehavior=convertToNull" + "user=root;password=MJCoder;useUnicode=true;characterEncoding=UTF8";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			System.out.println(conn);
			Statement stmt = conn.createStatement();
			System.out.println(stmt);
		} catch (SQLException e) {
			System.out.println("MySQL操作错误");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

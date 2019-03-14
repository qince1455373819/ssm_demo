package com.ywkd.util;
import java.sql.*;

public class MysqlJdbc {
	public static  void main(String args[]) {
	    try {
	      Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������   
	      //Class.forName("org.gjt.mm.mysql.Driver");
	     System.out.println("Success loading Mysql Driver!");
	    }
	    catch (Exception e) {
	      System.out.print("Error loading Mysql Driver!");
	      e.printStackTrace();
	    }
	    try {
	      Connection connect = DriverManager.getConnection(
	          "jdbc:mysql://192.168.4.88:3306/test","root","123456");
	           //����URLΪ   jdbc:mysql//��������ַ/���ݿ���  �������2�������ֱ��ǵ�½�û���������

	      System.out.println("Success connect Mysql server!");
	      Statement stmt = connect.createStatement();
	      ResultSet rs = stmt.executeQuery("select * from goods");
	                                                              //user Ϊ��������
	while (rs.next()) {
	        System.out.println(rs.getString("name"));
	      }
	    }
	    catch (Exception e) {
	      System.out.print("get data error!");
	      e.printStackTrace();
	    }
	  }
}

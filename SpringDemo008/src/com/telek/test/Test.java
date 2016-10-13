package com.telek.test;



import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("appicationContext.xml");
		 DataSource ds =ctx.getBean("dataSource", DataSource.class);
		 Connection conn =ds.getConnection();
		String sql="insert into tbdept values(null,?,?,?,?)";
		PreparedStatement pstmt =conn.prepareStatement(sql);
		pstmt.setString(1, "1111");
		pstmt.setString(2, "1111");
		pstmt.setString(3, "1111");
		pstmt.setString(4, "1111");
		pstmt.executeUpdate();
		System.out.println("success!!");
		if(pstmt!=null) pstmt.close();
		if(conn!=null)conn.close();

	}

}

package com.faith.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testdbservlet")

//Servlet implementation class

public class TestDbServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

// Setup connection variables
		String driverClass = "com.mysql.cj.jdbc.Driver";
		String jdbcUrl = "jdbc:mysql://localhost:3306/professordemo?serverTimezone=UTC";
		String user = "root";
		String password = "faith";

// get connection to database
		try {
			PrintWriter out = resp.getWriter();
			out.println("Connecting to database:" + jdbcUrl + "\n");

// set connectionString
			Class.forName(driverClass);
			Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
			out.println("SUCCESS!!!");
// close connection
			connection.close();
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new ServletException();
		}
	}

}
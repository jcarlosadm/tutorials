package br.com.jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection(){
		try{
			//return DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "");
			Class.forName("org.sqlite.JDBC");
			return DriverManager.getConnection("jdbc:sqlite:test.db");
		}catch(SQLException | ClassNotFoundException e){
			throw new RuntimeException(e);
		}
	}
}

package br.com.fcbank.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
private final String ORACLE = "jdbc:oracle:thin:@localhost:1521:xe";
	
	public Connection conectar() {
		try {
			return DriverManager.getConnection(ORACLE, "system", "123");
			
		}	catch (SQLException e) {
			System.out.println("Erro ao Conectar");
			throw new RuntimeException(e);
		} 
	}
	
}



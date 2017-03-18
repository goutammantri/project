package web.shp.online.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class AppDAO {

	// TODO please populate the db credentials
	private static final String URL = null;
	private static final String USERNAME = null;
	private static final String PASSWORD = null;

	public Connection getConnection() throws Exception {
		try {
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}

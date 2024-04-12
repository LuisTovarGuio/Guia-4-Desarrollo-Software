package base_datospkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static String url = "jdbc:mysql://localhost:3306/usuarios";
	private static String usuario = "root";
	private static String password = "ALFAromeo15#";
	
	public static Connection conectar() {
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(url,usuario,password);
			
		}catch (SQLException e) {
			System.out.println("Ocurrio un error al conectar con la base de datos");
		}
		return conexion;
	}

}

  
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.conexion;
import beans.User;

public class Users {
	
	public ArrayList<User> getAllUsers() {
		ResultSet resultados = conexion.EjecutarSentencia("SELECT * FROM users");
		ArrayList<User> usuarios = new controlador.Helper().ResultSet2ArrayList(resultados);
		return usuarios;
	}
	
	public boolean checkUserAndPass(String usuario, String password) {
		ResultSet usuarioBD = conexion.EjecutarSentencia("SELECT * FROM users WHERE usuario='"+usuario+"' AND password='"+password+"'");
		
		try {
			return usuarioBD.next();
		} catch (SQLException e) {
			return false;
		}
	}
	
	public void insertUser(String user, String password) {
		conexion.EjecutarUpdate("INSERT INTO users (id, usuario, password) VALUES (1, '"+user+"', '"+password+"');");
	}
	
	public void updateUser(String user, String password) {
		conexion.EjecutarUpdate("UPDATE users SET password='"+password+"' WHERE usuario='"+user+"');");
	}
	
	public void deleteUser(String user) {
		conexion.EjecutarUpdate("DELETE FROM users WHERE usuario = '"+user+"';");
	}


	
}

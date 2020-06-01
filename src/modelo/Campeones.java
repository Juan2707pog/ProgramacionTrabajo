  
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.conexion;
import beans.campeones;

public class Campeones {
	
	public ArrayList<Campeones> getAllCampeones() {
		ResultSet resultados = conexion.EjecutarSentencia("SELECT * FROM campeones");
		ArrayList<Campeones> Campeones = new controlador.Helper2().ResultSet3ArrayList(resultados);
		return Campeones;
	}
	

	
	public void insertCampeon(String Nombre, String Nacionalidad, String Historia) {
		conexion.EjecutarUpdate("INSERT INTO campeones (Nombre, Nacionalidad, Historia) VALUES ('"+Nombre+"', '"+Nacionalidad+"', '"+Historia+"');");
	}
	

	public void deleteCampeon(String Nombre) {
		conexion.EjecutarUpdate("DELETE FROM campeones WHERE Nombre = '"+Nombre+"';");
	}





	
}

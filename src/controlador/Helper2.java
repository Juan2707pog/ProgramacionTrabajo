package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import beans.campeones;

public class Helper2 {
	
	public ArrayList ResultSet3ArrayList(ResultSet resultados) {
		// Ya tengo los datos de la BBDD
		// Voy a transformarlos a objetos
		ArrayList<campeones> arraylist = new ArrayList<campeones>();
		try {
			while(resultados.next()) {
				String Nombre = resultados.getString("Nombre");
				String Nacionalidad = resultados.getString("Nacionalidad");
				String Historia = resultados.getString("Historia");
				arraylist.add(new campeones(Nombre, Nacionalidad, Historia));
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en la consulta de campeones");
		}
		
		return arraylist;
	}

}
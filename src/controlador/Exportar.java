package controlador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import beans.campeones;

public class Exportar {
	
	public void insertCampeon(String Nombre, String Nacionalidad, String Historia) {
		new modelo.Campeones().insertCampeon(Nombre,Nacionalidad, Historia);
	}

	
	public void deleteCampeon(String Nombre) {
		new modelo.Campeones().deleteCampeon(Nombre);
	}
	
}
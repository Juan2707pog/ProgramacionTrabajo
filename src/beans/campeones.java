package beans;

public class campeones {
	String Nombre;
	String Nacionalidad;
	String Historia;
	public campeones() {}
	public campeones(String Nombre , String Nacionalidad, String Historia) {
		this.Nombre = Nombre;
		this.Nacionalidad = Nacionalidad;
		this.Historia = Historia;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getNacionalidad() {
		return Nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}
	public String getHistoria() {
		return Historia;
	}
	public void setHistoria(String historia) {
		Historia = historia;
	}

}

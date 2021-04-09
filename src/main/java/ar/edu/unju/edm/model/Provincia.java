package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Provincia {

	private int codDeProvincia;
	private String nombreDeProvincia;
	
	
	public Provincia() {
		// TODO Auto-generated constructor stub
	}

	
	public int getCodDeProvincia() {
		return codDeProvincia;
	}

	public void setCodDeProvincia(int codDeProvincia) {
		this.codDeProvincia = codDeProvincia;
	}

	public String getNombreDeProvincia() {
		return nombreDeProvincia;
	}

	public void setNombreDeProvincia(String nombreDeProvincia) {
		this.nombreDeProvincia = nombreDeProvincia;
	}

	
}

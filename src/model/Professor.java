package model;

public class Professor extends Funcionario {
	private String materia;
	
	
	
	
	
	
	
	
	
	
	
	

	public Professor() {
		System.out.println("professor criado");
	}

	public Professor(String materia) {

		this.materia = materia;
	}

	
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
}

package Model;

public class Professor extends Usuario {
	private int matricula;
	private String segmento;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	
	public void mostrar() {
		System.out.println("")
	}

}

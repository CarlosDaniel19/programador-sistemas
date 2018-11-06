package Model;

public class Professor extends Usuario {
	private int matriculaProfessor;
	private String nome;
	private String especialidade;

	public int getMatricula() {
		return matriculaProfessor;
	}

	public void setMatricula(int matricula) {
		this.matriculaProfessor = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setSegmento(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Professor(String login, String senha, int tipo, int matriculaProfessor, String nome, String especialidade) {
		super(login, senha, tipo);
		this.matriculaProfessor = matriculaProfessor;
		this.nome = nome;
		this.especialidade = especialidade;
	}

	public void mostrar() {
		System.out.println("Informa��es Professor: ");
		System.out.println("Login: " + super.getLogin());
		System.out.println("Senha: *****");

		System.out.println("Matr�cula: " + matriculaProfessor);
		System.out.println("Nome: " + nome);
		System.out.println("Especialidade: " + especialidade);
	}

}

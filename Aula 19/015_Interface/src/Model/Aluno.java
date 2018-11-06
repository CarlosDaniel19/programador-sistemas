package Model;

public class Aluno extends Usuario implements IUsuario {
	private int MatriculaAluno;
	private String nome;
	private String turno;
	private String turma;

	public int getMatriculaAluno() {
		return MatriculaAluno;
	}

	public void setMatriculaAluno(int matriculaAluno) {
		MatriculaAluno = matriculaAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public Aluno(String login, String senha, int tipo, String nome, String turno, String turma, int matriculaAluno) {
		super(login, senha, tipo);
		this.nome = nome;
		this.turno = turno;
		this.turma = turma;
		this.MatriculaAluno = matriculaAluno;
	}

	@Override
	public void mostrar() {
		System.out.println("Informações do aluno: ");
		System.out.println("Login: " + super.getLogin());
		System.out.println("Senha: *****");

		System.out.println("Matricula: " + MatriculaAluno);
		System.out.println("Nome: " + nome);
		System.out.println("Turno: " + turno);
		System.out.println("Turma: " + turma);
	}

	@Override
	public boolean validarLogin(String login, String senha) {
		if (getLogin().equals(login) && getSenha().equals(senha)) {
			return true;
		}
		return false;
	}
}

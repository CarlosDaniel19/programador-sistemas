package model;

public class Contato {

	private int id;
	private String nome;
	private String email;
	private String mensagem;

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getMensagem() {
		return mensagem;
	}

	@Override
	public String toString() {
		final String ENTER = "\n";
		String retValue = "";

		retValue = "Mensagem Enviada Com Sucesso:" + ENTER + "Nome: " + nome + ENTER + "E-mail: " + email + ENTER
				+ "Mensagem: " + mensagem;

		return retValue;
	}

	public Contato(int id, String nome, String email, String mensagem) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.mensagem = mensagem;

	}

	public Contato(String nome, String email, String mensagem) {
		super();
		this.nome = nome;
		this.email = email;
		this.mensagem = mensagem;
	}
}

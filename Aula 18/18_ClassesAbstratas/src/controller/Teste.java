package controller;
import Model.Professor;
import Model.Aluno;
public class Teste {
	public static void main(String[] args) {
		Professor prof = new Professor("joaquim", "joaquim123", 0, 1123, "Doutor", "Joaquim da Silva");
		prof.mostrar();
		System.out.println("=================");
		Aluno aluno = new Aluno("muzi", "muzi123", 1, "Sergio Muzi", "primeiro", "tarde", 32115);
		aluno.mostrar();
		
		
	}

}

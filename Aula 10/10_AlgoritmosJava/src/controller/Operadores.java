package controller;

import util.Teclado;

public class Operadores {

	public static void main(String[] args) {
		String nome;
		nome = Teclado.lerTexto("Digite seu nome: ");
		
		int nota1;
		nota1 = Teclado.lerInt("Digite a nota1");
		
		int nota2;
		nota2 = Teclado.lerInt("Digite a nota2");
		
		int nota3;
		nota3 = Teclado.lerInt("Digite a nota3");
		
		int nota4;
		nota4 = Teclado.lerInt("Digite a nota4");
		
		int media = nota1 + nota2 + nota3 + nota4;
		media = media/4;
		
		System.out.println("Nome Informado: " + nome);
		System.out.println("M�dia: " + media);
		
	}
}

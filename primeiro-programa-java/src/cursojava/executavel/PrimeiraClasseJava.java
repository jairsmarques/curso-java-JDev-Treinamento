package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/* Main é o método auto executável em Java */
	public static void main(String[] args) {
		
		/* new Aluno() é uma instância (Criação de Objeto) */
		/* aluno1 é uma referencia para o objeto Aluno */
		Aluno aluno1 = new Aluno();/* Aqui será o aluno João */
		
		Aluno aluno2 = new Aluno(); /* Aqui será o aluno Pedro */
		
		Aluno aluno3 = new Aluno(); /* Aqui será o aluno Alex */
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 28);
	}

}

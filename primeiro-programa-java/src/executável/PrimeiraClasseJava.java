package executável;

import javax.swing.JOptionPane;

import cursojava.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		Aluno aluno1 = new Aluno(null);
		
		aluno1.setNome(JOptionPane.showInputDialog("Digite o nome do Aluno"));
		aluno1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite o nome do Aluno")));
		aluno1.setNome(JOptionPane.showInputDialog("Digite o nome do Aluno"));
		aluno1.setNome(JOptionPane.showInputDialog("Digite o nome do Aluno"));
		aluno1.setNome(JOptionPane.showInputDialog("Digite o nome do Aluno"));
		
		System.out.println("O Nome do aluno é: " + aluno1.nome);
		
		Aluno aluno2 = new Aluno(null);
		
		Aluno aluno3 = new Aluno(null);
		
		Aluno aluno4 = new Aluno(null);
		
		Aluno aluno5 = new Aluno("Maria");
		
		Aluno aluno6 = new Aluno("Joao", 50);
		
		
	}

}

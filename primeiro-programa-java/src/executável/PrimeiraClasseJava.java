package executável;

import javax.swing.JOptionPane;

import cursojava.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		Aluno aluno1 = new Aluno(null);
		
		aluno1.setNome(JOptionPane.showInputDialog("Digite o nome do Aluno"));
		aluno1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade do Aluno")));
		aluno1.setNomeMae(JOptionPane.showInputDialog("Digite o nome da Mãe"));
		aluno1.setNomePai(JOptionPane.showInputDialog("Digite o nome do Pai"));
		aluno1.setNomeEscola(JOptionPane.showInputDialog("Digite o nome da Escola"));
		aluno1.setDataNascimento(JOptionPane.showInputDialog("Digite a Data de Nascimento"));
		aluno1.setDataMatricula(JOptionPane.showInputDialog("Digite a Data da Matricula"));
		aluno1.setRegistroGeral(JOptionPane.showInputDialog("Digite o RG do Aluno"));
		aluno1.setNumeroCpf(JOptionPane.showInputDialog("Digite o CPF do Aluno"));
		aluno1.setSerieMatriculado(JOptionPane.showInputDialog("Digite a Série do Aluno"));
		
		aluno1.getDisciplina().setDisciplina1(JOptionPane.showInputDialog("Digite a Disciplina 1"));
		aluno1.getDisciplina().setNota1(Integer.parseInt(JOptionPane.showInputDialog("Digite a NOTA 1 do Aluno")));
		aluno1.getDisciplina().setDisciplina2(JOptionPane.showInputDialog("Digite a Disciplina 2"));
		aluno1.getDisciplina().setNota2(Integer.parseInt(JOptionPane.showInputDialog("Digite a NOTA 2 do Aluno")));
		aluno1.getDisciplina().setDisciplina3(JOptionPane.showInputDialog("Digite a Disciplina 3"));
		aluno1.getDisciplina().setNota3(Integer.parseInt(JOptionPane.showInputDialog("Digite a NOTA 3 do Aluno")));
		aluno1.getDisciplina().setDisciplina4(JOptionPane.showInputDialog("Digite a Disciplina 4"));
		aluno1.getDisciplina().setNota4(Integer.parseInt(JOptionPane.showInputDialog("Digite a NOTA 4 do Aluno")));
		
		
		System.out.println("O Nome do aluno é: " + aluno1.nome);
		System.out.println("O Nome da Mãe é: " + aluno1.nomeMae);
		System.out.println("O Nome da Pai é: " + aluno1.nomePai);
		System.out.println("IDADE: " + aluno1.idade);
		System.out.println("CPF: " + aluno1.numeroCpf);
		System.out.println("RG: " + aluno1.registroGeral);
		System.out.println("Data de Nascimento: " + aluno1.dataNascimento);
		System.out.println("O Nome da Escola: " + aluno1.nomeEscola);
		System.out.println("Data da Matrícula: " + aluno1.dataMatricula);
		System.out.println("Serié do Aluno: " + aluno1.serieMatriculado);
		System.out.println("DISCIPLINA 1: " + aluno1.getDisciplina().getDisciplina1() + aluno1.getDisciplina().getNota1());
		System.out.println("DISCIPLINA 2: " + aluno1.getDisciplina().getDisciplina1() + aluno1.getDisciplina().getNota2());
		System.out.println("DISCIPLINA 3: " + aluno1.getDisciplina().getDisciplina1() + aluno1.getDisciplina().getNota3());
		System.out.println("DISCIPLINA 4: " + aluno1.getDisciplina().getDisciplina1() + aluno1.getDisciplina().getNota4());
		System.out.println("A MÉDIA do Aluno é: " + aluno1.getMediaNota());
		
		Aluno aluno2 = new Aluno(null);
		
		Aluno aluno3 = new Aluno(null);
		
		Aluno aluno4 = new Aluno(null);
		
		Aluno aluno5 = new Aluno("Maria");
		
		Aluno aluno6 = new Aluno("Joao", 50);
		
		
	}

}

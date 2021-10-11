package executável;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.text.Element;

import cursojava.Aluno;
import cursojava.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for (int qtd = 1; qtd <=2; qtd++) {
		
		Aluno aluno1 = new Aluno(null);

		aluno1.setNome(JOptionPane.showInputDialog("Digite o nome do Aluno"));
//		aluno1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade do Aluno")));
//		aluno1.setNomeMae(JOptionPane.showInputDialog("Digite o nome da Mãe"));
//		aluno1.setNomePai(JOptionPane.showInputDialog("Digite o nome do Pai"));
//		aluno1.setNomeEscola(JOptionPane.showInputDialog("Digite o nome da Escola"));
//		aluno1.setDataNascimento(JOptionPane.showInputDialog("Digite a Data de Nascimento"));
//		aluno1.setDataMatricula(JOptionPane.showInputDialog("Digite a Data da Matricula"));
//		aluno1.setRegistroGeral(JOptionPane.showInputDialog("Digite o RG do Aluno"));
//		aluno1.setNumeroCpf(JOptionPane.showInputDialog("Digite o CPF do Aluno"));
//		aluno1.setSerieMatriculado(JOptionPane.showInputDialog("Digite a Série do Aluno"));

		/* *******Criando a lista de Disciplina de forma Dinâmica no FOR****** */
        
		int NumeroDisciplinas = Integer.parseInt(JOptionPane.showInputDialog("Digita a quantidade de disciplinas"));
		
        for (int pos = 1; pos <= NumeroDisciplinas; pos++) {
			String nomeDiscplina = JOptionPane.showInputDialog("Digita a Disciplina" + pos + " ?");
			String notaDiscplina = JOptionPane.showInputDialog("Digita a NOTA" + pos + " ?");

			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDiscplina);
			disciplina.setNota(Double.valueOf(notaDiscplina));
			aluno1.getDisciplinas().add(disciplina);
			
			System.out.println("Disciplina: " + disciplina.getDisciplina() + "Nota: " +
			disciplina.getNota());
		}

		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if (escolha == 0) {/*Opção 0- SIM ou 1- NÃO */
			int continuarRemover = 0;
			int posicao = 1;
			while (continuarRemover == 0) {
				String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina deseja remover?");
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
				posicao++;
				continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover");
				if (posicao == 0) {
					continuarRemover = 1;
				}
				
			}
			}
			
//		}
//		if (escolha == 0) {
//			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, 4?");
//			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
//		}

		/* *******Criando a lista de Disciplina****** */

//		Disciplina disciplina1 = new Disciplina();
//		//disciplina1.setDisciplina("Banco de Dados");
//		disciplina1.setDisciplina(JOptionPane.showInputDialog("Digita a Disciplina 1 do Aluno"));
//		//disciplina1.setNota(90);
//		disciplina1.setNota(Double.parseDouble(JOptionPane.showInputDialog("Digita a Nota1 do Aluno")));
//		
//		aluno1.getDisciplinas().add(disciplina1);
//		
//		Disciplina disciplina2 = new Disciplina();
//		disciplina2.setDisciplina(JOptionPane.showInputDialog("Digita a Disciplina 2 do Aluno"));
//		disciplina2.setNota(Double.parseDouble(JOptionPane.showInputDialog("Digita a Nota2 do Aluno")));
//		aluno1.getDisciplinas().add(disciplina2);
//		
//		Disciplina disciplina3 = new Disciplina();
//		disciplina3.setDisciplina(JOptionPane.showInputDialog("Digita a Disciplina 3 do Aluno"));
//		disciplina3.setNota(Double.parseDouble(JOptionPane.showInputDialog("Digita a Nota3 do Aluno")));
//		aluno1.getDisciplinas().add(disciplina3);
//		
//		Disciplina disciplina4 = new Disciplina();
//		disciplina4.setDisciplina(JOptionPane.showInputDialog("Digita a Disciplina 4 do Aluno"));
//		disciplina4.setNota(Double.parseDouble(JOptionPane.showInputDialog("Digita a Nota4 do Aluno")));
//		aluno1.getDisciplinas().add(disciplina4);

//		aluno1.getDisciplina().setDisciplina1(JOptionPane.showInputDialog("Digite a Disciplina 1"));
//		aluno1.getDisciplina().setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite a NOTA 1 do Aluno")));
//		aluno1.getDisciplina().setDisciplina2(JOptionPane.showInputDialog("Digite a Disciplina 2"));
//		aluno1.getDisciplina().setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite a NOTA 2 do Aluno")));
//		aluno1.getDisciplina().setDisciplina3(JOptionPane.showInputDialog("Digite a Disciplina 3"));
//		aluno1.getDisciplina().setNota3(Double.parseDouble(JOptionPane.showInputDialog("Digite a NOTA 3 do Aluno")));
//		aluno1.getDisciplina().setDisciplina4(JOptionPane.showInputDialog("Digite a Disciplina 4"));
//		aluno1.getDisciplina().setNota4(Double.parseDouble(JOptionPane.showInputDialog("Digite a NOTA 4 do Aluno")));
//		
		alunos.add(aluno1);
		
		}
		
		for (Aluno aluno : alunos) {
			
			System.out.println("O Nome do aluno é: " + aluno.nome);
//			System.out.println("O Nome da Mãe é: " + aluno1.nomeMae);
//			System.out.println("O Nome da Pai é: " + aluno1.nomePai);
//			System.out.println("IDADE: " + aluno1.idade);
//			System.out.println("CPF: " + aluno1.numeroCpf);
//			System.out.println("RG: " + aluno1.registroGeral);
//			System.out.println("Data de Nascimento: " + aluno1.dataNascimento);
//			System.out.println("O Nome da Escola: " + aluno1.nomeEscola);
//			System.out.println("Data da Matrícula: " + aluno1.dataMatricula);
//			System.out.println("Serié do Aluno: " + aluno1.serieMatriculado);

			

//			System.out.println("DISCIPLINA 1: " + disciplina1.getDisciplina() + "NOTA: " + disciplina1.getNota());
//			System.out.println("DISCIPLINA 2: " + disciplina2.getDisciplina() + "NOTA: " + disciplina2.getNota());
//			System.out.println("DISCIPLINA 3: " + disciplina3.getDisciplina() + "NOTA: " + disciplina3.getNota());
//			System.out.println("DISCIPLINA 4: " + disciplina4.getDisciplina() + "NOTA: " + disciplina4.getNota());

//			System.out.println("DISCIPLINA 1: " + aluno1.getDisciplina().getDisciplina1() + aluno1.getDisciplina().getNota1());
//			System.out.println("DISCIPLINA 2: " + aluno1.getDisciplina().getDisciplina1() + aluno1.getDisciplina().getNota2());
//			System.out.println("DISCIPLINA 3: " + aluno1.getDisciplina().getDisciplina1() + aluno1.getDisciplina().getNota3());
//			System.out.println("DISCIPLINA 4: " + aluno1.getDisciplina().getDisciplina1() + aluno1.getDisciplina().getNota4());

			
			System.out.println("A MÉDIA do Aluno é: " + aluno.getMediaNota());
			//System.out.println("Resultado está: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado" ));
			System.out.println("Resultado está: " + aluno.getAlunoAprovado2());
			System.out.println("---------------------------------------------------------------------------- ");
		}
		
	}

}

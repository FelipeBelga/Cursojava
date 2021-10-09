package cursojava;

import java.util.Objects;

public class Aluno {
	
	public String nome;
	public int idade;
	public String dataNascimento;
	public String registroGeral;
	public String numeroCpf;
	public String nomeMae;
	public String nomePai;
	public String dataMatricula;
	public String nomeEscola;
	public String serieMatriculado;
	
   private Disciplina disciplina = new Disciplina();
   
   public void setDisciplina(Disciplina disciplina) {
	this.disciplina = disciplina;
   }
   
   public Disciplina getDisciplina() {
	return disciplina;
   }
	
	public double getMediaNota() {
	   return (disciplina.getNota1() +  
			   disciplina.getNota2() + 
			   disciplina.getNota3() +
			   disciplina.getNota4()) /4;
   }
   
   public boolean getAlunoAprovado() {
	   double media = this.getMediaNota();
	   if (media >= 70) {
		   return true;
	   }else {
		   return false;
	   }
   }
	
	@Override
public int hashCode() {
	return Objects.hash(dataMatricula, dataNascimento, idade, nome, nomeEscola, nomeMae, nomePai, numeroCpf,
			registroGeral, serieMatriculado);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Aluno other = (Aluno) obj;
	return Objects.equals(dataMatricula, other.dataMatricula) && Objects.equals(dataNascimento, other.dataNascimento)
			&& idade == other.idade && Objects.equals(nome, other.nome) && Objects.equals(nomeEscola, other.nomeEscola)
			&& Objects.equals(nomeMae, other.nomeMae) && Objects.equals(nomePai, other.nomePai)
			&& Objects.equals(numeroCpf, other.numeroCpf) && Objects.equals(registroGeral, other.registroGeral)
			&& Objects.equals(serieMatriculado, other.serieMatriculado);
}

	public Aluno(String nomePadrao) {
    	nome = nomePadrao;
    }
    
    public Aluno(String nomePadrao, int idadePadrao) {
    	nome = nomePadrao;
    	idade = idadePadrao;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + "]";
	}
    
 
}

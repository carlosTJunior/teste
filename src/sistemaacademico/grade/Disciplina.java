package sistemaacademico.grade;

import sistemaacademico.entidades.Professor;
import java.util.ArrayList;

public class Disciplina {
	// atributos
	private String nome, codigo, horario;
	private int quantCreditos;
	Professor professor;
	private ArrayList<Turma> turmas= new ArrayList<Turma>();

	//criando a classe turma para fazer a composição
	public class Turma {
		private String turmaID, sala, diasDeAula, horario;
		private Disciplina disciplina;
		//construtor fazio
		public Turma(){
			
		}
		//construtor
		public Turma(String turmaID, String diasDeAula, String horario) {
			super();
			this.turmaID = turmaID;
			this.diasDeAula = diasDeAula;
			this.horario = horario;
		}
		//metodos getters/setters
		public String getTurmaID() {
			return turmaID;
		}
	
		public void setTurmaID(String turmaID) {
			this.turmaID = turmaID;
		}
	
		public String getSala() {
			return sala;
		}
	
		public void setSala(String sala) {
			this.sala = sala;
		}
	
		public String getDiasDeAula() {
			return diasDeAula;
		}
	
		public void setDiasDeAula(String diasDeAula) {
			this.diasDeAula = diasDeAula;
		}
	
		public String getHorario() {
			return horario;
		}
	
		public void setHorario(String horario) {
			this.horario = horario;
		}
		
		public Disciplina getDisciplina() {
			return disciplina;
		}

		public void setDisciplina(Disciplina disciplina) {
			this.disciplina = disciplina;
		}
		// método para cadastrar uma turma
		public void cadastrar(String turmaID, String sala, String diasDeAula, String horario){
			this.turmaID=turmaID;
			this.sala=sala;
			this.diasDeAula=diasDeAula;
			this.horario=horario;
		}
	}

	
	
	
	
	
	// construtor sem parâmetros
	public Disciplina() {
	}
	
	// construtor com 3 parâmetros
	public Disciplina(String nome, String codigo, int quantCreditos) {
		this.nome = nome;
		this.codigo = codigo;
		this.quantCreditos = quantCreditos;
	}
	//metodos getters/setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getQuantCreditos() {
		return quantCreditos;
	}

	public void setQuantCreditos(int quantCreditos) {
		this.quantCreditos = quantCreditos;
	}
	
	public Professor getProfessor() {
		return professor;
	}


	public ArrayList<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(ArrayList<Turma> turmas) {
		this.turmas = turmas;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	// método para cadastrar uma disciplina
	public void cadastrar(String nome, String codigo, String horario, int quantCreditos){
		this.nome=nome;
		this.codigo=codigo;
		this.horario=horario;
		this.quantCreditos=quantCreditos;
		
		boolean validacao=this.validar(quantCreditos);
		
		if(validacao==true){
			System.out.println("Disciplina cadastrada com sucesso!");
		}
		else
			System.out.println("Disciplina inválida!");
	}
	// método para validar a disciplina
	private boolean validar(int quantCreditos){
		if(quantCreditos==2||quantCreditos==4||quantCreditos==6){
			return true;
		}
		else
			return false;
	}
	// método para cadastrar uma turma
	public void cadastrarTurma(String turmaID, String sala, String diasDeAula, String horario){
		Turma turma = new Turma();
		turma.cadastrar(turmaID, sala, diasDeAula, horario);
		this.turmas.add(turma);
	}
}
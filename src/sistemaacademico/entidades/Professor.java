package sistemaacademico.entidades;

import sistemaacademico.grade.Disciplina;

public class Professor extends ServidorPublico{
	//atributos
	protected String cargo, regimeDeDedicacao, formacao;
	protected int numeroDeMatricula;
	protected double salarioBruto;
	public Monitor[] monitores={};
	protected Disciplina[] disciplinas={};
	
	// Construtor sem parâmetros
	public Professor() {
		super();
		
	}
	//construtor com 9 parâmetros
	public Professor(String nomeProfessor, String sobrenomeProfessor, String telefoneProfessor,
			String cargo, String regimeDeDedicacao, String emailProfessor,
			String enderecoProfessor, int numeroDeMatricula, double salarioBruto) {
		super();
		this.cargo = cargo;
		this.regimeDeDedicacao = regimeDeDedicacao;
		this.numeroDeMatricula = numeroDeMatricula;
		this.salarioBruto = salarioBruto;
	}
	//metodos getters/setters
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getRegimeDeDedicacao() {
		return regimeDeDedicacao;
	}
	public void setRegimeDeDedicacao(String regimeDeDedicacao) {
		this.regimeDeDedicacao = regimeDeDedicacao;
	}
	
	public int getNumeroDeMatricula() {
		return numeroDeMatricula;
	}
	public void setNumeroDeMatricula(int numeroDeMatricula) {
		this.numeroDeMatricula = numeroDeMatricula;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	public Monitor[] getMonitores() {
		return monitores;
	}
	public void setMonitores(Monitor[] monitores) {
		this.monitores = monitores;
	}
		
	public Disciplina[] getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(Disciplina[] disciplinas) {
		//condição para cadastrar uma nova disciplina
		if (this.disciplinas.length<=3){
			this.disciplinas = disciplinas;
		}
		else
			System.out.printf("Não é possivel cadastrar mais do que 3 disciplinas.");
	}
	//método para cadastrar um professor
	public void cadastrar(String nome, String sobrenome, String telefone,
			String cargo, String regimeDeDedicacao, String email,
			String endereco, int numeroDeMatricula, double salarioBruto, String formacao){
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
		this.cargo = cargo;
		this.regimeDeDedicacao = regimeDeDedicacao;
		this.email = email;
		this.endereco = endereco;
		this.numeroDeMatricula = numeroDeMatricula;
		this.salarioBruto = salarioBruto;
		this.formacao=formacao;
	}
	// método para o cálculo do salário bruto
	public double calcularSalarioBruto(){
		return this.salarioBruto;
	}
	// método para cadastrar um monitor
	public void adicionarMonitor(Monitor monitor){
		
		Monitor[] novoMonitor = new Monitor[this.monitores.length+1];
		int i;
		
		for(i=0; i<this.monitores.length; i++){
			novoMonitor[i]=this.monitores[i];
		}
		novoMonitor[i]=monitor;
		this.setMonitores(novoMonitor);
	}
	// método para cadastrar uma disciplina
	public void adicionarDisciplina(Disciplina novaDisciplina){
		int i;
		if(this.disciplinas.length<=2){
			Disciplina[] addDisciplinas = new Disciplina[this.disciplinas.length+1];
			
			for(i=0; i<this.disciplinas.length;i++){
				addDisciplinas[i]=this.disciplinas[i];
			}
			addDisciplinas[i]=novaDisciplina;					
		}
		else
			System.out.println("Não é possivel cadastrar mais do que 3 disciplinas.");
	}	
}
package sistemaacademico.entidades;
import sistemaacademico.interfaces.Comunicavel;

import bancodedados.ConexaoBD;

public class Aluno extends Pessoa implements Comunicavel{
	
	//atributos
	protected int numeroDeMatricula;
	protected double ira;
	
	// construtor sem parametros
	public Aluno(){
		this.nome="sem nome";
		this.sobrenome="sem sobrenome";
		this.numeroDeMatricula=0;
		this.endereco="sem endereco";
		this.telefone="sem telefone";
		this.email="sem email";
	}
	
	//construtor com cinco parâmetros
	public Aluno(String nomeAluno, String sobrenomeAluno, String enderecoAluno, String telefoneAluno, String emailAluno, int nroDeMatricula){
		super(nomeAluno, sobrenomeAluno, enderecoAluno, telefoneAluno, emailAluno);
		
		boolean resultado = validar(nroDeMatricula);
		
		//tb tem q validar aqui?
		if(resultado==true)
			this.numeroDeMatricula=nroDeMatricula;
		else{
			System.out.println("Matrícula inválida");
			this.numeroDeMatricula=0;
		}
	}
	
	// com a herança como fica os get's e set's?

	public int getNumeroDeMatricula() {
		return numeroDeMatricula;
	}
	

	public double getIra() {
		return ira;
	}

	public void setIra(double ira) {
		this.ira = ira;
	}
	
	

	public void setNumeroDeMatricula(int numeroDeMatricula) {
		//tb tem q validar aqui?
		boolean resultado=validar(numeroDeMatricula);
		if(resultado==true){
			this.numeroDeMatricula = numeroDeMatricula;
		}
		else{
			System.out.println("Matrícula inválida. A matrícula não foi alterada.");
		}
	}

	//método para cadastrar um aluno
	public void cadastrar(String nomeAluno, String sobrenomeAluno, int nroDeMatricula, String enderecoAluno, String telefoneAluno, String emailAluno, double iraAluno){
		this.nome=nomeAluno;
		this.sobrenome=sobrenomeAluno;
		this.numeroDeMatricula=nroDeMatricula;
		this.endereco=enderecoAluno;
		this.telefone=telefoneAluno;
		this.email=emailAluno;
		this.ira=iraAluno;
	
		ConexaoBD.setStatusConexaoBD(true);
		
		boolean resultadoValidacao = validar(numeroDeMatricula);
		if(resultadoValidacao==true){
			System.out.println("Aluno cadastrado com sucesso");
		}
		else
			System.out.println("Aluno inválido");
	}
	
	//método para validar o aluno
	private boolean validar(int nroMatricula){
		if(nroMatricula>99999999 && ConexaoBD.getStatusConexaoBD()==true)
			return true;
		else
			return false;
	}

	@Override
	public void postarMensagem(String mensagem, String[] contatos) {
		Post post=new Post();
		post.postar("mensagem", this.nome, contatos);		
	}

}

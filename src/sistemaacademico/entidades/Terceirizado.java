package sistemaacademico.entidades;

public abstract class Terceirizado extends Pessoa{

	private String funcao;
	private static String horasDeTrabalho;
	
	public Terceirizado(String nome, String sobrenome, String endereco, String telefone, String email, String funcao) {
		super(nome,sobrenome,endereco,telefone,email);
	}
	
	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}



	public static String getHorasDeTrabalho() {
		return horasDeTrabalho;
	}

	public static void setHorasDeTrabalho(String horasDeTrabalho) {
		Terceirizado.horasDeTrabalho = horasDeTrabalho;
	}

	public static void verificarHoras(){
		if(Terceirizado.horasDeTrabalho.equalsIgnoreCase("4h")){
			System.out.println("O terceirizado trabalha meio periodo.");
		}
		else
			System.out.println("O terceirizado trabalho durante um periodo.");
		
	}
	
	public abstract double atribuirSalario();
}

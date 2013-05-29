package sistemaacademico.entidades;

public class ProfessorRegimeIntegral extends Professor{
	// atributo
	protected double gratificacao;
	
	// construtor vazio
	public ProfessorRegimeIntegral(){
		
	}
	// construtor
	public ProfessorRegimeIntegral(String nome,String sobrenome,String telefone,String cargo,String regimeDeDedicacao,
			String email, String endereco,String formacao,int numeroDeMatricula, double salarioBruto, double gratificacao) {
		super(nome,sobrenome, telefone, cargo, regimeDeDedicacao, email, endereco, numeroDeMatricula, salarioBruto);
	}
	//metodos getters/setters
	public double getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	}
	// método para calcular o salario bruto
	protected double calculoSalarioBruto(){
		if(this.cargo.equalsIgnoreCase("adjunto")){
			this.setSalarioBruto(1000);
			return 1000;
		}
		else{
			this.setSalarioBruto(800.00);
			return 800;
		}
	}
	
}

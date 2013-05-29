package sistemaacademico.entidades;

public class ProfessorRegimeHorista extends Professor{
	//atributos
	private double totalHorasTrabalhadas, salarioHora;
	// construtor vazio
	public ProfessorRegimeHorista() {
		
	}
	//construtor
	public ProfessorRegimeHorista(String nome,String sobrenome,String telefone,String cargo,String regimeDeDedicacao,
			String email, String endereco,String formacao,int numeroDeMatricula, double salarioBruto, double totalHorasTrabalhadas, double salarioHora) {
		super(nome,sobrenome, telefone, cargo, regimeDeDedicacao, email, endereco, numeroDeMatricula, salarioBruto);
		
		this.totalHorasTrabalhadas=totalHorasTrabalhadas;
		this.salarioHora=salarioHora;
	}
	
	//metodos getters/setters
	public double getTotalHorasTrabalhadas() {
		return totalHorasTrabalhadas;
	}

	public void setTotalHorasTrabalhadas(double totalHorasTrabalhadas) {
		this.totalHorasTrabalhadas = totalHorasTrabalhadas;
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}
	// método para calcular o salário bruto
	protected double calculoSalarioBruto(){
		//pq tem q tirar o escopo?
		double salarioBruto= this.getSalarioHora() * this.getTotalHorasTrabalhadas();
		return salarioBruto;
	}

}

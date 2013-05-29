package sistemaacademico.entidades;

public class ProfessorRegimeIntegralAfastado extends ProfessorRegimeIntegral{

	//atributos
	protected int diasDeAfastamento;
	protected String motivo;
	
	// construtor vazio
	public ProfessorRegimeIntegralAfastado() {
		
	}
	// construtor
	public ProfessorRegimeIntegralAfastado(String nome,String sobrenome,String telefone,String cargo,
			String regimeDeDedicacao,String email, String endereco,String formacao,int numeroDeMatricula,
			double salarioBruto, double gratificacao, int diasDeAfastamento, String motivo) {
		
		super(nome, sobrenome, telefone, cargo, regimeDeDedicacao, email, endereco, formacao,
				numeroDeMatricula, salarioBruto, gratificacao);
		
		this.diasDeAfastamento=diasDeAfastamento;
		this.motivo=motivo;
		
		validar();
	}
	//metodos getters/setters
	public int getDiasDeAfastamento() {
		return diasDeAfastamento;
	}

	public void setDiasDeAfastamento(int diasDeAfastamento) {
		this.diasDeAfastamento = diasDeAfastamento;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
	// método para validar os dias de afastamento do professor
	private void validar(){
		if(this.diasDeAfastamento < 112)
			System.out.println("Afastamento dentro da regularidade.\nO motivo do afastamento é: "+this.motivo);
		else
			System.out.println("O afastamento é irregular!");
	}	
}
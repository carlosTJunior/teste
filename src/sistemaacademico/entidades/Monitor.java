package sistemaacademico.entidades;


public class Monitor extends Aluno{
	
	//atributos
	protected String mencao, disciplinaMonitoria, horario;
	protected Professor professor;
	
	// construtor vazio
	public Monitor(){
		super();
	}
	//construtor
	public Monitor(String nomeMonitor, String sobrenomeMonitor, String enderecoMonitor, String telefoneMonitor,String emailMonitor, int nroDeMatricula, String mencaoMonitor, String discMonitoria, String horarioMonitoria, double iraMonitor){
		
		super(nomeMonitor, sobrenomeMonitor, enderecoMonitor, telefoneMonitor, emailMonitor, nroDeMatricula);
		
		boolean resultado= this.validar(mencaoMonitor,iraMonitor);
		if(resultado==true){
			this.mencao=mencaoMonitor;
			this.ira=iraMonitor;
		}
		else{
			System.out.println("Menção inválida ou IRA inválido!");
		}
		this.disciplinaMonitoria=discMonitoria;
		this.horario=horarioMonitoria;
	}
	
	
	//metodos getters/setters
	public String getMencao() {
		return mencao;
	}

	public void setMencao(String mencao) {
		this.mencao = mencao;
	}

	public String getDisciplinaMonitoria() {
		return disciplinaMonitoria;
	}

	public void setDisciplinaMonitoria(String disciplinaMonitoria) {
		this.disciplinaMonitoria = disciplinaMonitoria;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	// metodo para validar o monitor
	private boolean validar(String mencao, double ira){
		if((mencao.equalsIgnoreCase("MS")|| mencao.equalsIgnoreCase("SS"))&&ira>=3)
			return true;
		else
			return false;
	}

}

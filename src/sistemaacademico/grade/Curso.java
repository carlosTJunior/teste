package sistemaacademico.grade;
import sistemaacademico.interfaces.*;

public class Curso implements ValidavelMEC{
	//atributos
	private String nome, codigo;
	private int quantSemestres, quantCreditos;
	double notaMEC;
	// construtor vazio
	public Curso() {
		
	}
	// construtor
	public Curso(String nome, int quantSemestres, int quantCreditos) {
		this.nome = nome;
		this.quantSemestres = quantSemestres;
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

	public int getQuantSemestres() {
		return quantSemestres;
	}

	public void setQuantSemestres(int quantSemestres) {
		this.quantSemestres = quantSemestres;
	}

	public int getQuantCreditos() {
		return quantCreditos;
	}

	public void setQuantCreditos(int quantCreditos) {
		this.quantCreditos = quantCreditos;
	}
	// método para cadastrar um curso
	public void cadastrar(String nome, String codigo, int quantSemestres, int quantCreditos){
		this.nome=nome;
		this.codigo=codigo;
		this.quantSemestres=quantSemestres;
		this.quantCreditos=quantCreditos;
		
		
		boolean resultado=validar(quantSemestres, quantCreditos);
		
		if (resultado == true){
			System.out.println("Curso cadastrado com sucesso!");
		}
		else
			System.out.println("Curso inválido");
		
	}
	// método para validar o curso
	private boolean validar(int quantSemestres, int quantCreditos){
		if(quantSemestres>=2 && quantCreditos>=100){
			return true;
		}
		else
			return false;
	}
	public void validarMEC(double notaMEC){
		if(notaMEC>=3){
			System.out.println("Curso aprovado pelo MEC.");			
		}
		else{
			System.out.println("Curso reprovado pelo MEC.");
		}
	}
}

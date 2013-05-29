package sistemaacademico.entidades;

public class Bibliotecario extends Terceirizado{
	static private double salario;
	public Bibliotecario(String nome, String sobrenome, String endereco, String telefone, String email, String funcao) {
		super(nome,sobrenome,endereco,telefone,email,funcao);
	}
	public static double getSalario() {
		return salario;
	}
	public static void setSalario(double salario) {
		Bibliotecario.salario = salario;
	}
	
	public double atribuirSalario() {
		if(getFuncao().equalsIgnoreCase("bibliotecario"))
			setSalario(1000);
		return salario;
	}
}

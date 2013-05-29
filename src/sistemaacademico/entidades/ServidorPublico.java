package sistemaacademico.entidades;

public abstract class ServidorPublico extends Pessoa{

	public ServidorPublico() {
		super("nome", "sobrenome", "endereco", "telefone", "email");
	}
	
	public abstract double calcularSalarioBruto();

}

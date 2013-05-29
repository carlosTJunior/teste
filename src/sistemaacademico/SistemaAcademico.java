package sistemaacademico;

import sistemaacademico.entidades.*;
import sistemaacademico.grade.*;
import sistemaacademico.interfaces.*;
import java.util.ArrayList;


public class SistemaAcademico {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//testando m�todos � atributos est�ticos
		Terceirizado.setHorasDeTrabalho("4h");
		Terceirizado.verificarHoras();
		
		// testando classes abstratas e concretas
		Terceirizado terceirizado;
		Bibliotecario bibliotecarioFGA=new Bibliotecario("maria", "silva", "gama", "9344-4356", "maria@bibliotecafga.com", "bibliotecario");
		terceirizado=bibliotecarioFGA;
		System.out.println("O sal�rio de um bibliotec�rio �: "+terceirizado.atribuirSalario());
		
		
		//Testando a interface e o atributo static
		Curso engSoft = new Curso("eng. de software", 10, 230);
		engSoft.validarMEC(4);
	}
}
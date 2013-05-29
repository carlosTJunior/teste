package bancodedados;

import java.sql.Date;
import java.sql.Time;

public class ConexaoBD {
	//atributos
	private static String tipoConexaoBD;
	private static Date dataConexaoBD;
	private static Time tempoConexaoBD;
	private static boolean statusConexaoBD;
	
	public ConexaoBD() {
		
	}
	//metodos getters/setters
	public static String getTipoConexaoBD() {
		return tipoConexaoBD;
	}
	public static Date getDataConexaoBD() {
		return dataConexaoBD;
	}
	public static Time getTempoConexaoBD() {
		return tempoConexaoBD;
	}
	public static boolean getStatusConexaoBD() {
		return statusConexaoBD;
	}
	public static void setTipoConexaoBD(String tipoConexaoBD) {
		ConexaoBD.tipoConexaoBD = tipoConexaoBD;
	}
	public static void setDataConexaoBD(Date dataConexaoBD) {
		ConexaoBD.dataConexaoBD = dataConexaoBD;
	}
	public static void setTempoConexaoBD(Time tempoDeConexaoBD) {
		tempoConexaoBD = tempoDeConexaoBD;
	}
	public static void setStatusConexaoBD(boolean statusDaConexaoBD) {
		statusConexaoBD = statusDaConexaoBD;
	}
	
}

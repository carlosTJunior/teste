package sistemaacademico.entidades;

public class Pessoa {
	//atributos
	protected String nome, sobrenome, endereco, telefone, email;
	//construtor vazio
	public Pessoa(){
		
	}
	//construtor
	public Pessoa(String nome, String sobrenome, String endereco, String telefone, String email){
		this.nome=nome;
		this.sobrenome= sobrenome;
		this.endereco=endereco;
		this.telefone=telefone;
		this.email=email;
	}
	//metodos getters/setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}

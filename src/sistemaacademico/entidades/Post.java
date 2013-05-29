package sistemaacademico.entidades;

public class Post {

	public Post() {
		// TODO Auto-generated constructor stub
	}
	// método que publica um poste de uma dado remetente para os destinatarios desejados
	public void postar(String conteudoDoPost, String remetente, String[] destinatarios){
		for (int i=0; i< destinatarios.length;i++){
			System.out.println(destinatarios[i]+","+"tem um novo post do(a)"+ remetente+":"+ conteudoDoPost);
		}
	}
}

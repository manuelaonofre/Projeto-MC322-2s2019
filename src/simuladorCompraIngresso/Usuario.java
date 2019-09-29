package simuladorCompraIngresso;


public class Usuario {
	private String nome;
	private String user;
	private String senha;

	public Usuario(String nome, String user, String senha) {
		super();
		this.nome = nome;
		this.user = user;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", user=" + user + ", senha=" + senha + "]";
	}

}
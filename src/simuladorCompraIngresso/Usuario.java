package simuladorCompraIngresso;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private List<String> nomes = new ArrayList<String>();
	private String user;
	private String senha;
	private List<Ingresso> ingressos = new ArrayList<Ingresso>();
	private int numIngressos = ingressos.size();
<<<<<<< HEAD
=======
	
//	
//	public Usuario(String nome, String user, String senha) {
//		super();
//		this.nome = nome;
//		this.user = user;
//		this.senha = senha;
//	}
>>>>>>> kina

	public String getNome(int i) {
		return nomes.get(i);
	}

	public void setNome(String nome, int i) {
		nomes.add(i, nome);
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
	
	public int getNumIngressos() {
		return numIngressos;
	}
	
<<<<<<< HEAD
	public List<Ingresso> getIngresso(int i) {
		return this.ingressos;
=======
	public List<Ingresso> getIngresso(int i){
		return this.ingressos;
	}
	
	public void setIngresso(String filme, int i, int tipo) {
		ingressos.add(new Ingresso());
		ingressos.get(i).setFilme(filme);
		if(tipo == 1)
			ingressos.get(i).setTipo("meia");
		if(tipo == 2)
			ingressos.get(i).setTipo("inteira");
>>>>>>> kina
	}

}
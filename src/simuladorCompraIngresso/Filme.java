package simuladorCompraIngresso;

import java.util.ArrayList;
import java.util.List;

public class Filme {
	
	private String nomeFilme;
	private List<Sessao> sessoes = new ArrayList<Sessao>();
	
	public void setFilme(String f) {
		nomeFilme = f;
	}
	
	public String getFilme() {
		return this.nomeFilme;
	}
	
	public List<Sessao> getSessoes(){
		return this.sessoes;
	}
	
	
}
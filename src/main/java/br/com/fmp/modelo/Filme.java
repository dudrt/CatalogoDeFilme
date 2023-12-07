package br.com.fmp.modelo;

public class Filme {

	private String nome;
	private String genero;
	private String capa;
	private Integer ano;
	public Filme(String nome, String genero,String capa, Integer ano) {
		this.nome = nome;
		this.genero = genero;
		this.capa = capa;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public String getGenero() {
		return genero;
	}

	public Integer getAno() {
		return ano;
	}
	public String getCapa() {
		return capa;
	}
	
}

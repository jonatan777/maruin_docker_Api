package com.jonatan777.maruin.fc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;


@Entity
public class Jogador {
    

    @Id
	@GeneratedValue
	(strategy=GenerationType.IDENTITY)
	private Long id;                                     // id
	@NotNull                                            
	private String nome;
	private String imagen;           
	private String posicao;
	private int jogos;
	private int vitorias;
    private int derrotas;
	private int empates;
    private int expulsao;	
	private int pontos;		
	private int gols;
	private int gols_sofridos;
	


	
	
	public Jogador(){}





	public Jogador(Long id, String nome, String imagen, String posicao, int jogos, int vitorias, int derrotas, int empates, int pontos, int expulsao, int gols, int gols_sofridos) {
		    this.id = id;
		    this.nome = nome;
		    this.imagen = imagen;
		    this.posicao = posicao;
		    this.jogos = jogos;
		    this.vitorias = vitorias;
            this.derrotas = derrotas;
		    this.empates = empates;
		    this.expulsao = expulsao;
		    this.pontos = pontos;
		    this.gols = gols;
		    this.gols_sofridos = gols_sofridos;
		}
	
	
	


   @Override
	public String toString() {
		return String.format(
				"Jogadores[id=%d, nome='%s', imagen='%s', posicao='%s', jogos='%d', vitorias='%d', derrotas='%d' empates='%d', expulsao='%d', pontos='%d', gols='%d', gols_sofridos='%d']",
				id,  nome, imagen, posicao, jogos, vitorias, derrotas, empates, expulsao, pontos, gols, gols_sofridos);
	}
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
	
	public int getJogos() {
		return jogos;
	}
	public void setJogos(int jogos) {
		this.jogos = jogos;
	}
	
	
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	
	
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	
	
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	

	
	public int getExpulsao() {
		return expulsao;
	}
	
	public void setExpulsao(int expulsao) {
		this.expulsao = expulsao;
	}


		
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	
	
	
	public int getGols() {
		return gols;
	}
	public void setGols(int gols) {
		this.gols = gols;
	}



	public int getGols_sofridos() {
		return gols_sofridos;
	}



	public void setGols_sofridos(int gols_sofridos) {
		this.gols_sofridos = gols_sofridos;
	}



   public Jogador transformaParaObjeto() {
      return null;
   }





@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((nome == null) ? 0 : nome.hashCode());
	result = prime * result + ((imagen == null) ? 0 : imagen.hashCode());
	result = prime * result + ((posicao == null) ? 0 : posicao.hashCode());
	result = prime * result + jogos;
	result = prime * result + vitorias;
	result = prime * result + derrotas;
	result = prime * result + empates;
	result = prime * result + expulsao;
	result = prime * result + pontos;
	result = prime * result + gols;
	result = prime * result + gols_sofridos;
	return result;
}





@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Jogador other = (Jogador) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (nome == null) {
		if (other.nome != null)
			return false;
	} else if (!nome.equals(other.nome))
		return false;
	if (imagen == null) {
		if (other.imagen != null)
			return false;
	} else if (!imagen.equals(other.imagen))
		return false;
	if (posicao == null) {
		if (other.posicao != null)
			return false;
	} else if (!posicao.equals(other.posicao))
		return false;
	if (jogos != other.jogos)
		return false;
	if (vitorias != other.vitorias)
		return false;
	if (derrotas != other.derrotas)
		return false;
	if (empates != other.empates)
		return false;
	if (expulsao != other.expulsao)
		return false;
	if (pontos != other.pontos)
		return false;
	if (gols != other.gols)
		return false;
	if (gols_sofridos != other.gols_sofridos)
		return false;
	return true;
}







   	


}

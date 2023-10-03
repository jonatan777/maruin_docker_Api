package com.jonatan777.maruin.fc.dto;





import com.jonatan777.maruin.fc.model.Jogador;



public class JogadorRespostaDTO {
	
	private String nome;
	private String imagen;
	private String posicao;
	private int jogos;
	private int vitorias;
	private int empates;
	private int derrotas;
	private int expulsao;
	private int gols;
	private int pontos;	



	public JogadorRespostaDTO(){}
    
 


	public static JogadorRespostaDTO transformaEmDTO(Jogador jogadores) {
        return new JogadorRespostaDTO(

			
			jogadores.getNome(),
			jogadores.getImagen(),
			jogadores.getPosicao(),
			jogadores.getJogos(),
			jogadores.getVitorias(),
			jogadores.getEmpates(),
			jogadores.getDerrotas(),
			jogadores.getExpulsao(),
			jogadores.getGols(),
			jogadores.getPontos()
			);

    }

	

	public JogadorRespostaDTO(
	
	        String nome,
			String imagen, 
			String posicao, 		
			int jogos, 
			int vitorias,
			int derrotas, 
			int empates, 
			int expulsao, 
			int gols, 
			int pontos
		
		) {
		
			this.nome = nome;
			this.posicao = posicao;
			this.imagen = imagen;
			this.jogos = jogos;
			this.vitorias = vitorias;
			this.empates = empates;
			this.derrotas = derrotas;
			this.expulsao = expulsao;
			this.gols = gols;
			this.pontos = pontos;
			
	}




	public String getNome() {
		return nome;
	}




	public String getImagen() {
		return imagen;
	}




	public String getPosicao() {
		return posicao;
	}




	public int getJogos() {
		return jogos;
	}




	public int getVitorias() {
		return vitorias;
	}




	public int getDerrotas() {
		return derrotas;
	}




	public int getEmpates() {
		return empates;
	}




	public int getExpulsao() {
		return expulsao;
	}






	public int getGols() {
		return gols;
	}


	public int getPontos() {
		return pontos;
	}




}
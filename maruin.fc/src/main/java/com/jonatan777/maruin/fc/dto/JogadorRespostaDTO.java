package com.jonatan777.maruin.fc.dto;





import com.jonatan777.maruin.fc.model.Jogador;



public class JogadorRespostaDTO {
	
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



	public JogadorRespostaDTO(){}
    
 


	public static JogadorRespostaDTO transformaEmDTO(Jogador jogadores) {
        return new JogadorRespostaDTO(

			
			jogadores.getNome(),
			jogadores.getImagen(),
			jogadores.getPosicao(),
			jogadores.getJogos(),
			jogadores.getVitorias(),
			jogadores.getDerrotas(),
			jogadores.getEmpates(),
			jogadores.getExpulsao(),
			jogadores.getPontos(),
			jogadores.getGols()
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
			int pontos, 
			int gols
		
		) {
		
			this.nome = nome;
			this.posicao = posicao;
			this.imagen = imagen;
			this.jogos = jogos;
			this.vitorias = vitorias;
			this.derrotas = derrotas;
			this.empates = empates;
			this.expulsao = expulsao;
			this.pontos = pontos;
			this.gols = gols;
			
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




	public int getPontos() {
		return pontos;
	}




	public int getGols() {
		return gols;
	}


}
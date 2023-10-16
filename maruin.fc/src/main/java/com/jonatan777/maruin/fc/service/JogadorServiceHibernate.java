package com.jonatan777.maruin.fc.service;

import com.jonatan777.maruin.fc.model.Jogador;
import com.jonatan777.maruin.fc.repository.JogadorRepositoryHibernate;
import org.springframework.stereotype.Service;
import java.util.List;





@Service
public class JogadorServiceHibernate {



 private JogadorRepositoryHibernate jogadorRepositoryHibernate;

    public JogadorServiceHibernate(JogadorRepositoryHibernate jogadorRepositoryHibernate) {
        this.jogadorRepositoryHibernate = jogadorRepositoryHibernate;
    }

	// lista quem tem mais pontos
    public List<Jogador> listPontos() {
       return jogadorRepositoryHibernate.findAllPontos();
    }

     // lista quem tem mais gols
    public List<Jogador> listGols() {
      return jogadorRepositoryHibernate.findAllGols();
    }

    public List<Jogador> listNomes() {
      return jogadorRepositoryHibernate.findAllNomes();
    }

     // buscar um jogador no banco referente ao id
    public Jogador getJogadorId(Long id) {
      return jogadorRepositoryHibernate.findById(id);
    }

     // salvar um jogador no banco
    public Jogador salvar(Jogador jogador) {
      return jogadorRepositoryHibernate.save(jogador);
    }


    // esse metodo muda os dados de um jogador (o metodo mais usado nesse sistema)
   public Jogador updateJogador(Jogador jogador, Long id) {
     return jogadorRepositoryHibernate.update(jogador, id);
   }


}

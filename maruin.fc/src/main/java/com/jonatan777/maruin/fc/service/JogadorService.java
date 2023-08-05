package com.jonatan777.maruin.fc.service;

import com.jonatan777.maruin.fc.model.Jogador;
import com.jonatan777.maruin.fc.repository.JogadorRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JogadorService {

  private JogadorRepository jogadorRepository2;

  public JogadorService(JogadorRepository jogadorRepository2) {
    this.jogadorRepository2 = jogadorRepository2;
  }

  // lista todos
  public List<Jogador> listAllJogadores() {
    return jogadorRepository2.findAll();
  }

  // buscar um jogador no banco referente ao id ou retorna um notFound

  public Jogador getJogadorId(Long id) {
    return jogadorRepository2.getReferenceById(id);
  }

  public Jogador AddJogador(Jogador jogador) {

    return jogadorRepository2.save(jogador);
  }


}

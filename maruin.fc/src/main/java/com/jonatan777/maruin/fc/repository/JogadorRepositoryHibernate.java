package com.jonatan777.maruin.fc.repository;

import java.util.List;

import com.jonatan777.maruin.fc.model.Jogador;
import org.springframework.stereotype.Repository;
import lombok.NonNull;

@Repository
public interface JogadorRepositoryHibernate {

    Jogador save(@NonNull Jogador jogador);

    Jogador update(@NonNull Jogador Jogador, Long id);

    List<Jogador> findAllPontos();

    List<Jogador> findAllGols();

    Jogador findById(@NonNull Long id);
    

}

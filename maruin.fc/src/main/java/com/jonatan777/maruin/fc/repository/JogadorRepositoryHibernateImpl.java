package com.jonatan777.maruin.fc.repository;






import com.jonatan777.maruin.fc.model.Jogador;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public class JogadorRepositoryHibernateImpl implements JogadorRepositoryHibernate{
    


    @PersistenceContext
    private EntityManager entityManager;


    public JogadorRepositoryHibernateImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    

    @Override
    @Transactional
    public Jogador save(Jogador jogador) {
        entityManager.persist(jogador);
        return jogador;
    }

    @Override
    @Transactional
    public Jogador update(@lombok.NonNull Jogador jogador, Long id) {

       jogador = entityManager.find(Jogador.class, id);
        
        return entityManager.merge(jogador);
    }

    @Override
    @Transactional
    public List<Jogador> findAllPontos() {
        String qlString = "SELECT e FROM Jogador e WHERE e.pontos != 0 ORDER BY e.pontos DESC ";
        TypedQuery<Jogador> query = entityManager.createQuery(qlString, Jogador.class);
        return query.getResultList();
    }


    @Override
    @Transactional
    public List<Jogador> findAllGols() {
        String qlString = "SELECT e FROM Jogador e WHERE e.gols != 0 ORDER BY e.gols DESC";
        TypedQuery<Jogador> query = entityManager.createQuery(qlString, Jogador.class);
        return query.getResultList();
    }

     @Override
    @Transactional
    public List<Jogador> findAllNomes() {
        String qlString = "SELECT e FROM Jogador e WHERE e.nome != 0 ORDER BY e.nome DESC ";
        TypedQuery<Jogador> query = entityManager.createQuery(qlString, Jogador.class);
        return query.getResultList();
    }

    @Override
    public Jogador findById(Long id) {
        return entityManager.find(Jogador.class, id);
    }

}

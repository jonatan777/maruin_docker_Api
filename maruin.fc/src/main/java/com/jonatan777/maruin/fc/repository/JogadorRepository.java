package com.jonatan777.maruin.fc.repository;




import com.jonatan777.maruin.fc.model.Jogador;

import org.springframework.data.jpa.repository.JpaRepository;  
import org.springframework.stereotype.Repository;



@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Long>{

    

}
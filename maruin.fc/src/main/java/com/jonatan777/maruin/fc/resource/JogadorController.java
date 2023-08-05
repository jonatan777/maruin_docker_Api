package com.jonatan777.maruin.fc.resource;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jonatan777.maruin.fc.service.JogadorService;

import lombok.val;

import com.jonatan777.maruin.fc.dto.JogadorDTO;
import com.jonatan777.maruin.fc.dto.JogadorRespostaDTO;
import com.jonatan777.maruin.fc.model.Jogador;
import com.jonatan777.maruin.fc.repository.JogadorRepository;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    @Autowired
    private JogadorService jogadorService;

    @Autowired
    private JogadorRepository jogadorRepository;

    JogadorController(JogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }

    // buscar todos registros no banco (pelada) e Tabela (jogadores)
    @GetMapping
    public List<Jogador> findAll() {
        return jogadorService.listAllJogadores();
    }

    @GetMapping(path = {"/{id}"})
public ResponseEntity<Jogador> findById(@PathVariable long id){
   return jogadorRepository.findById(id)
           .map(record -> ResponseEntity.ok().body(record))
           .orElse(ResponseEntity.notFound().build());
}

    // salvar registro no banco Atravez do DTO
    @PostMapping
    public ResponseEntity<JogadorRespostaDTO> salvar(@RequestBody @val JogadorDTO dto) {
        Jogador jogador = dto.transformaParaObjeto(dto);
        jogadorService.AddJogador(jogador);
        return new ResponseEntity<>(JogadorRespostaDTO.transformaEmDTO(jogador), HttpStatus.CREATED);
    }


    // atualizar um registro da tabela(jogadores)
    @PutMapping(value="/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody Jogador jogadores)  {

        return jogadorRepository.findById(id)
            .map(record -> {
              record.setNome(jogadores.getNome());
              record.setImagen(jogadores.getImagen());
              record.setPosicao(jogadores.getPosicao());
              record.setJogos(jogadores.getJogos());
              record.setVitorias(jogadores.getVitorias());
              record.setEmpates(jogadores.getEmpates());
              record.setDerrotas(jogadores.getDerrotas());
              record.setPontos(jogadores.getPontos());
              record.setExpulsao(jogadores.getExpulsao());
              record.setGols(jogadores.getGols());
              record.setGols_sofridos(jogadores.getGols_sofridos());
    
              Jogador updated = jogadorRepository.save(record);
              return ResponseEntity.ok().body(updated);
            }).orElse(ResponseEntity.notFound().build());
      }

    // deletando registro da tabela(jogadores)
    @DeleteMapping(path ={"/{id}"})
     public ResponseEntity <?> delete(@PathVariable long id) {
   return jogadorRepository.findById(id)
           .map(record -> {
            jogadorRepository.deleteById(id);
               return ResponseEntity.ok().build();
           }).orElse(ResponseEntity.notFound().build());
}

   

}
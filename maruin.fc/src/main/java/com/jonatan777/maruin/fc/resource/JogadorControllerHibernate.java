package com.jonatan777.maruin.fc.resource;

import java.util.List;

import com.jonatan777.maruin.fc.dto.JogadorDTO;
import com.jonatan777.maruin.fc.dto.JogadorRespostaDTO;
import com.jonatan777.maruin.fc.exceptions.IdExeption;
import com.jonatan777.maruin.fc.model.Jogador;
import com.jonatan777.maruin.fc.service.JogadorServiceHibernate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jogadores_hibernate")
public class JogadorControllerHibernate {

	private JogadorServiceHibernate jogadorServiceHibernate;

	public JogadorControllerHibernate(JogadorServiceHibernate jogadorServiceHibernate) {
		this.jogadorServiceHibernate = jogadorServiceHibernate;
	}





	// buscar todos registros com pontos > 0
	@GetMapping(path = { "/pontos" })
	public List<Jogador> findPontos() {
		return jogadorServiceHibernate.listPontos();
	}

	// buscar todos registros com gols > 0
	@GetMapping(path = { "/gols" })
	public List<Jogador> findGolss() {
		return jogadorServiceHibernate.listGols();
	}




    // buscar registro por ID
	@GetMapping(path = { "/{id}" })
    public ResponseEntity<Jogador> getJogadorById(@PathVariable("id") Long id) throws NullPointerException, IdExeption  {

		try {
			Jogador jogador = jogadorServiceHibernate.getJogadorId(id);
			if (jogador == null) {
				return new ResponseEntity<>( HttpStatus.NOT_FOUND);

			} else {
				return new ResponseEntity<>(jogador, HttpStatus.OK);

			}

		} catch (NullPointerException e) {
			throw new IdExeption();
		}

	}







	// salva um registro no banco com DTO
	@PostMapping
	public ResponseEntity<JogadorRespostaDTO> salvar(@RequestBody JogadorDTO dto) {
		Jogador jogador2 = dto.transformaParaObjeto(dto);
		jogadorServiceHibernate.salvar(jogador2);
		return new ResponseEntity<>(JogadorRespostaDTO.transformaEmDTO(jogador2), HttpStatus.CREATED);
	}




	

}

package expertostech.tutorial.rest.api.controler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import expertostech.tutorial.rest.api.model.UsuarioModel;
import expertostech.tutorial.rest.api.repository.UsuarioRepositorry;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioRepositorry repository;
	
	@GetMapping(path = "/api/usuario/{codigo}")
	public ResponseEntity consultar(@PathVariable("codigo") Integer codigo) {
	return repository.findById(codigo)
			.map(record -> ResponseEntity.ok().body(record))
			.orElse(ResponseEntity.notFound().build());
		}
	
	@PostMapping(path = "/api/usuario/salvar")
	public  UsuarioModel salvar(@RequestBody UsuarioModel usuario) {
		return repository.save(usuario);
	}

}

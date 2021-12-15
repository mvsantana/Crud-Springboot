package expertostech.tutorial.rest.api.repository;

import org.springframework.data.repository.CrudRepository;
import expertostech.tutorial.rest.api.model.UsuarioModel;

public interface UsuarioRepositorry extends CrudRepository<UsuarioModel, Integer> {

}

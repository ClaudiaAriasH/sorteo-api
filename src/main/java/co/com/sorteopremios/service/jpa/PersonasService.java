package co.com.sorteopremios.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.sorteopremios.entity.Persona;
import co.com.sorteopremios.repository.PersonaPremioRepository;
import co.com.sorteopremios.repository.PersonaRepository;
import co.com.sorteopremios.service.IPersonasService;

@Service
public class PersonasService implements IPersonasService {

    @Autowired
    private PersonaRepository repoPersonas;

    @Autowired
    private PersonaPremioRepository repoPersonaPremio;

    @Override
    public List<Persona> buscarTodos() {
        return repoPersonas.findAll();
    }

    @Override
    public void guardar(Persona persona) {
        repoPersonas.save(persona);
    }

    @Override
    public String eliminar(int idPersona) {
        String mensaje = "Registro eliminado correctamente";
        long tienePremios = repoPersonaPremio.countByIdPersona(idPersona);
        if(tienePremios > 0) {
            mensaje = "La persona posee premios asociados y no puede ser borrada";
        } else {
            repoPersonas.deleteById(idPersona);
        }
        return mensaje;
    }

    @Override
    public Persona buscarPorId(int idPersona) {
        return repoPersonas.findById(idPersona).get();
    }

}

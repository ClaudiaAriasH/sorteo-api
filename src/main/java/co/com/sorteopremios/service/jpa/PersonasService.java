package co.com.sorteopremios.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.sorteopremios.entity.Persona;
import co.com.sorteopremios.repository.PersonaRepository;
import co.com.sorteopremios.service.IPersonasService;

@Service
public class PersonasService implements IPersonasService {

    @Autowired
    private PersonaRepository repoPersonas;

    @Override
    public List<Persona> buscarTodos() {
        return repoPersonas.findAll();
    }

    @Override
    public void guardar(Persona persona) {
        repoPersonas.save(persona);
    }

    @Override
    public void eliminar(int idPersona) {
        repoPersonas.deleteById(idPersona);
    }

    @Override
    public Persona buscarPorId(int idPersona) {
        Optional<Persona> persona = repoPersonas.findById(idPersona);
//        if (persona.isPresent()) {
//            
//        }
        return persona.get();
    }

}

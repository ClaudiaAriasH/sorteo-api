package co.com.sorteopremios.service;

import java.util.List;
import co.com.sorteopremios.entity.Persona;

public interface IPersonasService {

    List<Persona> buscarTodos();
    
    Persona buscarPorId(int idPersona);

    void guardar(Persona persona);

    void eliminar(int idPersona);

}

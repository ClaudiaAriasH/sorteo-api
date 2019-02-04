package co.com.sorteopremios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.sorteopremios.entity.Persona;
import co.com.sorteopremios.service.IPersonasService;

@RestController
@RequestMapping("/api/personas")
public class PersonasController {

    @Autowired
    private IPersonasService servicePersonas;

    @RequestMapping(method = RequestMethod.GET)
    public List<Persona> buscarTodos() {
        return servicePersonas.buscarTodos();
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Persona buscarPorId(@PathVariable("id") int idPersona) {
        return servicePersonas.buscarPorId(idPersona);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Persona guardar(@RequestBody Persona persona) {
        servicePersonas.guardar(persona);
        return persona;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Persona modificar(@RequestBody  Persona persona) {
        servicePersonas.guardar(persona);
        return persona;
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String eliminar(@PathVariable("id") int idPersona) {
        servicePersonas.eliminar(idPersona);
        return "Registro Eliminado";
    }

    
//     @DeleteMapping("/albums/{id}")
//     public String eliminar(@PathVariable("id") int idPersona) {
//     servicePersonas.eliminar(idPersona);
//     return "Registro Eliminado";
//     }

}

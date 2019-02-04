package co.com.sorteopremios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.sorteopremios.entity.Premio;
import co.com.sorteopremios.service.IPremiosService;

@RestController
@RequestMapping("/api/premios")
public class PremiosController {

    @Autowired
    private IPremiosService servicePremios;

    @RequestMapping(method = RequestMethod.GET)
    public List<Premio> buscarTodos() {
        return servicePremios.buscarTodos();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Premio guardar(@RequestBody Premio premio) {
        servicePremios.guardar(premio);
        return premio;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Premio modificar(@RequestBody Premio premio) {
        servicePremios.guardar(premio);
        return premio;
    }

    //
    // @DeleteMapping("/albums/{id}")
    // public String eliminar(@PathVariable("id") int idAlbum) {
    // serviceAlbums.eliminar(idAlbum);
    // return "Registro Eliminado";
    // }

}

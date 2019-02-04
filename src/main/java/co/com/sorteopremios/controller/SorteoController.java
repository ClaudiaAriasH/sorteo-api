package co.com.sorteopremios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.sorteopremios.dto.Ganadores;
import co.com.sorteopremios.service.IGanadoresService;

@RestController
@RequestMapping("/api/sorteo")
public class SorteoController {

    @Autowired
    private IGanadoresService serviceGanadores;

    @RequestMapping(method = RequestMethod.GET)
    public List<Ganadores> sortear() {
        return serviceGanadores.sortearGanadores();
    }
}

package co.com.sorteopremios.service.jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.sorteopremios.dto.Ganadores;
import co.com.sorteopremios.entity.Persona;
import co.com.sorteopremios.entity.Premio;
import co.com.sorteopremios.service.IGanadoresService;

@Service
public class GanadoresService implements IGanadoresService {

    private static final int CERO = 0;

    @Autowired
    private PersonasService servPersona;

    @Autowired
    private PremiosService servPremio;

    // @Autowired
    // private PremioPersonaRepository premioPersonaRepository;

    @Override
    public List<Ganadores> sortearGanadores() {

        List<Premio> premios = servPremio.buscarPremiosCantidadMayorA(CERO);
        List<Persona> personas = servPersona.buscarTodos();
        List<Ganadores> ganadores = new ArrayList<>();

        for (Persona persona : personas) {
            if (persona.getPremios().isEmpty()) {
                Premio premio = obtenerPremio(premios);
                if (premio != null) {
                    Ganadores ganador = new Ganadores();
                    ganador.setNombre(persona.getNombres() + " " + persona.getApellidos());
                    ganador.setPremio(premio.getDescripcion());
                    ganadores.add(ganador);
                    persona.getPremios().add(premio);
                    servPersona.guardar(persona);
                } else {
                    break;
                }
            }
        }
        return ganadores;
    }

    private Premio obtenerPremio(List<Premio> premios) {
        List<Premio> premiosDisponibles = premios.stream().filter(premio -> premio.getCantidad() > CERO)
                .collect(Collectors.toList());

        Premio premio = null;
        if (premiosDisponibles != null && !premiosDisponibles.isEmpty()) {
            int randomNum = ThreadLocalRandom.current().nextInt(CERO, premiosDisponibles.size());
            premio = premios.get(randomNum);
            int cantidadActual = premio.getCantidad();
            premio.setCantidad(cantidadActual - 1);
            // servPremio.actualizar(premio);
        }
        return premio;
    }

}

package co.com.sorteopremios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.sorteopremios.entity.Persona;

public interface  PersonaRepository extends JpaRepository<Persona, Integer> {

}

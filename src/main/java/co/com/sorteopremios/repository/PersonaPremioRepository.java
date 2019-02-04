package co.com.sorteopremios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.sorteopremios.entity.PersonaPremio;

public interface  PersonaPremioRepository extends JpaRepository<PersonaPremio, Integer> {

}

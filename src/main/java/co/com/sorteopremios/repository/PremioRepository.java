package co.com.sorteopremios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.sorteopremios.entity.Premio;

public interface PremioRepository extends JpaRepository<Premio, Integer> {

    List<Premio> findByCantidadGreaterThan(int cantidad);

}

package co.ucentral.Quiz1.persistencia.repositorios;

import co.ucentral.Quiz1.persistencia.entidades.universidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface universidadRepositorio extends JpaRepository<universidad, Long> {
}

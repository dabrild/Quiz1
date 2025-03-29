package co.ucentral.Quiz1.servicios;

import co.ucentral.Quiz1.persistencia.entidades.universidad;
import co.ucentral.Quiz1.persistencia.repositorios.universidadRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversidadServicio {
    universidadRepositorio universidadrepositorio;
        public List<universidad> obtenerUnis() {
            return universidadrepositorio.findAll();
            }
}

package co.ucentral.Quiz1.controladores;

import co.ucentral.Quiz1.persistencia.entidades.universidad;
import co.ucentral.Quiz1.servicios.UniversidadServicio;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/universidades")
@CrossOrigin(origins = "*")
public class univerisidadControlador {
    UniversidadServicio univerisidadservicio;

     @GetMapping("/")
        public List<universidad> obtenerUnis(){
            return univerisidadservicio.obtenerUnis();
        }
}

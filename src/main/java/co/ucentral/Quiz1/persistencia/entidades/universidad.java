package co.ucentral.Quiz1.persistencia.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Universidades")

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class universidad {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(unique = true)
    private String nombre;
    private String nombreMascota;
    private String ciudadUbicacion;
    private String barrioUbicacion;
    private String correo;
    private LocalDateTime fechaFundacion;

}

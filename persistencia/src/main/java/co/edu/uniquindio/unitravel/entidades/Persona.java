package co.edu.uniquindio.unitravel.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Persona implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @Column(length = 10)
    private String cedula;

    @Column(length = 200, nullable = false)
    private String nombre;

}

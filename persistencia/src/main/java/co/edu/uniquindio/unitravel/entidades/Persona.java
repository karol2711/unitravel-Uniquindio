package co.edu.uniquindio.unitravel.entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@MappedSuperclass
@ToString

public class Persona implements Serializable {

    @Id
    @Column(length = 12)
    @EqualsAndHashCode.Include
    private String cedula;

    @Column(length = 25,nullable = false)
    private String nombre;

    @Column(length = 50,nullable = false,unique = true)
    @Email
    private String email;

    @Column(length = 25,nullable = true)
    private String password;

}
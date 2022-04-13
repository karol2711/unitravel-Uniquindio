package co.edu.uniquindio.unitravel.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Autor extends Persona implements Serializable {

    @Positive
    @Column(nullable = false)
    private int anioNacimiento;

    @ManyToMany(mappedBy = "autores")
    private List<Libro> libros;
}

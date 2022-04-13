package co.edu.uniquindio.unitravel.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import java.io.Serializable;
import java.util.List;


@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Libro implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @Column(length = 13)
    private String isbn;

    @Column(nullable = false, length = 200)
    private String nombre;

    @PositiveOrZero
    @Column(nullable = false)
    private int unidades;

    @Max(9999)
    @Column(nullable = false)
    private short anio;

    public Libro(String isbn, String nombre, int unidades, short anio) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.unidades = unidades;
        this.anio = anio;
    }

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Genero genero;

    @ManyToMany(mappedBy = "libros")
    private List<Prestamo> prestamos;

    @ManyToMany
    private List<Autor> autores;

}

package co.edu.uniquindio.unitravel.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

public class Caracteristicas implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    @Column(nullable = false,length = 100)
    private String nombre;

    public Caracteristicas(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
}
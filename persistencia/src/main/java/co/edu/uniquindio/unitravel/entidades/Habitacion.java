package co.edu.uniquindio.unitravel.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

public class Habitacion implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String numero;

    @Column(nullable = false)
    private Float precio;

    @Column(nullable = false)
    private Integer capacidad;

    public Habitacion(String numero, Float precio, Integer capacidad) {
        this.numero = numero;
        this.precio = precio;
        this.capacidad = capacidad;
    }

    @ManyToOne
    private Hotel hotel;

    @OneToMany(mappedBy = "habitacion")
    private List<ReservaHabitacion> reservaHabitaciones;

    @OneToMany(mappedBy = "habitacion")
    private List<Foto> fotos;

}
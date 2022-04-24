package co.edu.uniquindio.unitravel.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

public class ReservaHabitacion implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    @Column(nullable = false)
    private Float precio;

    public ReservaHabitacion(String codigo, Float precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    @ManyToOne
    private Habitacion habitacion;

    @ManyToOne
    private Reserva reserva;
}
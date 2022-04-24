package co.edu.uniquindio.unitravel.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

public class ReservaSilla implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column(nullable = false)
    private Float precio;

    public ReservaSilla(Integer codigo, Float precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    @ManyToOne
    private Reserva reserva;

    @ManyToOne
    private Silla silla;
}
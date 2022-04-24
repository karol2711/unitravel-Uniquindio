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

public class ReservaPaqueteTuristico implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    @Column(nullable = false)
    private Float precio;

    @ManyToOne
    private PaqueteTuristico paqueteTuristico;

    @ManyToOne
    private Reserva reserva;

}
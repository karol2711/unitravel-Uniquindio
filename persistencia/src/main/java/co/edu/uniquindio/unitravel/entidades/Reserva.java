package co.edu.uniquindio.unitravel.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

public class Reserva implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    @Column(nullable = false,length = 100)
    private LocalDateTime fechaReserva;

    @Column(nullable = false,length = 100)
    private LocalDateTime fechaInicio;

    @Column(nullable = false,length = 100)
    private LocalDateTime fechaFin;

    @Column(nullable = false)
    private Float precioTotal;

    @Column(nullable = false,length = 100)
    private String estado;

    @Column(nullable = false)
    private Integer cantidadPersonas;

    public Reserva(String codigo, LocalDateTime fechaReserva, LocalDateTime fechaInicio, LocalDateTime fechaFin, Float precioTotal, String estado, Integer cantidadPersonas) {
        this.codigo = codigo;
        this.fechaReserva = fechaReserva;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioTotal = precioTotal;
        this.estado = estado;
        this.cantidadPersonas = cantidadPersonas;
    }

    @ManyToOne
    private Cliente cliente;

    @OneToMany(mappedBy = "reserva")
    private List<ReservaHabitacion> reservasHabitaciones;

    @OneToMany(mappedBy = "reserva")
    private List<ReservaPaqueteTuristico> reservasPaquetesTuristicos;

    @OneToMany(mappedBy = "reserva")
    private List<ReservaSilla> reservasSillas;
}
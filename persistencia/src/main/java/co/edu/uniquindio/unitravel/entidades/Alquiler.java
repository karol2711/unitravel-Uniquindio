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
@Setter
@Getter
@NoArgsConstructor
@EqualsAndHashCode

public class Alquiler implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    @Column(nullable = false,length = 100)
    private LocalDateTime fechaReserva;

    @Column(nullable = false,length = 100)
    private LocalDateTime fechaInicio;

    @Column(nullable = false,length = 100)
    private LocalDateTime fechaFin;

    @Column(nullable = false,length = 100)
    private String precioTotal;

    @Column(nullable = false,length = 100)
    private String estado;

    @Column(nullable = false,length = 100)
    private String tipoVehiculo;

    @Column(nullable = false,length = 100)
    private String placaVehiculo;

    @OneToMany(mappedBy = "alquiler")
    private List<Vehiculo> vehiculos;

    @ManyToOne
    private Cliente cliente;
}
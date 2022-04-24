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

public class PaqueteTuristico implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    @Column(nullable = false,length = 100)
    private String nombre;

    @Column(nullable = false,length = 100)
    private String sitiosTuristicos;

    @Column(nullable = false)
    private Float precio;

    @Column(nullable = false)
    private Integer numeroPersonas;

    @ManyToOne
    private Hotel hotel;

    @OneToMany(mappedBy = "paqueteTuristico")
    private List<ReservaPaqueteTuristico> reservaPaquetesTuristicos;

}
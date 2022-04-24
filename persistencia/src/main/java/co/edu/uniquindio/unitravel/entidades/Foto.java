package co.edu.uniquindio.unitravel.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

public class Foto {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    @Column(nullable = false,length = 100)
    private String url;

    @ManyToOne
    private Hotel hotel;

    @ManyToOne
    private Habitacion habitacion;
}
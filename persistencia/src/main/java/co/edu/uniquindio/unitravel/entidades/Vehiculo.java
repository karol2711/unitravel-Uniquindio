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
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@NoArgsConstructor
@EqualsAndHashCode

public class Vehiculo implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String placa;

    @Column(nullable = false,length = 100)
    private String tipo;

    @Column(nullable = false,length = 100)
    private String estado;

    @Column(nullable = false,length = 100)
    private String descrpcion;

    @ManyToOne
    private Ciudad ciudad;

    @ManyToOne
    private Alquiler alquiler;

}
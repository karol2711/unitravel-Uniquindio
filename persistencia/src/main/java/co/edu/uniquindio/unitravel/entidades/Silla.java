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

public class Silla implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    @Column(nullable = false,length = 100)
    private String posicion;

    @Column(nullable = false)
    private Float precio;

    public Silla(String codigo, String posicion, Float precio) {
        this.codigo = codigo;
        this.posicion = posicion;
        this.precio = precio;
    }

    @OneToMany(mappedBy = "silla")
    private List<ReservaSilla> sillas;

    @ManyToOne
    private Vuelo vuelo;


}
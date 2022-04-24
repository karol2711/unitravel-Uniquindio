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

public class Hotel implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    @Column(nullable = false,length = 100)
    private String nombre;

    @Column(nullable = false,length = 100)
    private String direccion;

    @Column(nullable = false,length = 100)
    private String telefono;

    @Column(nullable = false)
    private Integer numeroEstrellas;

    public Hotel(String codigo, String nombre, String direccion, String telefono, Integer numeroEstrellas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.numeroEstrellas = numeroEstrellas;
    }

    @ManyToOne
    private AdministradorHotel administradorHotel;

    @ManyToOne
    private Ciudad ciudad;

    @OneToMany(mappedBy = "hotel")
    private List<Comentario> comentarios;

    @OneToMany(mappedBy = "hotel")
    private List<Habitacion> habitaciones;

    @OneToMany(mappedBy = "hotel")
    private List<Foto> fotos;

    @OneToMany(mappedBy = "hotel")
    private List<PaqueteTuristico> paquetesTuristicos;
}
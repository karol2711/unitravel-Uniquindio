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
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

public class Comentario implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    @Column(nullable = false,length = 100)
    private String comentario;

    @Column(nullable = false,length = 100)
    private String calificacion;

    @Column(nullable = false,length = 100)
    private LocalDateTime fechaCalificacion;

    public Comentario(String codigo, String comentario, String calificacion, LocalDateTime fechaCalificacion) {
        this.codigo = codigo;
        this.comentario = comentario;
        this.calificacion = calificacion;
        this.fechaCalificacion = fechaCalificacion;
    }

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Hotel hotel;
}
package co.edu.uniquindio.unitravel.entidades;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true, onlyExplicitlyIncluded = true)

public class Cliente extends Persona implements Serializable {

    public Cliente(String cedula, String nombre, @Email String email, String password) {
        super(cedula, nombre, email, password);
    }

    @ToString.Include
    @ElementCollection
    private List<String> telefono;

    @OneToMany(mappedBy = "cliente")
    private List<Comentario> comentarios;

    @OneToMany(mappedBy = "cliente")
    private List<Reserva> reservas;

    @ManyToOne
    private Ciudad ciudad;

    @OneToMany(mappedBy = "cliente")
    private List<Alquiler> alquileres;
}
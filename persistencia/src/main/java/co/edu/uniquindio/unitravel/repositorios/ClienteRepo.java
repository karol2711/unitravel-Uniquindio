package co.edu.uniquindio.unitravel.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.edu.uniquindio.unitravel.entidades.Cliente;

@Repository
public interface UsuarioRepo extends JpaRepository<Cliente, String> {


}

package co.edu.uniquindio.unitravel;

import co.edu.uniquindio.unitravel.entidades.Cliente;
import co.edu.uniquindio.unitravel.repositorios.UsuarioRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.AutoConfigureDataJdbc;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;
import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase( replace = AutoConfigureTestDatabase.Replace.NONE)

public class UsuarioTest {

    @Autowired
    private UsuarioRepo usuarioRepo;

    @Test
    public void registrar(){

        Cliente cliente = new Cliente("123456789","Manuel","manuel@gmail.com","1234");
        Cliente clienteGuardado = usuarioRepo.save(cliente);

        Assertions.assertNotNull(clienteGuardado);
    }
    @Test
    public void eliminar() {

        Cliente cliente = new Cliente("123456789","Manuel","manuel@gmail.com","1234");
        Cliente clienteGuardado = usuarioRepo.save(cliente);

        usuarioRepo.delete(clienteGuardado);

        Cliente clienteBuscado = usuarioRepo.findById("123456789").orElse(null);
        Assertions.assertNull(clienteBuscado);
    }

    @Test
    public void actualizarUsuarioTest(){

        Cliente cliente = new Cliente("123456789","Manuel","manuel@gmail.com","1234");
        Cliente clienteGuardado = usuarioRepo.save(cliente);
        clienteGuardado.setPassword("5678");

        usuarioRepo.save(clienteGuardado);

        Cliente clienteBuscado = usuarioRepo.findById("123456789").orElse(null);
        Assertions.assertEquals("5678", clienteBuscado.getPassword());
    }
    @Test
    @Sql("classpath:dataset.sql" )
    public void listar() {

        List<Cliente> clientes = usuarioRepo.findAll();
        System.out.println(clientes);
    }

}

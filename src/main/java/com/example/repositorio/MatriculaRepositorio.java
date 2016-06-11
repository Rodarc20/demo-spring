package com.example.repositorio;

/**
 * Created by rodrigo on 11/06/16.
 */
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.example.dominio.Matricula;

public interface MatriculaRepositorio extends CrudRepository<Matricula, Integer>{
    List<Matricula> findAll();
}

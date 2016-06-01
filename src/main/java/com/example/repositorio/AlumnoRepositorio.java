package com.example.repositorio;

/**
 * Created by rodrigo on 20/05/16.
 */
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.example.dominio.Alumno;

public interface AlumnoRepositorio extends CrudRepository <Alumno, Integer>{
    List<Alumno> findAll();
}

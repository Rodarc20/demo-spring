package com.example.dominio;

/**
 * Created by rodrigo on 10/06/16.
 */
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

public class Matricula {
    public Integer id;
    public Integer id_alumno;
    public Integer id_curso;
    public Integer promedio;
}

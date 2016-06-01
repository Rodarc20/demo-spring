package com.example.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * Created by rodrigo on 20/05/16.
 */
@Entity
public class Alumno {
    @Id
    public Integer id;
    public String nombres;
    public String apellidoPaterno;
    public String apellidoMaterno;
    public Integer promedio;

    public Alumno() {
    }

    public Alumno(String nombres, String apellidoPaterno,
                  Integer promedio) {
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.promedio = promedio;
    }
}

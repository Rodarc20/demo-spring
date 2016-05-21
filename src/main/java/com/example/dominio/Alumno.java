package com.example.dominio;

/**
 * Created by rodrigo on 20/05/16.
 */

public class Alumno {
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

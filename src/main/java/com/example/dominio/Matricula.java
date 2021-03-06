package com.example.dominio;

/**
 * Created by rodrigo on 10/06/16.
 */
import javax.persistence.*;
import java.util.Set;

@Entity
public class Matricula {
    @Id
    private Integer id_matricula;
    private Integer id_alumno;
    private Integer promedio;
    @ManyToMany
    @JoinTable(name = "matricula_curso", joinColumns = @JoinColumn(name = "codigo"), inverseJoinColumns = @JoinColumn(name = "id_matricula"))
    private Set<Curso> cursos;//en un solo sentido esta la dependencia // o deberia ponerla en las dos, dejare el codigo comentado

    //deberia tener una funcion que agregue cursos, aun que aun no se como insertar esto
    public Integer getId_matricula(){
        return id_matricula;
    }
    public void setId_matricula(Integer id_matricula){
        this.id_matricula = id_matricula;
    }

    public Set<Curso> getCursos(){
        return cursos;
    }
    public void setCursos(Set<Curso> cursos){
        this.cursos = cursos;
    }


}

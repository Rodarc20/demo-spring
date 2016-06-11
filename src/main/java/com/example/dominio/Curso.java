
/**
 * Created by rodrigo on 10/06/16.
 */
package com.example.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Curso {
	@Id
	private String codigo;
	private String nombre;
    /*
    //de la clase Matricula
    @ManyToMany(mappedBy = "cursos")
    private Set<Matricula> matriculas;

    public Set<Matricula> getMatriculas(){
        return matriculas;
    }
    public void setMatriculas(Set<Matricula> matriculas){
        this.matriculas = matriculas;
    }
    */

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

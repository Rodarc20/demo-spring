package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dominio.Alumno;
import com.example.repositorio.AlumnoRepositorio;

@EnableAutoConfiguration
@Controller
@SpringBootApplication
public class Demo2Application {

    private AlumnoRepositorio repositorio = new AlumnoRepositorio();

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

    @RequestMapping("/alumnos")
    @ResponseBody
    public List<Alumno> alumnos(String ordenarPor) {
        List<Alumno> a = repositorio.listar();
        /* ordenar por ahora solo con nombre, una vez que lo consiga lo ordenare por los otros parametros */

        int ini = 0;
        int fin = a.size() - 1;
        while(fin > ini){
            for (int i = 0; i < fin; i++) {
                if(a.get(i).nombres.compareTo(a.get(i+1).nombres) > 0){ //if(a.get(i).nombres > a.get(i+1).nombres){
                    a.set(i+1, a.set(i, a.get(i + 1)));
                }
            }
            fin--;
        }
        return a;
    }
}

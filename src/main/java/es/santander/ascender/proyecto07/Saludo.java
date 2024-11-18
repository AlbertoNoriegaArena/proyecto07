package es.santander.ascender.proyecto07;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {
    @GetMapping("/bienvenida") 
    public String get( @RequestParam("nombre") String nombre){
        return "Hola " + nombre;
    }

    @GetMapping("/calculadora") // Ruta
    // Al metodo le pasas el nombre de los argumentos con @RequestParam
    public long sumar( @RequestParam("s1") long s1, @RequestParam("s2") long s2){
        return s1+s2;
    }
}

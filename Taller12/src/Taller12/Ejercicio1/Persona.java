package Taller12.Ejercicio1;

public class Persona implements Hablador, Trabajador {
    
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void hablar() {
        System.out.println(nombre + " dice: Hola estoy hablando");
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " esta trabajando");
    }
}

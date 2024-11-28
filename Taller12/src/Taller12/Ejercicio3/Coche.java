package Taller12.Ejercicio3;

interface Hablador {
    void hablar();
}

class Robot implements Hablador {
    @Override
    public void hablar() {
        System.out.println("El robot esta hablando");
    }
}

public class Coche implements Hablador {
    @Override
    public void hablar() {
        System.out.println("El coche no deberia hablar");
    }
}

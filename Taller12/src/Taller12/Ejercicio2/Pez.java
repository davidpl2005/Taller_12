package Taller12.Ejercicio2;

public class Pez implements Nadador, Respirador{
    
    @Override
    public void Nadar(){
        System.out.println("Nadaremos nadaremos en el mar, el mar, el mar.");
    }

    @Override
    public void Respirar(){
        System.out.println("Estoy respirando debajo el agua");
    }
}

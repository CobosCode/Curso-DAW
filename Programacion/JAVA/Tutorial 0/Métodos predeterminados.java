// Crear una interfaz con un método predeterminado
interface Saludar {
    default void saludar() {
        System.out.println("¡Hola, mundo!");
    }
}

// Implementar la interfaz y llamar al método predeterminado
class Saludador implements Saludar {}

Saludador saludador = new Saludador();
saludador.saludar(); // Imprime "¡Hola, mundo!"
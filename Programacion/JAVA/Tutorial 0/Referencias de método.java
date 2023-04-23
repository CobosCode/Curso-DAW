// Crear una clase con un método de instancia
class Ejemplo {
    void imprimir(String texto) {
        System.out.println(texto);
    }
}

// Crear una instancia de la clase y una referencia de método
Ejemplo ejemplo = new Ejemplo();
Consumer<String> imprimirTexto = ejemplo::imprimir;

// Llamar a la referencia de método con el texto "Hola, mundo!"
imprimirTexto.accept("Hola, mundo!"); // Imprime "Hola, mundo!"

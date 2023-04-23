interface Operacion {
    int calcular(int a, int b);
}

public class Lambda {
    public static void main(String[] args) {
        // Crear una expresión lambda que multiplique dos números
        Operacion multiplicar = (a, b) -> a * b;

        // Llamar a la expresión lambda con los valores 4 y 5
        int resultado = multiplicar.calcular(4, 5);

        System.out.println(resultado); // Imprime 20
    }
}
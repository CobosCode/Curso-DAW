// Crear una interfaz Funcion con un método abstracto llamado aplicar
interface Funcion<T, R> {
    R aplicar(T valor);
}

// Crear una función de interfaz que convierte una cadena a un entero
Funcion<String, Integer> convertirEntero = Integer::valueOf;

// Llamar a la función de interfaz con la cadena "123"
int resultado = convertirEntero.aplicar("123");

System.out.println(resultado); // Imprime 123

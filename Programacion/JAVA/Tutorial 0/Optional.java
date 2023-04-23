// Crear un Optional que contiene un valor entero
Optional<Integer> valor = Optional.of(123);

// Obtener el valor del Optional o un valor predeterminado si es nulo
int resultado = valor.orElse(0);

System.out.println(resultado); // Imprime 123
// Crear una lista de números
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

// Crear un stream que filtra los números pares y luego los duplica
List<Integer> resultado = numeros.stream()
    .filter(n -> n % 2 == 0)
    .map(n -> n * 2)
    .collect(Collectors.toList());

System.out.println(resultado); // Imprime [4, 8]
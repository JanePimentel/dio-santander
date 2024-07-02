package br.edu.trilhajava.bootcamp.stream.exercicios;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import br.edu.trilhajava.bootcamp.enums.Main;

public class Exercicios {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 13,15);

        /**
         * -----------------------------Desafio 1 - Mostrar a lista na ordem numérica:
         * ----------------------
         */
        List<Integer> listaSemDuplicados = numeros.stream().distinct().collect(Collectors.toList());
        // O distinct retira duplicidade e ordena;
        numeros.stream().sorted().forEach(System.out::println);
        // Ou usamos sorted para ordenar sem retirar duplicidades

        /**
         * -----------------------------Desafio 2 - Mostrar a lista na ordem
         * inversa:----------------------------
         */
        numeros.stream().distinct().sorted((n1, n2) -> n2.compareTo(n1)).collect(Collectors.toList())
                .forEach(System.out::println);

        /**
         * ------------------------------Desafio 3 - Imprima a soma dos números pares da
         * lista:-----------------------
         */
        System.out.println(
                "A soma dos números pares é .: " + numeros.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum));

        /**
         * ------------------------- Desafio 3 - Verifique se todos os números da lista
         * são positivos: ---------------------
         */
        Predicate<Integer> sePositivos = numero -> numero > 0;
        System.out.println(numeros.stream().allMatch(sePositivos) == true ? "Sim, todos positivos!"
                : "Não, nem todos são positivos!");

        /**
         * ------------------------ Desafio 4 - Remover todos os valores
         * impares:-----------------------------
         */
        numeros.stream().filter(n -> n % 2 != 0).forEach(System.out::println);
        // Ou
        List<Integer> impar = numeros.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());

        /**
         * ------------------------- Desafio 5 - Calcular a média dos números maiores
         * que 5:------------------------------
         */
        numeros.stream().filter(n -> n > 5).mapToInt(n -> n).average().ifPresent(avg -> {
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("Média dos números maiores que 5: " + df.format(avg));
        });

        /**
         * ---------------------------- Desafio 6 - Verifique se a lista contém algum
         * número maior que 10--------------
         */
        System.out.println("Lista possui numeros maiores que 10.: " + numeros.stream().anyMatch(n -> n > 10));

        /**
         * ---------------------------- Desafio 7 - Encontrar o segundo número maior da
         * lista:---------------------
         */
        Integer segundoMaior = numeros.stream()
                .distinct() // Remove elementos duplicados
                .sorted(Comparator.reverseOrder()) // Ordena em ordem decrescente
                .skip(1) // Pula o maior número
                .findFirst() // Encontra o primeiro elemento (segundo maior)
                .orElse(null); // Caso não haja segundo maior, retorna null
        System.out.println("Segundo maior número.:" + segundoMaior);

        /**
         * ---------------------- Desafio 8 - Somar os dígitos de todos os números da
         * lista --------------------
         */
        int somaDigitos = numeros.stream()
                .map(Exercicios::somarDigitos) // converte o número em uma string, mapeia cada caractere de volta para
                                               // um inteiro e calcula a soma dos dígitos
                .mapToInt(Integer::intValue) // Converte o stream de Integer para um IntStream, necessário para chamar o
                                             // método sum()
                .sum(); // sum(): Calcula a soma de todos os dígitos dos números na list
        System.out.println("A soma dos dígitos de todos os números da lista é: " + somaDigitos);

        /*---------------- Desafio 9 - Verifique se todos os números da lista são diferentes (não se repetem)-------:*/
        System.out.println(numeros.stream()
                .collect(Collectors.toSet()) // Converte para um conjunto (remove duplicatas)
                .size() != numeros.size() ? // Compara o tamanho do conjunto com o tamanho da lista original
                        "Não, lista tem elementos repetidos!"
                        : "Sim, todos os números são diferentes!");

        /**
         * ---------------------Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5: ---------------------
         */
        numeros.stream()
                .filter(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        /**
         * -------------------- Desafio 11 - Encontre a soma dos quadrados de todos os números da--------------------
         */
        int somaQuadrados = numeros.stream()
                .map(n -> n * n) // multiplica cada número por ele mesmo, obtendo os quadrados
                .mapToInt(Integer::intValue) // Converte o stream de Integer para um IntStream, necessário para chamar o
                                             // método sum()
                .sum();
        System.out.println("A soma dos quadrados é: " + somaQuadrados);

        /*---------------- Desafio 12 - Encontre o produto de todos os números da lista:------------------ */
        long produto = numeros.stream()
                .mapToLong(n -> n) // Converte para um LongStream
                .reduce(1, (n1, n2) -> n1 * n2);
        System.out.println("Produto dos números: " + produto);
        /*
         * Converte os elementos do stream de Integer para long usando mapToLong para
         * evitar estouro de inteiros em multiplicações grandes;
         * 
         * O 1 do reduce inicializa o acumulador como o elemento neutro da multiplicação
         * (porque
         * multiplicar por 1 não altera o valor) e a função (a, b) -> a * b multiplica
         * cada elemento sucessivamente
         */

/** -----------------------------Desafio 13 - Filtrar os números que estão dentro de um intervalo: ---------------------------------------------*/
       System.out.println("Números entre 5 e 10.:" + numeros.stream().distinct().filter(n -> n >= 5 && n <= 10).collect(Collectors.toList()));
        
/**---------------------- Desafio 14 - Encontre o maior número primo da lista: ------------------------------ */
     System.out.println("O maior número primo é.:" + numeros.stream()
    .distinct()
       .filter(Exercicios::isPrime)// Filtra apenas os números primos
       .max(Integer::compareTo) // Encontra o maior número usando compareTo
       .orElse(null));// Retorna null se não houver nenhum primo na list


/*----------- Desafio 15 - Verifique se a lista contém pelo menos um número negativo: ----------------------- */
    System.out.println(numeros
                .stream()
                .anyMatch(n-> n < 0) ? "Sim, lista contém números negativos!" : "Não, lista não contém números negativos!");


/**---------------------- Desafio 16 - Agrupe os números em pares e ímpares:------------------------------- */

        Map<String,List<Integer>> numerosAgrupados = numeros.stream()
                                    .collect(Collectors.groupingBy(n->n % 2 == 0? "Pares" : "Impares"));
        
         System.out.println("Números agrupados em pares e ímpares:");
         numerosAgrupados.forEach((key, value) -> { System.out.println(key + ": " + value);});

/*------------------Desafio 17 - Filtrar os números primos da lista: ----------------------------------------*/
        System.out.println("Filtrando números ímpares.: " + numeros
                .stream()
                .filter(Exercicios::isPrime) // Filtra apenas os números primos
                .collect(Collectors.toList()));


/**--------------Desafio 18 - Verifique se todos os números da lista são iguais:---------------  */
        boolean todosIguais2 = numeros.stream().allMatch(num -> num.equals(numeros.get(0)));
        System.out.println("Todos os números são iguais? " + (todosIguais2 == true ? "Sim!": "Não"));

/** ------------Desafio 19 - Encontrar a soma dos números divisíveis por 3 e 5: ----------- */
Predicate<Integer> seDivisivelPorTresECinco = numero -> numero % 3 == 0 && numero % 5 == 0;
System.out.println(numeros.stream().filter(seDivisivelPorTresECinco).collect(Collectors.toList()));
System.out.println("Soma de números divisiveis por 3 e 5.: " + numeros.stream()
        .filter(n -> n % 3 == 0 && n % 5 == 0) // Filtra apenas os números divisíveis por 3 ou 5
        .mapToInt(Integer::intValue) // Converte o stream de Integer para um IntStream
        .sum());

    }

    // Método para somar os dígitos de um número
    public static int somarDigitos(Integer numero) {
        return String.valueOf(numero).chars()
                .map(Character::getNumericValue)
                .sum();
    }

    // Função para verificar se um número é primo
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

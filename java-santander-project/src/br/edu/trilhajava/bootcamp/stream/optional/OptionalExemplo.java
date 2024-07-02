
package br.edu.trilhajava.bootcamp.stream.optional;

import java.util.Optional;

class OptionalExemplo {

    public static void main(String[] args) {
        //get(): Obtém o valor contido no Opcional. Se o valor for nulo, lançará uma exceção NoSuchElementException.
        Optional<String> optionalValue = Optional.of("Hello");
        System.out.println(optionalValue.get());

        //isPresent(): Verifique se o Opcional contém um valor não nulo.
        //ofNullable(value): Cria um Opcional contendo o valor fornecido, mas permite que o valor seja nulo.
        String nullableValue = null;
        Optional<String> optionalValu = Optional.ofNullable(nullableValue);
        System.out.println(optionalValu.isPresent());

        Optional<String> optionalVa = Optional.empty();
        System.out.println(optionalVa.isPresent());

        Optional<String> optionalV = Optional.of("Hello");
        System.out.println(optionalV.isPresent());

        //orElse(defaultValue): Obtém o valor contido no Opcional, ou retorna um valor padrão se o Opcional estiver vazio   
        Optional<String> optionalv = Optional.ofNullable(null);
        String result = optionalv.orElse("Default");
        System.out.println(result);

       //orElseGet(supplier): Obtém o valor contido no Opcional, ou retorna um valor fornecido por um Fornecedor se o Opcional estiver vazio. 
        Optional<String> optional = Optional.ofNullable(null);
        String resulte = optional.orElseGet(() -> "Value from Supplier");
        System.out.println(resulte);
        
        //ifPresent(consumer): Executa uma ação fornecida por um Consumidor se o Opcional contiver um valor.
        Optional<String> option = Optional.of("Hello");
        option.ifPresent(value -> System.out.println("Valor presente: " + value));

        //orElseThrow(exceptionSupplier): Obtém o valor contido no Opcional, ou lança uma exceção fornecida por um Fornecedor se o Opcional estiver vazio.
        Optional<String> optiona = Optional.ofNullable(null);
        String resul = optiona.orElseThrow(() -> new RuntimeException("Value not present"));

    }
}
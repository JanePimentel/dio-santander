package edu.jane.segundaSemana;
public class MinhaClasse {
    public static void main(String[] args) throws Exception {
        String primeiroNome = "Joca";
        String segundoNome = "Linz";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        int anoFabricacao = 2034;
        boolean verdadeira = true;
        anoFabricacao = 2024;

        System.out.println(anoFabricacao);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }


}

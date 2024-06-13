package br.edu.trilhajava.bootcamp.excecao;

public class FormatadorCep {
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
    public static void main(String[] args) {
        try {
            String cep = formatarCep("124336590");
            System.out.println("CEP:" + cep);
        } catch (CepInvalidoException e) {
            System.out.println("CEP deve conter 8 dígitos!");
            e.printStackTrace();
        }
    }
}

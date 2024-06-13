package br.edu.trilhajava.bootcamp.interfaces.equipamentos.multifuncional;

import br.edu.trilhajava.bootcamp.interfaces.equipamentos.copiadora.Copiadora;
import br.edu.trilhajava.bootcamp.interfaces.equipamentos.digitalizadora.Digitalizadora;
import br.edu.trilhajava.bootcamp.interfaces.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");

    }

    @Override
    public void digitalizar() {
        System.out.println("Digilitalizando via equipamento multifuncional");
    }

}

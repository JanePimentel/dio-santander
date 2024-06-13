package br.edu.trilhajava.bootcamp.interfaces.fabrica;

import br.edu.trilhajava.bootcamp.interfaces.equipamentos.copiadora.Copiadora;
import br.edu.trilhajava.bootcamp.interfaces.equipamentos.impressora.Deskjet;
import br.edu.trilhajava.bootcamp.interfaces.equipamentos.impressora.Impressora;
import br.edu.trilhajava.bootcamp.interfaces.equipamentos.impressora.LaserJet;
import br.edu.trilhajava.bootcamp.interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Inter {
    public static void main(String[] args) {
        EquipamentoMultifuncional equipamentoMultifuncional = new EquipamentoMultifuncional();
        Impressora impressora = new Deskjet();
        impressora.imprimir();
        impressora = equipamentoMultifuncional;

        impressora = new LaserJet();
        impressora.imprimir();

        impressora = new EquipamentoMultifuncional();
        impressora.imprimir();

        Copiadora copiadora = new EquipamentoMultifuncional();
        copiadora.copiar();
    }

}

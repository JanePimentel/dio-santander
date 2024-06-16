package br.edu.trilhajava.bootcamp.collections.map.ordenacao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AgendaEventos {
    Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        this.eventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeEvento, String nomeAtracao) {
        Evento evento = new Evento(nomeEvento, nomeAtracao);
        this.eventos.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventos);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        // Set<LocalDate> dateSet = eventos.keySet();
        // Collection<Evento> values = eventos.values();
        // Retorna todas as keys ou todos os valores; nao usado aqui pq quero que a data retorne um evento
        
        // Definindo o formato desejado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.getDefault());
        LocalDate dataAtual = LocalDate.now();
        String dataFormatada = dataAtual.format(formatter);
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventos);
        //Só é possivel a correta comparacao pq usamos o TreeMap para ordenar em modo crescente o map anterior
        // o entry sabe apontar chave e valor e fazer correspondencia entre eles
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                dataFormatada = proximaData.format(formatter);
                System.out.println("Póximo evento em  " + dataFormatada + " | " + " Evento: " +  proximoEvento.getNomeEvento() + " com " + proximoEvento.getNomeAtracao());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        agenda.adicionarEvento(LocalDate.of(2024, 8, 15), "Festa", "Banda Mrc");
        agenda.adicionarEvento(LocalDate.of(2025, 6, 1), "Show", "Teatro Manu");
        agenda.adicionarEvento(LocalDate.of(2023, 7, 20), "Congresso", "Dj Mir");
        agenda.exibirAgenda();
        agenda.obterProximoEvento();

    }

}

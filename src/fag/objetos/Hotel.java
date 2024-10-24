package fag.objetos;

import java.util.ArrayList;

public class Hotel {
    public ArrayList<Quarto> quartos = new ArrayList<>();
    public ArrayList<Reserva> reservas = new ArrayList<>();

    public void adicionarQuarto(int numero, String tipo, double preco, boolean disponibilidade) {
        Quarto quarto = new Quarto(numero, tipo, preco, disponibilidade);
        quartos.add(quarto);
    }

  
    public void fazerReserva(String nomeHospede, String dataCheckIn, String dataCheckOut, int numeroQuartos, String tipoQuarto) {
        boolean reservaFeita = false;
        int quartosReservados = 0;
        
        
        for (Quarto quarto : quartos) {
            if (quarto.tipo.equals(tipoQuarto) && quarto.disponibilidade) {
                quarto.disponibilidade = false;
                quartosReservados++;
                if (quartosReservados == numeroQuartos) {
                    reservaFeita = true;
                    break;
                }
            }
        }

        if (reservaFeita) {
            Reserva reserva = new Reserva(nomeHospede, dataCheckIn, dataCheckOut, numeroQuartos, tipoQuarto);
            reservas.add(reserva);
            System.out.println("Reserva feita com sucesso para " + nomeHospede);
        } else {
            System.out.println("Não há quartos suficientes disponíveis para essa reserva.");
        }
    }
    
    public void checkIn(String nomeHospede) {
        for (Reserva reserva : reservas) {
            if (reserva.nomeHospede.equals(nomeHospede)) {
                System.out.println("Check-in realizado para " + nomeHospede);
                return;
            }
        }
        System.out.println("Reserva não encontrada para o hóspede " + nomeHospede);
    }

    public void checkOut(String nomeHospede) {
        Reserva reservaParaRemover = null;
        for (Reserva reserva : reservas) {
            if (reserva.nomeHospede.equals(nomeHospede)) {
                liberarQuartos(reserva.tipoQuarto, reserva.numeroQuartos);
                reservaParaRemover = reserva;
                System.out.println("Check-out realizado para " + nomeHospede);
                break;
            }
        }

        if (reservaParaRemover != null) {
            reservas.remove(reservaParaRemover);
        } else {
            System.out.println("Reserva não encontrada para o hóspede " + nomeHospede);
        }
    }

    public void liberarQuartos(String tipoQuarto, int quantidade) {
        int quartosLiberados = 0;
        for (Quarto quarto : quartos) {
            if (quarto.tipo.equals(tipoQuarto) && !quarto.disponibilidade) {
                quarto.disponibilidade = true;
                quartosLiberados++;
                if (quartosLiberados == quantidade) {
                    break;
                }
            }
        }
    }

    public void gerarRelatorioOcupacao() {
        System.out.println("Relatório de ocupação:");
        for (Quarto quarto : quartos) {
            if (!quarto.disponibilidade) {
                quarto.exibirDetalhes();
            }
        }
    }

    public void gerarHistoricoReservas() {
        System.out.println("Histórico de Reservas:");
        for (Reserva reserva : reservas) {
            reserva.exibirDetalhes();
        }
    }
}

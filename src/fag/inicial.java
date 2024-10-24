package fag;

import java.util.Scanner;
import fag.objetos.Hotel;

public class inicial {
	
	 public static void main(String[] args) {
	        Hotel hotel = new Hotel();
	        Scanner scanner = new Scanner(System.in);

	        //adicionar quartos pro hotel por número, tipo, valor e disponibilidade
	        hotel.adicionarQuarto(101, "Solteiro", 100.0, true);
	        hotel.adicionarQuarto(102, "Casal", 150.0, true);
	        hotel.adicionarQuarto(103, "Suite", 200.0, true);

	        int opcao = 0;
	        do {
	            System.out.println("1. Fazer Reserva");
	            System.out.println("2. Check-in");
	            System.out.println("3. Check-out");
	            System.out.println("4. Relatório de Ocupação");
	            System.out.println("5. Histórico de Reservas");
	            System.out.println("6. Sair");
	            opcao = scanner.nextInt();
	            scanner.nextLine();
	            
	            switch(opcao) {
	                case 1:
	                    System.out.println("Nome do hóspede:");
	                    String nome = scanner.nextLine();
	                    System.out.println("Data de check-in (dd/mm/aaaa):");
	                    String checkIn = scanner.nextLine();
	                    System.out.println("Data de check-out (dd/mm/aaaa):");
	                    String checkOut = scanner.nextLine();
	                    System.out.println("Número de quartos:");
	                    int numQuartos = scanner.nextInt();
	                    scanner.nextLine();
	                    System.out.println("Tipo de quarto:");
	                    String tipo = scanner.nextLine();
	                    hotel.fazerReserva(nome, checkIn, checkOut, numQuartos, tipo);
	                    break;
	                case 2:
	                    System.out.println("Nome do hóspede para check-in:");
	                    nome = scanner.nextLine();
	                    hotel.checkIn(nome);
	                    break;
	                case 3:
	                    System.out.println("Nome do hóspede para check-out:");
	                    nome = scanner.nextLine();
	                    hotel.checkOut(nome);
	                    break;
	                case 4:
	                    hotel.gerarRelatorioOcupacao();
	                    break;
	                case 5:
	                    hotel.gerarHistoricoReservas();
	                    break;
	                case 6:
	                    System.out.println("Saindo...");
	                    break;
	                default:
	                    System.out.println("Opção inválida!");
	            }
	        } while(opcao != 6);

	        scanner.close();
	    }
	}

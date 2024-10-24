package fag.objetos;

public class Reserva {

	    public String nomeHospede;
	    public String dataCheckIn;
	    public String dataCheckOut;
	    public int numeroQuartos;
	    public String tipoQuarto;

	   
	    public Reserva(String nomeHospede, String dataCheckIn, String dataCheckOut, int numeroQuartos, String tipoQuarto) {
	        this.nomeHospede = nomeHospede;
	        this.dataCheckIn = dataCheckIn;
	        this.dataCheckOut = dataCheckOut;
	        this.numeroQuartos = numeroQuartos;
	        this.tipoQuarto = tipoQuarto;
	    }

	    
	    public void exibirDetalhes() {
	        System.out.println("Nome do Hóspede: " + nomeHospede);
	        System.out.println("Check-in: " + dataCheckIn);
	        System.out.println("Check-out: " + dataCheckOut);
	        System.out.println("Número de quartos: " + numeroQuartos);
	        System.out.println("Tipo de quarto: " + tipoQuarto);
	    }
	}



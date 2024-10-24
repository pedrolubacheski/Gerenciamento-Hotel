package fag.objetos;

public class Quarto {
    public int numero;
    public String tipo;
    public double precoDiario;
    public boolean disponibilidade;

    public Quarto(int numero, String tipo, double precoDiario, boolean disponibilidade) {
        this.numero = numero;
        this.tipo = tipo;
        this.precoDiario = precoDiario;
        this.disponibilidade = disponibilidade;
    }

    public void exibirDetalhes() {
        System.out.println("Número do quarto: " + numero);
        System.out.println("Tipo: " + tipo);
        System.out.println("Preço diário: " + precoDiario);
        System.out.println("Disponível: " + (disponibilidade ? "Sim" : "Não"));
    }
}


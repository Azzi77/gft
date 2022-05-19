public class Movel extends Eletronico {
    public Movel(String nome, double valor, int quantidade) {
        super(nome, valor, quantidade);
    }

    public double calcularValorFinal() {
        double valorTotal = (this.getValor() * this.getQuantidade());

    {
        if (quantidade < 10) valorTotal *= 0.05;
        if (quantidade > 10) valorTotal *= 0.11;
        return valorTotal;
    }
}}


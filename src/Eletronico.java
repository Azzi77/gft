public class Eletronico extends Produto {
    public Eletronico(String nome, double valor, int quantidade) {
        super(nome, valor, quantidade);
    }

    public Eletronico() {
        super();
    }

    public double calcularValorFinal() {
        double valorTotal = (valor * quantidade); // formula valo * quantidade + 15%
        valorTotal *= 0.15;
        return valorTotal;
    }
}

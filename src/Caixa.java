public class Caixa {

    public static void main(String[] args) {


        Eletronico eletronico = new Eletronico();

        eletronico.setNome("Ventilador");
        eletronico.setNome("Computador");

        eletronico.calcularValorFinal();

        System.out.println(eletronico.calcularValorFinal());
        }
    }


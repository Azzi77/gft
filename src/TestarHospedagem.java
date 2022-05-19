public class TestarHospedagem {
    public static void main(String[] args) {


        Hospedagem hospedagem = new Hospedagem();
        HospedagemVip hospedagemVip = new HospedagemVip();
        hospedagemVip.valorAdcional();

     hospedagem.setValorDiaria(100.0);


        System.out.println(hospedagem.getValorDiaria());


    }
}

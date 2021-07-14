package orientacaoobjetos.EncapsulamentoHerancaPolimorfismo.Heranca;

public class Moto extends Veiculo{
    private String cilindradas;
    //quantidade de cilindradas

    public String setCilindradas(String cilindradas){
        this.cilindradas = cilindradas;
        return cilindradas;
    }

    public String getCilindradas() {
        return cilindradas;
    }
}

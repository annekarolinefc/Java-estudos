package orientacaoobjetos.EncapsulamentoHerancaPolimorfismo.Heranca;

public class Carro extends Veiculo{
    private int quantidadeDePorta;
    //quantidade de portas

    public int setQuantidadeDePorta(int quantidadeDePorta){
        this.quantidadeDePorta = quantidadeDePorta;
        return quantidadeDePorta;
    }

    public int getQuantidadeDePorta() {
        return quantidadeDePorta;
    }
}

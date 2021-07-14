package orientacaoobjetos.EncapsulamentoHerancaPolimorfismo.Heranca;

public class Veiculo {
    private String modelo;
    private String marca;

    public String getModelo(){
        return modelo;
    }

    public String getMarca(){
        return marca;
    }

    public String setModelo(String modelo){
        this.modelo = modelo;
        return modelo;
    }

    public String setMarca(String marca){
        this.marca = marca;
        return marca;
    }

    public String acelerar(){
        return "VRUM VRUM";
    }
}

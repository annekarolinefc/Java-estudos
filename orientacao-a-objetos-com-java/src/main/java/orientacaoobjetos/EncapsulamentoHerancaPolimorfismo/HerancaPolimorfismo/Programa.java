package orientacaoobjetos.EncapsulamentoHerancaPolimorfismo.Heranca;

public class Programa {
    public static void main(String[] args){
        Carro carro = new Carro();
        Moto moto = new Moto();

        carro.setModelo("Fiat");
        carro.setMarca("Uno");
        carro.setQuantidadeDePorta(2);

        System.out.println("O modelo do carro é um " + carro.getModelo());
        System.out.println("A marca do carro é " + carro.getMarca());
        System.out.println("O carro possui " + carro.getQuantidadeDePorta() + " portas.");
        System.out.println( carro.acelerar());
        moto.setModelo("Honda");
        moto.setMarca("CG");
        moto.setCilindradas("100");

        System.out.println("O modelo da moto é " + moto.getModelo());
        System.out.println("A marca da moto é " + moto.getMarca());
        System.out.println("A moto possui " + moto.getCilindradas() + " cilindradas.");

    }
}

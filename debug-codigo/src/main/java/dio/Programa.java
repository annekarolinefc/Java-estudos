package dio;

import dio.Pessoa;
import dio.CalculadorDeImc;

//CRIANDO BREAK POINTS -> CIRCULO VERMELHO -> IDENTIFICAR PROBLEMA

public class Programa {
    public static void main(String[] args){
        final Pessoa pessoa = new Pessoa("Anne", 1.56, 72.00);

        final var calculadorDeImc = new CalculadorDeImc();
        final var imc = calculadorDeImc.calcula(pessoa);

        System.out.println(imc);
        //System.out.println("IMC:  %.2f", imc);
    }
}

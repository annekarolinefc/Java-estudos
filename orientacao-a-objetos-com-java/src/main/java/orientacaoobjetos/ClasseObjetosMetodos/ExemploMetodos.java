package orientacaoobjetos;

public class ExemploMetodos {
    public static void main(String[] args){
        //INSTANCIANDO A CLASSE PESSOA CRIADA
        Pessoa pessoa = new Pessoa();

        //ESCREVENDO O NOME
        System.out.println(pessoa.falarMeuProprioNome());
        //olá, meu nome é Anne;

        //EXECUTANDO A AÇÃO ANDAR
        System.out.println(pessoa.andar());
    }
}

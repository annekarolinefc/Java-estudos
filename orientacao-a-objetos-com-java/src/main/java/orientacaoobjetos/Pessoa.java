package orientacaoobjetos;

//CRIANDO A CLASSE PESSOA
public class Pessoa {

    private String nome = "Marco";

    //CRIANDO METODO PARA OBTER NOME, FRASE E AÇÃO;
    public String getNome() {
        return nome;
    }

    public String falarMeuProprioNome(){
        return "Olá, meu nome é " + getNome();
    }

    public String andar() {
        return "Andando...";
    }
}

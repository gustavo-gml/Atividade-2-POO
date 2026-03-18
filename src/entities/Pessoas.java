package entities;

public class Pessoas {
    private String nome;
    private Integer idade;


    public Pessoas(String nome, Integer idade) {
        if(idade < 0 || idade > 100){
            throw new IllegalArgumentException("A idade não pode ser menor que 0 ou maior que 100");
        }
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        if(idade < 0 || idade > 100){
            throw new IllegalArgumentException("A idade não pode ser menor que 0");
        }
        this.idade = idade;
    }
}

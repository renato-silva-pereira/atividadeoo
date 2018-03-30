package revisao.programa1;

public class Pessoa {
    
    private String nome;
    private int idade;
    
    public void fazAniversário()
    {
        this.idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}

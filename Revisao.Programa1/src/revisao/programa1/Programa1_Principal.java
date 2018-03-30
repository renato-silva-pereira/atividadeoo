package revisao.programa1;

public class Programa1_Principal {


    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome("Lagre Silverio");
        pessoa.setIdade(24);
        
        pessoa.fazAniversário();
        pessoa.fazAniversário();
        
        System.out.println("Nome: "+pessoa.getNome()); 
        System.out.println("Idade: "+pessoa.getIdade());//idade esperada 26 anos
        
    }

}

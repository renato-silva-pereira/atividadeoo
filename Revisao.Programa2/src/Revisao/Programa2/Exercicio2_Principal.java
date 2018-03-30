package Revisao.Programa2;

public class Exercicio2_Principal {


    public static void main(String[] args) {
        
        Janela janela = new Janela();
        
        janela.setAberta(true);
        janela.setCor("Azul");
        janela.setDimensaoX(100.10);
        janela.setDimensaoY(150.10);
        janela.setDimensaoZ(30);
        
        System.out.println("Cor da janela: " +janela.getCor());
        System.out.println("A janela está: " +(janela.estaAberta() ? "Aberta" : "Fechada"));
        System.out.println("Altura da janela: " +janela.getDimensaoY());
        System.out.println("Largura da janela: " +janela.getDimensaoX());
        System.out.println("Profundidade da janela:" +janela.getDimensaoZ());
        System.out.println("---------------------------");
        
        janela.setCor("Verde");
        janela.fecha();
        
        System.out.println("Cor da janela: " +janela.getCor());
        System.out.println("A janela está: " +(janela.estaAberta() ? "Aberta" : "Fechada"));
        System.out.println("Altura da janela: " +janela.getDimensaoY());
        System.out.println("Largura da janela: " +janela.getDimensaoX());
        System.out.println("Profundidade da janela:" +janela.getDimensaoZ());
        System.out.println("---------------------------");
        
    }

}

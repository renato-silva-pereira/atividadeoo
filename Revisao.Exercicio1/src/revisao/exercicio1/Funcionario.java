package revisao.exercicio1;

import java.time.LocalDate;

public class Funcionario {
    
    private int idFunc;
    private String nomeFunc;
    private String departamento;
    private LocalDate dataContratacao;
    private double salario;
    private String documento;
    private boolean estaAtivo;
    
    
    public void atualizarSalario(double aumento)
    {
       this.salario += aumento; 
    }
    
    public void demitirFuncionario()
    {
        this.estaAtivo = false;
    }
    
    public void imprimir()
    {
        String ativo = "Ativo";
        String desligado = "Desligado";
        String situacao = (this.estaAtivo) ? ativo : desligado;
        
        System.out.println("-----------------------------");
        System.out.println("Informações do funcionário: ");   
        System.out.println("Id: " +this.idFunc);
        System.out.println("Nome: " +this.nomeFunc);
        System.out.println("Departamento: "+this.departamento);
        System.out.println("Contrado em: "+this.dataContratacao);
        System.out.println("Salário: "+this.salario);
        System.out.println("Documento: "+this.documento);
        System.out.println("Situação:" +situacao);
        System.out.println("------------------------------");
    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public boolean isEstaAtivo() {
        return estaAtivo;
    }

    public void setEstaAtivo(boolean estaAtivo) {
        this.estaAtivo = estaAtivo;
    }
    
    

}

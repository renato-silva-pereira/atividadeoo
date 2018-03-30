package revisao.exercicio1;

public class Empresa {
    
    public int idEmpresa;
    public String razaosocial;
    public String cnpj;
    public Funcionario[] empregados;    
    
    public void adicionarFuncionario(Funcionario f, int pos)
    {
        if(GerenciarFuncionario.pos < GerenciarFuncionario.TAM)
        {
            this.empregados[pos] = f;
            GerenciarFuncionario.pos++;
            System.out.println("Funcionário '"+f.getNomeFunc()+"'adicionado com sucesso!");
        }
        else
        {
            System.out.println("Não foi possível adicionar o funcionário.' " +f.getNomeFunc()+" '. A lista está cheia.");
        }
    }
    
    public void mostrarEmpregados()
    {
        for (int i = 0; i < GerenciarFuncionario.pos; i++ ) {
            
        String ativo = "Ativo";
        String desligado = "Desligado";
        String situacao = (this.empregados[i].isEstaAtivo()) ? ativo : desligado;
        
        System.out.println("-----------------------------");
        System.out.println("Informações do funcionário: ");   
        System.out.println("Id: " +this.empregados[i].getIdFunc());
        System.out.println("Nome: " +this.empregados[i].getNomeFunc());
        System.out.println("Departamento: "+this.empregados[i].getDepartamento());
        System.out.println("Contrado em: "+this.empregados[i].getDataContratacao());
        System.out.println("Salário: "+this.empregados[i].getSalario());
        System.out.println("Documento: "+this.empregados[i].getDocumento());
        System.out.println("Situação:" +situacao);
        System.out.println("------------------------------");
        System.out.println("");
            
        }
    }
    
    public boolean contemEmpregado(Funcionario f)
    {
        boolean contem = false;
        
        for(int i = 0; i < GerenciarFuncionario.pos; i++)
        {
            if(this.empregados[i].getIdFunc() == f.getIdFunc())
            {
                return contem = true;
            }
        }
        
       return contem;
    }
    

}

package revisao.exercicio1;

import static java.time.LocalDate.now;

public class GerenciarFuncionario {

            public static int TAM = 3;
            public static int pos = 0;            

    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        Funcionario f3 = new Funcionario();
        Funcionario f4 = new Funcionario();
        
        f1.setIdFunc(1);
        f1.setNomeFunc("Lagreca Silverio");
        f1.setDepartamento("RH");
        f1.setDataContratacao(now());
        f1.setSalario(500.00);
        f1.setDocumento("RG: xxxx.xxxx");
        f1.setEstaAtivo(true);
        
        f2.setIdFunc(2);
        f2.setNomeFunc("Joselito Camarada");
        f2.setDepartamento("TI");
        f2.setDataContratacao(now());
        f2.setSalario(700.00);
        f2.setDocumento("RG: xxxx.xxxx");
        f2.setEstaAtivo(true);
        
        f3.setIdFunc(3);
        f3.setNomeFunc("ManoZ Queiroz");
        f3.setDepartamento("Diretoria");
        f3.setDataContratacao(now());
        f3.setSalario(800.00);
        f3.setDocumento("RG: xxxx.xxxx");
        f3.setEstaAtivo(true);
        
        f4.setIdFunc(3);
        f4.setNomeFunc("Teste Limite");
        f4.setDepartamento("Diretoria");
        f4.setDataContratacao(now());
        f4.setSalario(800.00);
        f4.setDocumento("RG: xxxx.xxxx");
        f4.setEstaAtivo(true);
        
        Empresa emp = new Empresa();
        emp.empregados = new Funcionario[TAM];
            
        emp.adicionarFuncionario(f1, pos);// Deve retornar sucesso 2° Linha do console.
        emp.adicionarFuncionario(f2, pos);// Deve retornar sucesso 3° Linha do console.
        emp.adicionarFuncionario(f3, pos);// Deve retornar sucesso 4° Linha do console.
        emp.adicionarFuncionario(f4, pos); // Deve retornar erro na 5° Linha do console.
        emp.mostrarEmpregados(); //Deve mostrar funcionários apartir da 6° Linha do console.
        
        
        /*f1.atualizarSalario(100);        
        f1.imprimir();        
        f1.demitirFuncionario();        
        f1.imprimir();*/        
        
        boolean t;        
        t = emp.contemEmpregado(f3);
        
        String ativo = "Funcionário pertence ao quadro da empresa.";
        String desligado = "Funcionário não pertence ao quadro da empresa.";
        String situacao = (t) ? ativo : desligado;
        System.out.println(situacao);
        
        
    }

}

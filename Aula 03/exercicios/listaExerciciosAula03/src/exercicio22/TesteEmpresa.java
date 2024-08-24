package exercicio22;

public class TesteEmpresa {
    public static void main(String[] args) {
        Empresa minhaEmpresa = new Empresa("Inside", "12.345.678/0001-99", 50);

        minhaEmpresa.contratarFuncionario();
        minhaEmpresa.demitirFuncionario();
    }
}


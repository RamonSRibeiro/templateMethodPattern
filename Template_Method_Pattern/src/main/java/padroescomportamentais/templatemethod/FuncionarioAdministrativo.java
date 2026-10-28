package padroescomportamentais.templatemethod;

public class FuncionarioAdministrativo extends Funcionario {

    public String verificarAprovacao() {
        if (this.calcularMedia() >= 6.0f) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

}
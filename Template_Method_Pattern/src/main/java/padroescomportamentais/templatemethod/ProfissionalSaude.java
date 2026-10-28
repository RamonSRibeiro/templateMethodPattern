package padroescomportamentais.templatemethod;

public class ProfissionalSaude extends Funcionario {

    public String verificarAprovacao() {
        if (this.calcularMedia() >= 7.0f) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

    @Override
    public String getTipo() {
        return "ProfissionalSaude";
    }
}
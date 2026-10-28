package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioAdministrativoTest {

    @Test
    void deveRetonarAprovado() {
        FuncionarioAdministrativo funcionario = new FuncionarioAdministrativo();
        funcionario.setNota1(6.0f);
        funcionario.setNota2(6.0f);
        assertEquals("Aprovado", funcionario.verificarAprovacao());
    }

    @Test
    void deveRetonarReprovado() {
        FuncionarioAdministrativo funcionario = new FuncionarioAdministrativo();
        funcionario.setNota1(6.0f);
        funcionario.setNota2(5.9f);
        assertEquals("Reprovado", funcionario.verificarAprovacao());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioAdministrativo funcionario = new FuncionarioAdministrativo();
        funcionario.setNota1(6.0f);
        funcionario.setNota2(5.9f);
        funcionario.setNome("Marcelo");
        funcionario.setMatricula(2);
        assertEquals("Funcionario{matricula=2, nome='Marcelo', resultado=Reprovado}", funcionario.getInfo());
    }
}
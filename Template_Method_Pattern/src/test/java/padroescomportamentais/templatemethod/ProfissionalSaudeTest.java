package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfissionalSaudeTest {

    @Test
    void deveRetonarAprovado() {
        ProfissionalSaude funcionario = new ProfissionalSaude();
        funcionario.setNota1(7.0f);
        funcionario.setNota2(7.0f);
        assertEquals("Aprovado", funcionario.verificarAprovacao());
    }

    @Test
    void deveRetonarReprovado() {
        ProfissionalSaude funcionario = new ProfissionalSaude();
        funcionario.setNota1(7.0f);
        funcionario.setNota2(6.9f);
        assertEquals("Reprovado", funcionario.verificarAprovacao());
    }

    @Test
    void deveRetornarInformacoes() {
        ProfissionalSaude funcionario = new ProfissionalSaude();
        funcionario.setNota1(7.0f);
        funcionario.setNota2(7.0f);
        funcionario.setNome("Marco");
        funcionario.setMatricula(1);
        assertEquals("ProfissionalSaude{matricula=1, nome='Marco', resultado=Aprovado}", funcionario.getInfo());
    }
}
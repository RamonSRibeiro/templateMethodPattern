# Padrão de Projeto Template Method — Sistema de Avaliação de Funcionários de uma Clínica

## Descrição

Este projeto demonstra a aplicação do padrão de projeto comportamental **Template Method** em um sistema de avaliação de funcionários de uma clínica.

O sistema calcula a média de duas notas e verifica se o funcionário foi aprovado ou reprovado. Cada categoria de funcionário possui um critério de aprovação específico.

## Objetivo

Demonstrar como o padrão Template Method permite definir uma estrutura comum em uma classe abstrata, deixando que as subclasses implementem etapas específicas do comportamento.

## Estrutura do projeto

- **Funcionario:** classe abstrata que armazena os dados do funcionário, calcula a média, define o método abstrato de aprovação e fornece as informações do funcionário.
- **FuncionarioAdministrativo:** representa um funcionário administrativo e considera a média mínima de 6,0 para aprovação.
- **ProfissionalSaude:** representa um profissional de saúde e considera a média mínima de 7,0 para aprovação. Também sobrescreve o método `getTipo()`.
- **FuncionarioAdministrativoTest:** contém os testes automatizados da aprovação, reprovação e apresentação das informações de funcionários administrativos.
- **ProfissionalSaudeTest:** contém os testes automatizados da aprovação, reprovação e apresentação das informações de profissionais de saúde.

## Padrão de projeto utilizado

### Template Method

O padrão Template Method define a estrutura geral de um algoritmo em uma classe base, permitindo que subclasses implementem ou redefinam etapas específicas.

Neste projeto, a classe `Funcionario` centraliza os atributos, o cálculo da média e a composição das informações. O método abstrato `verificarAprovacao()` é implementado pelas subclasses com critérios diferentes.

## Regras de avaliação

### Funcionário administrativo

- Média maior ou igual a 6,0: **Aprovado**.
- Média inferior a 6,0: **Reprovado**.

### Profissional de saúde

- Média maior ou igual a 7,0: **Aprovado**.
- Média inferior a 7,0: **Reprovado**.

A média é calculada pela soma das duas notas dividida por dois.

## Exemplo de funcionamento

Um funcionário administrativo com notas 6,0 e 6,0 obtém média 6,0 e é aprovado.

Um profissional de saúde com notas 7,0 e 6,9 obtém média 6,95 e é reprovado, pois não alcança a média mínima de 7,0.

O método `getInfo()` retorna os dados do funcionário, incluindo matrícula, nome, tipo e resultado da avaliação.

## Testes

Os testes automatizados utilizam JUnit 5 e verificam:

- A aprovação de funcionários.
- A reprovação de funcionários.
- A geração das informações do funcionário, incluindo seu tipo e resultado.

## Tecnologias utilizadas

- Java
- JUnit 5
- Padrões de projeto comportamentais

## Conclusão

O padrão Template Method facilita a reutilização de código ao concentrar o comportamento comum na classe abstrata `Funcionario`. As subclasses implementam suas próprias regras de aprovação sem duplicar os atributos, o cálculo da média ou a composição das informações.

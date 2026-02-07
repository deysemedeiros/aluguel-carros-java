# Projeto de Aluguel de Carros

Este projeto simula o processo de aluguel de veículos. O usuário informa os dados do carro, verifica a disponibilidade, decide se deseja alugá-lo e, caso alugue, pode realizar a devolução com cálculo do valor total baseado em dias e quilômetros rodados.

## Tecnologias

- Java
- Eclipse (ou outra IDE de sua preferência)
- Biblioteca padrão do Java (Scanner)

## Como rodar

1. Abra o projeto na sua IDE.
2. Compile e rode a classe principal (`ProgramAluguelCarros.java`).
3. Informe os dados solicitados no console:
   - Modelo do carro
   - Placa
   - Quilometragem inicial
   - Valor da diária
4. Siga as instruções para alugar e devolver o veículo.

## Estrutura do projeto

- `src/` → código-fonte
  - `entities/Carro.java` → classe que representa o carro
  - `ProgramAluguelCarros.java` → classe principal com a lógica do programa
- `bin/` → arquivos compilados (ignorado pelo Git)
- `.gitignore` → arquivos ignorados pelo Git

## Funcionalidades

- Cadastro de veículo com informações básicas.
- Verificação de disponibilidade para locação.
- Processo de aluguel com alteração de status do carro.
- Devolução do veículo com cálculo do valor total:
  - `valor total = (dias * valorDiaria) + (kmRodados * 0.15)`
- Atualização da quilometragem do carro após uso.

## Exemplo de uso

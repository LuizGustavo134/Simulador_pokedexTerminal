=============================================================================================================================================
🕹️ Simulador de Pokédex em Java (Console RPG)
  Um projeto robusto desenvolvido em **Java Puro** focado em Programação Orientada a Objetos (POO), 
  arquitetura limpa, estruturas de dados nativas e modelagem de domínio da 1° Geração
  de Pokemon(Kanto).

=============================================================================================================================================
  
🎯 Sobre o Projeto
Este projeto foi construído do zero com o objetivo de demonstrar conhecimento da linguagem Java e de conceitos essenciais de engenharia de 
software, priorizando o uso das estruturas nativas da linguagem(conceito básicos) em vez de dependências externas desnecessárias 
(abordagem pragmática e offline) ou complexas.

=============================================================================================================================================

🚀 Principais Funcionalidades e Decisões Arquiteturais

1. Modelagem de Domínio (Geração 1 - Kanto)
-Geração Procedural de Pokémon: Sistema interno que mapeia e instancia os 151 Pokémon originais de Kanto com seus respectivos IDs, nomes e atributos base,
gerando de forma automatica a região de kanto em uma lista de objetos.
Status: concluida
-Suporte a Múltiplos Tipos:** Atributo de tipos modelado como um vetor estático (`String[]`) de 2 posições para acomodar com precisão os tipos primários e
 secundários (ex: *Planta/Venenoso*).
Status: Em desenvolvimento

=============================================================================================================================================

2. Sistema de Golpes e Restrições de Domínio | Status: Em desenvolvimento
- Vetor de 4 Slots: Cada Pokémon possui um vetor estático de tamanho fixo, para gerenciar seus ataques equipados, garantindo a regra clássica dos jogos nativamente pela estrutura de dados sem algoritmos complexos de limpeza.
-Catálogo de Golpes: Estrutura organizada contendo os ataques clássicos divididos pelos 15 tipos originais da primeira geração. em desenvolvimento

=============================================================================================================================================

3. Tratamento de Erros e Resiliência Status: Em desenvolvimento
-Arquitetura Limpa de Exceções: Abordagem centralizada de tratamento de erros utilizando blocos `try-catch` no loop de menu principal (`Interacao`), mantendo as classes de negócio limpas, desacopladas e aplicando a propagação de exceções de forma fluida. em revisão

=============================================================================================================================================

4. Gerenciamento de Dados (CRUD Completo) Status: concluido
- Operações completas de Criação, Leitura, Atualização e Deleção integradas ao console de forma manual e simplificada ao usuário,
  com foco em validações de entrada de dados e limpeza de buffer.

=============================================================================================================================================
  
🛠️ Tecnologias e Conceitos Aplicados
- Linguagem: Java 
- Conceitos de POO: Encapsulamento, Herança, Polimorfismo, Classes e Métodos Estáticos.
- Estruturas de Dados: Arrays estáticos de tamanho fixo para restrições de domínio, `ArrayList` para coleções dinâmicas e
  o uso de vetores para dados pré-definidos.
- Controle de Versão: Git Workflow com desenvolvimento baseado em features branches e integração contínua via merge.
- Ferramentas: IntelliJ IDEA, Git, GitHub.
- branches utilizadas até o momento:
main (nucleo principal)
golpes (teste de desenvolvimento)

=============================================================================================================================================

## 📂 Como Executar o Projeto
1. com git instalado:
2. git clone <Url>
3. view > main > play
4. faça um fork e seja feliz :)
   
 

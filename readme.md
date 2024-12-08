# Atividade de Programação Orientada a Objetos (POO) em Java

## Descrição do Projeto

Este projeto é uma atividade acadêmica que explora os conceitos fundamentais de Programação Orientada a Objetos (POO) utilizando Java. A atividade foi desenvolvida para demonstrar a aplicação prática de princípios como classes, objetos, herança, encapsulamento e composição.

## Objetivos da Atividade

A atividade foi estruturada em quatro questões progressivas, cada uma construindo sobre o conhecimento adquirido na anterior:

### Questão 1: Classes e Objetos
- Criação de uma classe abstrata `Pessoa` com atributos:
  - CPF
  - Nome
  - Idade
- Implementação de métodos para definir e obter atributos
- Criação da classe `Disciplina` com atributos:
  - Código
  - Nome
  - Semestre

### Questão 2: Encapsulamento e Métodos
- Evolução da classe `Pessoa`
- Adição do método `fazerAniversario()` para incrementar a idade

### Questão 3: Herança e Polimorfismo
- Criação de classes derivadas de `Pessoa`:
  - `Visitante`
  - `Aluno` (com atributo matrícula e método `pagarMensalidade()`)
  - `Professor` (com atributo centro e método `darAula()`)
- Derivação de `Aluno` em:
  - `Bolsista`
  - `Regular`
- Implementação de sobreposição no método `pagarMensalidade()`

### Questão 4: Associação e Composição
- Criação da classe `Turma` com atributos:
  - Código
  - Disciplina
  - Professor
  - Lista de Alunos
- Implementação de métodos:
  - `adicionarAluno()`
  - `removerAluno()`
  - `listarAlunos()`
- Uso de `ArrayList` para gerenciar a lista de alunos

## Estrutura do Código

O projeto demonstra a aplicação de diversos conceitos de POO:
- **Abstração**: Classe `Pessoa` como modelo base
- **Encapsulamento**: Métodos de acesso e modificação de atributos
- **Herança**: Classes derivadas de `Pessoa`
- **Polimorfismo**: Sobrescrita de métodos em classes derivadas
- **Composição**: Classe `Turma` composta por objetos de outras classes

## Requisitos de Implementação

Na classe principal com o método `main`, o projeto requer:
- Instanciação de:
  - 3 objetos `Disciplina`
  - 3 objetos `Aluno` (2 regulares, 1 bolsista)
  - 1 objeto `Professor`
  - 2 objetos `Visitante`
  - 3 objetos `Turma`
- Impressão de informações detalhadas de cada turma

## Tecnologias Utilizadas
- Linguagem: Java
- Conceitos: Programação Orientada a Objetos
- Estrutura de Dados: ArrayList

## Aprendizados

Esta atividade proporcionou uma compreensão prática de:
- Criação e manipulação de classes
- Princípios de herança
- Uso de métodos e atributos
- Gerenciamento de objetos
- Implementação de relações entre classes

## Como Executar

Para executar o projeto:
1. Certifique-se de ter o Java Development Kit (JDK) instalado
2. Compile todos os arquivos `.java`
3. Execute a classe principal que contém o método `main`

## Conclusão

A atividade serve como um excelente exercício para consolidar os conhecimentos fundamentais de Programação Orientada a Objetos, permitindo uma compreensão mais profunda dos conceitos através da implementação prática.
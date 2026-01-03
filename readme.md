# Projeto Java — Interfaces, Abstração e Controle de Estado
### 📌 Objetivo do Projeto

Este projeto tem como objetivo estudar e demonstrar conceitos fundamentais da Programação Orientada a Objetos (POO) em Java, com foco em:

* Abstração

* Interfaces

* Herança

* Encapsulamento

* Controle e persistência de estado

* Polimorfismo

* Ordem de execução de métodos

O exemplo prático utiliza um carro (Jetta) para representar comportamentos como acelerar e alternar o câmbio entre manual e automático.

## 🧠 Conceitos Aplicados
### ✔ Abstração

- Utilizada para definir comportamentos genéricos que todo carro deve possuir.

### ✔ Interface

 - Define contratos que a classe concreta deve implementar.

### ✔ Herança

- A classe concreta herda atributos e comportamentos comuns da classe abstrata.

### ✔ Encapsulamento

- O estado interno do objeto é alterado apenas por métodos controlados.

### ✔ Estado

O projeto demonstra claramente como um atributo mantém seu valor ao longo do tempo e como ele só é alterado quando um método específico é executado.

## 🧱 Estrutura do Projeto
src/ <br/>
├── Carro.java          // Classe abstrata <br/>
├── CoisasDeCarro.java  // Interface <br/>
├── Jetta.java          // Classe concreta <br/>
└── Main.java           // Classe principal <br/>

## 📄 Classe Abstrata Carro <br/>

<b>Explicação:</b>

automatico é um atributo de instância

Em Java, atributos boolean iniciam automaticamente como false

O método alternarCambio() inverte o estado atual

O método é protected para ser acessado apenas por subclasses

## 📄 Interface CoisasDeCarro

<b>Explicação:</b>

Define um contrato

Obriga a classe concreta a implementar o método Cambio()

O método não altera estado, apenas utiliza o estado atual

## 🚗 Classe Concreta Jetta


<b>Explicação detalhada:</b>

Jetta herda Carro → Herança

Implementa CoisasDeCarro → Interface

Cambio():

Apenas lê o estado

Não altera automatico

CambioE():

Orquestra o fluxo

Primeiro altera o estado (alternarCambio())

Depois exibe o estado (Cambio())

## 🧪 Classe Main

O que está sendo demonstrado:

Um único objeto

Múltiplas referências:

Carro → abstração

CoisasDeCarro → interface

Jetta → classe concreta

O estado (automatico) é compartilhado entre todas as referências

## 🔁 Fluxo de Estado do automatico
Ação	Valor de automatico	Saída <br/>
Objeto criado	false	— <br/>
Cambio()	false	manual <br/>
CambioE()	true	automático <br/>
CambioE() novamente	false	manual <br/>
### Regra importante: <br/>

O estado só muda quando alternarCambio() é chamado.

### ⚠️ Pontos Importantes de Aprendizado

Métodos não possuem valor

Apenas atributos armazenam estado

Métodos abstratos não são executados

Interface não possui implementação

O operador ! inverte o valor lógico

Estado não muda sozinho

Ordem de execução importa

## 🎯 Conclusão

Este projeto demonstra de forma clara e didática:

Como o estado de um objeto funciona em Java

A diferença entre alterar estado e apenas ler estado

Como abstração e interface podem trabalhar juntas

Como evitar confusão e redundância em projetos orientados a objetos

Em projetos reais, normalmente haveria apenas uma forma de alterar o estado.
Neste projeto, múltiplas abordagens são mantidas intencionalmente para fins de estudo.
# Sistema de Funcionários - Java POO

## 📚 Sobre o projeto

Este projeto foi criado com o objetivo de praticar os principais conceitos de Programação Orientada a Objetos em Java.

A aplicação simula um pequeno sistema de gerenciamento de funcionários, contendo:
- Funcionários
- Departamentos
- Folha de pagamento
- Tipos de cargos
- Autenticação
- Cálculo de bônus

O foco principal NÃO é interface gráfica ou banco de dados, mas sim:
- arquitetura
- modelagem
- herança
- polimorfismo
- encapsulamento
- interfaces
- enums
- casting
- wrappers
- organização de projeto Java

---

# 🚀 Conceitos praticados

## ✅ POO
- Classes e Objetos
- Encapsulamento
- Herança
- Polimorfismo
- Abstração
- Sobrescrita de métodos (`@Override`)
- Composição

---

## ✅ Java
- Classes abstratas
- Interfaces
- Enums
- Wrappers (`Integer`, `Double`, `Boolean`)
- `ArrayList`
- Métodos `static`
- `final`
- Casting
- `instanceof`
- Organização em packages

---

# 📁 Estrutura do projeto

```text
src/
 ├── application/
 │     Main.java
 │
 ├── domain/
 │     Funcionario.java
 │     Dev.java
 │     Gerente.java
 │     Estagiario.java
 │     Departamento.java
 │
 ├── interfaces/
 │     Autenticavel.java
 │     Bonusavel.java
 │
 ├── enums/
 │     Cargo.java
 │
 ├── service/
 │     FolhaPagamento.java
 │
 └── util/
       BonusUtil.java
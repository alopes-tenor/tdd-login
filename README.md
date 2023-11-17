# Projeto Java de Autenticação de usuário utilizando TDD.
Este repositório contém umm projeto Java que demonstra o funcionamento de autenticação de usuário utilizando a abordagem Test-Driven Development.

O projeto contém uma classe simples de login onde serão verificados usuário(user) e senha, a partir de dados cadastrados previamente.

## Test-Drivem Development (TDD)

A abordagem Test-Driven Development (TDD) é uma metodologia de desenvolvimento de software que inverte a ordem tradicional de desenvolvimento. Em vez de escrever o código funcional primeiro e depois os testes, 
TDD exige que os desenvolvedores comecem escrevendo testes unitários falhos para novas funcionalidades antes mesmo de escrever o código que implementará essas funcionalidades. 
Em seguida, o código é desenvolvido com o objetivo de passar nos testes. TDD é uma prática que encoraja a escrita de código mais limpo e testável, facilita a refatoração e documenta o comportamento do sistema através de seus testes.

## Tecnologias utilizadas

- JDK 8.
- Netbeans IDE 13.
- JavaDoc para documentação dos arquivos.
- JUnit para ambientação de testes.

## Classe TelaLogin
- Armazena as credenciais user e senha nas variáveis String "UserArmazenado" e "senhaArmazenada", com valores pré-cadastrados para que seja feita a validação.
- ![image](https://github.com/alopes-tenor/tdd-login/assets/83618366/e8255a72-19db-4505-b7d9-d751a2fc7e88)


- Métodos para realizar a verificação dos valores das credenciais.
-![image](https://github.com/alopes-tenor/tdd-login/assets/83618366/820daa9e-7861-4647-ba0c-d91a9ae5e7eb)

## Classe LoginTest
- Utiizando o JUnit, essa classe possui os ambientes de testes para validação.
- ![image](https://github.com/alopes-tenor/tdd-login/assets/83618366/b7a58f68-533e-43ff-827a-274aa6902e06)
- TesteLogin -> Ambiente controlado, realizando a autenticação com as credenciais corretas.

-![image](https://github.com/alopes-tenor/tdd-login/assets/83618366/7c0d98be-fa60-480b-9ed7-100f2d04d23b)
- TesteLoginErro -> Ambiente programado para não realizar a autenticação de forma correta, caso as credenciais estejam erradas.



#Author: silas.gomes@e2etreinamentos.com.br


@regressivos
Feature: Realizar login no site saucedemo
  Como usuario do site saucedemos
  Quero infomrar os dados de acesso
  Para acessar a conta

  Background: Acessando login
    * que esteja na tela login

  @positivo
  Scenario: Login sucesso
    * enviar os dados de login validos
    * valido login realizado com sucesso

  @negativo @senhabranco
  Scenario: Login usuario em branco
    * enviar os dados de login com usuario em branco
    * valido mensagem de erro usuario em branco

  @negativo @userbranco
  Scenario: Login senha em branco
    * enviar os dados de login com senha em branco
    * valido mensagem de erro senha em branco

  @negativo @block
  Scenario: Login usuario bloqueado
    * enviar os dados de login usuario bloqueado
    * valido mensagem de erro login bloqueado

  @negativo @branco
  Scenario: Login dados em branco
    * enviar os dados de login com dados em branco
    * valido mensagem de erro usuario em branco

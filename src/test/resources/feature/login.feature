#Author: silasleandrogomes@gmail.com

@regressivos @login
Feature: Realizar login no site saucedemo
  Como usuario do site saucedemos
  Quero infomrar os dados de acesso
  Para acessar a conta

  Background: Acessando login
    * que esteja na tela login

  Scenario: Login sucesso
    * enviar os dados de login validos
    * valido login realizado com sucesso

  Scenario: Login usuario em branco
    * enviar os dados de login com usuario em branco
    * valido mensagem de erro usuario em branco

  Scenario: Login senha em branco
    * enviar os dados de login com senha em branco
    * valido mensagem de erro senha em branco

  Scenario: Login usuario bloqueado
    * enviar os dados de login usuario bloqueado
    * valido mensagem de erro login bloqueado

  Scenario: Login dados em branco
    * enviar os dados de login com dados em branco
    * valido mensagem de erro usuario em branco

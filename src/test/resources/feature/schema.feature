#Author: silas.gomes@e2etreinamentos.com

@regressivos @schema
Feature: Realizar login no site saucedemo
  Como usuario do site saucedemos
  Quero infomrar os dados de acesso
  Para acessar a conta

  Background: Acessando login
    * que esteja na tela login

  Scenario Outline: Title of your scenario outline
    * informar o <usuario>
    * informar a <senha>
    * valido a <mensagem>

    Examples: 
      | usuario           | senha          | mensagem                                              |
      | "standard_user"   | "secret_sauce" | "https://www.saucedemo.com/inventory.html"            |
      | ""                | "secret_sauce" | "Epic sadface: Username is required"                  |
      | "standard_user"   | ""             | "Epic sadface: Password is required"                  |
      | "locked_out_user" | "secret_sauce" | "Epic sadface: Sorry, this user has been locked out." |
      | ""                | ""             | "Epic sadface: Username is required"                  |

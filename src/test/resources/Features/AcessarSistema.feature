#language: pt
#enconding: UTF-8
Funcionalidade: Login

    Cenario: Usuario Invalido
    Quando eu informar o usuario "ad"
    E informar a senha "ps"
    E clicar no botao Login
    Entao o sistema exibe a mensagem de credenciais invalidas

    Cenario: Realizar Login
    Quando eu informar o usuario "Admin"
    E informar a senha "admin123"
    E clicar no botao Login
    Entao o sistema exibe o usuario logado
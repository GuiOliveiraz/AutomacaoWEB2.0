#language: pt
Funcionalidade: Login

  Contexto:
    Dado que a modal esteja sendo exibida

  @FecharModal
  Cenario: Fechar a modal ao clicar fora da mesma
    Quando for realizado um clique fira da modal
    Entao a janela modal deve ser fechada

  @FecharModalIcone
  Cenario: Fechar a modal ao clicar no icone fechar
    Quando for realizado um clique no ícone de fechar
    Entao a janela modal deve ser fechada

    @createNewAccount
  Cenario: Link create new account
    Quando for realizado um clique no link create new account
    Entao a pagina new account deve ser exibida


  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login forem preenchidos da seguinte forma
      | login    | <login>    |
      | password | <password> |
      | remember | <remember> |
    Quando for realizado um clique no botão sign in
    Entao deve ser possível logar no sistema

    Exemplos:
      | identificacao       | login   | password | remember |
      | todos os campos     | chronos | senha    | true     |
      | campos obrigatorios | chronos | senha    | false    |


  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login forem preenchidos da seguinte forma
      | login    | <login>    |
      | password | <password> |
      | remember | <remember> |
    Quando for realizado um clique no botão sign in
    Entao o sistema deve exibir uma mensagem de erro

    Exemplos:
      | identificacao    | login    | password | remember |
      | usuario invalido | invalido | senha    | true     |
      | senha invalida   | chronos  | invalido | true     |

    @dadosEmBranco
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login forem preenchidos da seguinte forma
      | login    | <login>    |
      | password | <password> |
      | remember | <remember> |
    Entao o botão sign in deve permanecer desabilitado

    Exemplos:
      | identificacao     | login   | password | remember |
      | usuário em branco |         | senha    | false    |
      | senha em branco   | chronos |          | false    |
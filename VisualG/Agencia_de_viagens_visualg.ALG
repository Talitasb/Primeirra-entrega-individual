Algoritmo "Agencia de Viagens"
//
//
// Descrição   : Agencia de viagens que informa nome e destino do cliente.
// Autor(a)    : Talita Sousa Bezerra
// Data atual  : 27/10/2021
Var
   cliente: vetor[1..3] de caractere
   destino: vetor[1..3] de caractere
   email: vetor[1..3] de caractere
   dataida: vetor[1..3] de caractere
   datavolta: vetor[1..3] de caractere
   opcao: inteiro
 i: inteiro
Inicio
repita
             escreval("================================")
      escreval("|      Agencia de Viagens      |")
      escreval("================================")
      escreval("|             MENU             |")
      escreval("--------------------------------")
      escreval	("| 1 | Cadastrar|")
      escreval("| 2 | Consultar|")
       escreval("| 0 | Encerrar")
        escreval("================================")
        escreval("")
                    escreval("Escolha uma opção")
      leia(opcao)
      
         se (opcao = 1) entao
      para i <- 1 ate 3 faca
         escreval("Digite seu nome")
         leia(cliente [i])
         escreval("Digite seu destino")
         leia(destino [i])
         escreval("Digite seu email")
         leia(email [i])
         escreval("Digite a data que dejesa ir")
         leia(dataida [i])
         escreval("Digite a data que deseja voltar")
         leia(datavolta [i])
         escreval("-----------------------------")
        fimpara
         senao
         se(opcao = 2)entao
        para i de 1 ate 3 faca
            escreval ("Cliente: ", cliente [i])
            escreval ("Destino: ", destino [i])
            escreval ("E-mail: ", email [i])
            escreval ("Data Ida: ", dataida [i])
            escreval ("Data Volta: ", datavolta [i])
                escreval("-----------------------------")
         fimpara
      senao
         se (opcao = 0) entao
            escreval ("Tenha uma boa viagem!")
         senao
         se (opcao >2) entao
            escreval("Número invalido")
         fimse
      fimse
      fimse
      fimse
       ate (opcao = 0)
       
    Fimalgoritmo

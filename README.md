# **Calculadora orientada a objeto**

-- Trabalho do 1 Bimestre de Java -- 


* A calculadora realiza as 4 operações básicas
	- Adicão
	- Subtração
	- Multiplicação
	- Divisão

* Calcula também o valor da média bimestral considerando os seguintes valores:
	- A prova vale 50% da nota
	- O trabalho vale 50% da nota

* Seu objetivo é realizar uma operação e então finalizar o programa.
 
* O usuário deve inserir 3 valores `int` ou `double` sendo um deles responsável por escolher a operação desejada

* Caso o segundo valor seja 0 e o usuário escolha divisão, o console apresentará a seguinte mensagem "Operação inválida" e finalizará

#  Conceitos de orientação a objetos 

* Herança
	- Temos a `superclasse` "calcula" e a `classe` "main" dentro do `pacote` "Principal" 
	- Temos as `subclasses` "Adicao", "Subtracao", "Multiplicacao", "Divisao" dentro do `pacote`"Operacoes".
	- Temos a `subclasse` "MediaBim" dentro do `pacote` "OperacoesAvancadas"

* Polimorfismo
	- As `subclasses` herdam os dois valores `double` da  `superclasse` em seus `métodos construtores`
	- As `subclasses` herdam o `método` "calcula()" da  `superclasse` mas uma altera este método para atender suas necessidades.

* Encapsulamento
	- A `superclasse` "calcula" teve seus `atributos` e `métodos`declarados como `protected`, para que apenas suas `subclasses` e `classes` do mesmo pacote tenham acesso a eles.
	- Dentro da `classe` "MediaBim" seus atributos foram declarados como `private` para que nenhuma outra classe mexa em seus valores. 
	- Os `métodos` das `classes` contidas no `pacote` "Operacoes" foram declarados como públicos, para que todas as outras classes tenham acesso.

# Diagrama de classes (UML)

![ss4](/pictures/uml.png)

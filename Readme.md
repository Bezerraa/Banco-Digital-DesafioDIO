# **Desafio Banco usando OO em Java**

Desenvolvi este modesto projeto para o desafio de um BootCamp que estou participando.

O desafio em questão serviu mais como um teste de quão familiarizado você estaria com os conceitos de POO na linguagem Java, como *encapsulamento, herança, polimorfismo, interfaces e visibilidade de membros*.

Para complementar o projeto já direcionado pelo instrutor do desafio, pensei em adicionar os atributos 'nome' e 'CPF' na classe *Cliente*, para que a classe *Conta* recebesse essas informações quando lhe fosse dado um objeto do tipo *Cliente*. Nessa mesma classe criei um método de ocultar o CPF , para que nas operações bancárias ficassem apenas visíveis os dois últimos dígitos do número de CPF da conta, consequentemente, do cliente.

Por fim, na classe Banco, criei um método simples em que "validava" as operações ao informar a data e hora de cada operação. Fiz com que esse método fosse chamado em cada método das operações e, para isso, tornei-o *static*.
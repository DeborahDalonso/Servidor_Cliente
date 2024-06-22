## Requisitos do Projeto

Implementar, utilizando Java RMI, um servidor de requisições.

As requisições deverão ser enviadas de processos clientes para processos servidores através de invocação remota de métodos. Para isto, uma instância de servidor deverá oferecer uma interface remota com um método com a seguinte assinatura

Resultado requisita(Requisicao r)

A classe Requisicao deve ser serializável e definir um método Resultado executa()  cuja implementação é livre. Como sugestão, este método poderá implementar a impressão de uma mensagem no servidor. Resultado deverá ser implementada como uma interface serializável que encapsulará o resultado da execução da requisição. 

O programa distribuído implementado deverá possibilitar aos usuários de processos cliente iniciar o envio de requisições ao servidor. 

Enviar projeto do NetBeans (arquivos compactados) e um pitch de no máximo 5 min mostrando a execução do cliente e do servidor e também uma explicação breve sobre as classes e interfaces implementadas. 

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Requisitos do Projeto

Implementar, utilizando Java RMI, um servidor de requisições.

As requisições deverão ser enviadas de processos clientes para processos servidores através de invocação remota de métodos. Para isto, uma instância de servidor deverá oferecer uma interface remota com um método com a seguinte assinatura

Resultado requisita(Requisicao r)

A classe Requisicao deve ser serializável e definir um método Resultado executa()  cuja implementação é livre. Como sugestão, este método poderá implementar a impressão de uma mensagem no servidor. Resultado deverá ser implementada como uma interface serializável que encapsulará o resultado da execução da requisição. 

O programa distribuído implementado deverá possibilitar aos usuários de processos cliente iniciar o envio de requisições ao servidor. 

Enviar projeto do NetBeans (arquivos compactados) e um pitch de no máximo 5 min mostrando a execução do cliente e do servidor e também uma explicação breve sobre as classes e interfaces implementadas. 

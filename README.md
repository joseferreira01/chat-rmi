# chat-rmi

## Atividade avaliativa sobre computação distribuída como parte da nota para disciplina programação orientada a serviços.

### Requisitos de instalação:

 Certifique-se de que a máquina que irá rodar o serviço possui Java 8 instalado e Mavem. 

### Execução:

Certifique-se que a porta 1099 do computador está disponível 
Após baixar o repositório entre na pasta do projeto e Execute o comando para construção da aplicação: comando ->
1  mvn clean package

	O projeto está dividido em dois módulos primeiro módulo é o módulo pos-chat-servidor onde os clientes vão se inscrever neste para que possam manter conversações com outros usuários cadastrados essa comunicação é feita através da tecnologia RMI 
Segundo passo após ser construído os módulos do projeto com comando aterior agora Execute o projeto Peas chat servidor: Se tudo estiver funcionando corretamente o console você vai ver a mensagem servidor ativo.
	A partir daí os clientes já podem ser iniciados através do módulo Pos-chat-cliente:
Para isso execute a classe apps dentro do projeto cliente para que se possa manter a  conversação é necessário que seja executado pelo menos dois clientes a cada execução da classe App um consolo será aberto e aparecerá a seguinte mensagem informe nick-name usuário informa o nickname E aí já está disponível para conversação com outros usuários da plataforma.


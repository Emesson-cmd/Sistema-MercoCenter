# Manual de Instalação do Sistema MercoCenter

#### Palavras-chave

- Arquivo Jar
- Instalar Java
- Instalar servidor apache2
- Instalar servidor de banco de dados
- Importar banco de dados

Para fazer a instalação do Sistema MercoCenter você deve seguir os passos a seguir:

## Download e extração da pasta do projeto e geração do executável do sistema

- Acesse o GitHub para fazer o download da pasta do sistema. Link para download:https://github.com/Emesson-cmd/Sistema-MercoCenter/archive/refs/heads/develop.zip
- O arquivo será baixado como ZIP. Faça a extração dele.
- Após extrair o arquivo, abra a pasta do projeto na sua IDE de preferência (fizemos esse tutorial com base da IDE NetBeans 8,2).
- Uma vez que seu projeto está aberto na IDE, clique com o botão direito do mouse no projeto “Mercado(ofc)-Ulisses”, que se encontra na aba “Projetos” e selecione a opção “Limpar e Construir".
- Após essa ação, uma pasta chamada “dist” será criada na raíz da pasta que você extraiu anteriormente. 

Essa pasta “dis” contém 3 arquivos: a pasta lib (contém o conector do Java e do MySQL), o executável “Mercado_ofc_-Ulisses.jar” (será necessário para iniciar a aplicação), e o arquivo de texto README.TXT (contém informações gerada automaticamente).

## Instalação do Java

Para fazer o executável funcionar corretamente é necessário instalar o Java. Acesse https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR e baixe a versão do Java compatível com seu sistema operacional. Após o download, faça a instalação dele. O famoso “next, next, next…”.

## Instalação do MySQL

Para que a aplicação funcione corretamente, é necessário fazer a instalação do MySQL. Nos recomendamos fazer a instalação do XAMPP. Link para acesso: https://www.apachefriends.org/pt_br/index.html.
Após o download e instalação, certifique-se que o XAMPP esteja com os serviços MySQL e o Apache ligados.

## Importação do banco de dados

Agora chegou a hora de importar o banco de dados. Abra o PhpMyAdmin (para isso basta clicar em “admin” do MySQL no Painel Administrativo do XAMPP). Após iniciar o PhpMyAdmin, crie uma base de banco de dados chamada “bancomercado”. Nela, faça a importação do banco de dados “bancomercado(1).sql” que está na pasta bd da pasta que foi extraída inicialmente.

## Conclusão

Após gerar o executável do sistema, instalar o Java. instalar o XAMPP e fazer a importação do banco de dados, sua aplicação estará pronta para a correta execução. 
Caso tenha alguma dúvida, entrar em contato com o e-mail da equipe:
techbooster.oficial@gmail.com

Aproveite :)


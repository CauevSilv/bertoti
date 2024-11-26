# Cauê Vieira da Silva

## Introdução

tenho 22 anos, estou cursando Banco de Dados na FATEC SJC, no 4° Período.
Sou Analista de Suporte e Manutenção de Sistema Jr. na Geopixel.

## Contatos
* [GIT](https://github.com/CauevSilv)
* [LinkedIn](https://www.linkedin.com/in/caue-vieira-da-silva/)

## Meus Principais Conhecimentos
* Oracle Database
* PostgreSQL
* PL/SQL
* PL/pgSQL
* Java
  * Spring Boot
  * JPA & Hibernate
  * Spring Security
  * JWT, Bearer Tokens, Session Cookies
* MVC
* Javascript
* TypeScript
  * OpenLayers
* Object Oriented Programming (OOP)

## Meus Projetos

### Em 2023-1
Projeto focado em desenvolver uma aplicação de avaliação 360 para equipes.

[GIT](https://github.com/CauevSilv/DevMinds)

#### Tecnologias Utilizadas
Python

#### Contribuições Pessoais
Desenvolvi pequenos métodos simples para retornar dados, muito parecido com um relatório.

#### Hard Skills
Utilizei meu pouco conhecimento com a linguagem Python.

#### Soft Skills
Aprendizado em comunicação em equipe, apresentações, scrum, etc.

### Em 2023-2
Elaboração de uma aplicação desktop para gerenciar Trabalhos de Gradução. Posteriormente a aplicação foi nomeada como SGTG.

[GIT](https://github.com/CauevSilv/API-2-Semestre-DevMinds)

#### Tecnologias Utilizadas
Utilizado primariamente a linguagem Java, com o framework desktop sendo o JavaFX.

#### Contribuições Pessoais
Fui o responsável por implementar o método de carga de CSV, todas as telas de relatórios, todas as telas de modificação de TG's persistidos.

#### Hard Skills
Java - Sei fazer com autonomia;
JavaFx - Pouco conhecimento;

#### Soft Skills
Aprendi a lidar com conflitos dentro da equipe.

### Em 2024-1
  O problema foi apresentado pela parceira Dom Rock, uma empresa de dados e tecnologia de São José dos Campos que oferece serviços de tratamento de dados. A parceira recebe diversas entradas de dados como arquivos .xlsx ou .csv até mais complexos como gravações de voz e fotos e trata as informações através de uma pipeline que transforma os dados em consumíveis para a empresa cliente tomar decisões com base em dados.
  O desafio proposto envolveu o início da pipeline de dados da empresa parceira, sendo dividido em três etapas. A primeira (denominada Landing Zone) envolve a entrada de um arquivo. No caso do desafio proposto, um arquivo .csv. a segunda (denominada Bronze) tratava-se da definição do identificador único das informações do arquivo (ID), a escolha de colunas que geram um hash e a exclusão de informações sem relevância. Por fim, a terceira etapa (denominada Silver) é onde foram aplicadas as regras de negócio, além da possibilidade de criar relacionamentos de 'De/Para' para a conversão de informação para dados mais consumívels.
  A equipe Wiz propôs e entregou a solução 'Pipeline Configurator', uma aplicação web desenvolvida com front-end Vue.js, servidor Java Spring Boot e banco de dados MySQL.

[GIT](https://github.com/wiz-fatec/dom-rock-pipeline-configurator)

#### Tecnologias Utilizadas
- HTML: linguagem de programação para criação de páginas Web;
- CSS: linguagem para aplicação de estilos em códigos HTML;
- TypeScript: linguagem variante de JavaScript que adiciona tipagem ao código;
- Vue.js: framework JavaScript para o desenvolvimento de SPA (Single Page Application) e facilitador na criação de códigos reutilzáveis;
- Java: linguagem de programação orientada a objetos;
- Spring Boot: framework Java para desenvolvimento de Rest APIs;
- MySQL: simples SGDB da Oracle para armazenamento de dados da aplicação;
- IntelliJ IDEA: IDE para desenvolvimento Java;
- Webstorm: IDE da JetBrains para desenvolvimento em Javascript e de linguagens .Node. No escopo do projeto utilizado para desenvolvimento de Vue.js;
- Figma: ferramenta utilizada para desenvolvimento de Mockups e Wireframes;
- Discord: ferramenta para comunicação interna do grupo;
- Slack: ferramenta para comunicação com o cliente

#### Contribuições Pessoais
- Atuei como FullStack, com mais foco na parte de Front End.
<details>
<summary>Alteração da entidade Permissão</summary>

- Alteração dos atributos/ligações da entidade e do seu respectivo DTO.
- Adição da entidade PermissionType, que gerencia a ligação de Usuário/Permissão

---

- Criação do ENUM dos valores de PermissionType.
- Alterado o Controller da entidade User para adequar-se corretamente ao ajuste das permissões.
- Alterado a entidade User para ter a ligação correta com a entidade Permissao.

</details>

<details>
<summary>Alteração do DTO e do Controller da entidade SilverConfig</summary>

- Adicionado ModelMapper para facilitar nas transformações de Entidades em Dtos e vice versa.
- Alterado o atributo ID do DTO SilverConfig para corresponder a entidade.
- Adiconado endpoint addSilverFromTo no controller da entidade Silver para persistir uma nova SilverConfig.
- Alteado o controller da Silver para adiconar o @Autowired para atrelar corretamente os Beans do Spring. 
</details>

<details>
<summary>Criação da tela de atribuição de permissões.</summary>

- Adicionado o componente CadastroInputSection.vue para permitir a adição de até 3 permissões por usuário.
- Adicionado ao componente CadastroInputSection as lógicas e a chamada ao enpoint 'user/create-user' para cadastrar um usuário.
- Modificado o objeto JSON criado para enviar como Body na requisição, para atender a necessidade de adicionar várias permissões.
---
- Adicionado ao UserDTO os atributos booleanos correspondentes a cada PermissionType;
- Criado UserPermissionService para lidar com o JSON enviado do front-end com as alterações de permissões por User.
</details>

<details>
<summary>Modificação do CompanyController</summary>

- Adição do endpoint getAllCompanies, responsável por enviar ao front um array com todas as Empresas.
- Retirado da entidade User a ligação entre User/Empresa.
- Adicionado ao Service o método getAllCompanies para chamar do repositório e enviar ao controller.

</details>

<details>
<summary>Adicionada funcionalidade para editar os usuários</summary>

- Modificado a já existente tela de visualização de usuários para permitir a edição dos objetos das tabelas.
- Criado métodos para ler e modificar cada um dos campos da tabela, permitindo uma rápida edição de cada usuário individualmente.
- Criado método para persistir as modificações de usuários diretamente extraidos da tabela, reaproveitando os mecanismos da criação de usuário para extrair os mesmos de cada linha.

---

- Criado objeto WrapUpMetadata para o usuário modificado.
- Alterado diversos elementos visuais(DropDowns, SelectLists, CheckBox) para corresponder as modificação em cada Usuário.
- Alterado tamanho e responsividade dos componentes para vários tipos de telas.
 
</details>

<details>
<summary>Correção de diversos Bugs</summary>

- Corrigido um bug que gerava um erro ao editar e salvar o mesmo usuário que tinha sido criado na mesma sessão.
- Adicionado a tabela de usuários uma validação especial para o usuário ADM, impedindo ele de ser visto/editado.
---
-Adicionado ao BackEnd, no UserService, o objeto Optional o Java para tratar corretamente os métodos caso o objeto editado não tenha sido persistido.
-Adicinado ao UserService validação para o usuário ADM, para todas as chamadas de métodos (menos as de acesso).
-Corrigido problema de validação o objeto User que causava lançava uma exeção caso o user fosse igual ao cadastrado.

</details>

#### Hard Skills
Apresente as hard skills que você utilizou/desenvolveu durante o projeto e o nível de proficiência alcançado. Exemplo: CSS - Sei fazer com autonomia
- Java: sei fazer com autonomia;
- Spring Boot: sei fazer com facilidade (Security, JWT, mapeamento de entidades, repositórios, serviços e controllers);
- SQL: sei fazer com autonomia (DDL e DQL);
- JavaScript/TypeScript - sei fazer com autonomia;
- Vue.js - sei fazer com certa autonomia.

#### Soft Skills
- Trabalho em equipe: consegui integrar-me a equipe mesmo após entrar nela na 3° sprint.
- Iniciativa: propus diversas ferramentas e ideias que foram adotadas ao longo do projeto;
- Solução de problemas: ajudei a solucionar alguns problemas identificados na estrutura do MVC da entidade Usuário;

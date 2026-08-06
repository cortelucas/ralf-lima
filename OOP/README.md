# Orientação de objetos

## O que é programação orientada a objetos?

A orientação a objetos (OO) é um paradigma de programação que organiza o código por meio de objetos e classes. Em vez de escrever um código linear e sequencial, a OO foca em modelar o mundo real, representando as entidades e suas interações. Objetos são instâncias de classes, que são modelos ou moldes que definem os atributos (propriedades) e comportamentos (métodos) dessas entidades.

- A POO é um modelo de programação que organiza o código em "objetos".
- Os objetos são "moldados" através das classes.
- Objetos possuem atributos (características) e metódos (funções);

### Por que usam tanto?

- Código reutilizável;
- Organização;
- Fácil manutenção;
- Padronização;
- Estruturas flexíveis (herança, abstração, polimorfismo, etc...);
- Segurança (encapsulamento);

## Classes e Objetos

- **Classe**: Uma classe define o formato de um objeto, especificando os atributos (características) e métodos (ações) que os objetos dessa classe terão. Ela pode ser vista como um "molde" para criar objetos.
- **Objeto**: Um objeto é uma instância de uma classe. Ele contém os dados e comportamentos definidos pela classe, mas com valores específicos para cada instância. Em outras palavras, enquanto a classe é o plano, o objeto é a construção real.

## Os quatro pilares da orientação a objetos

A programação orientada a objetos possui quatro pilares importantíssimos, acompanhe abaixo cada um deles:

- **Encapsulamento**: O encapsulamento é um dos pilares da orientação a objetos e trata da proteção dos dados dentro de um objeto. Ele permite que os detalhes internos de um objeto sejam escondidos e acessados apenas de maneiras controladas, geralmente por meio de métodos específicos. Isso ajuda a garantir que o estado do objeto não seja alterado de maneira inesperada ou insegura. O encapsulamento promove maior controle sobre os dados e melhora a manutenção do código, já que os detalhes de implementação ficam isolados.
- **Herança**: A herança é um mecanismo que permite a criação de uma nova classe baseada em uma classe existente. A classe filha herda todos os atributos e métodos da classe pai, podendo reutilizar o código já desenvolvido e, ao mesmo tempo, adicionar novos comportamentos ou modificar os existentes. Esse conceito facilita o reaproveitamento de código e a criação de hierarquias de classes, com especialização e generalização de comportamentos.
- **Abstração**: A abstração é o processo de esconder a complexidade de um sistema e focar apenas nas características essenciais de um objeto. Ao abstrair, você define as funcionalidades e propriedades que são importantes para o contexto, sem se preocupar com os detalhes de implementação. Esse conceito é frequentemente implementado em Java por meio de interfaces e classes abstratas, que permitem que se defina um "contrato" de comportamento sem especificar como ele será realizado.
- **Polimorfismo**: O polimorfismo é o princípio que permite que um objeto se comporte de diferentes formas dependendo do contexto. Ele permite que métodos com o mesmo nome possam ter implementações diferentes em classes distintas, oferecendo flexibilidade ao código. O polimorfismo ajuda a criar sistemas mais flexíveis e reutilizáveis, pois um único método pode ser utilizado para realizar diferentes operações, dependendo do tipo do objeto que o invoca.
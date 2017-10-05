WS Developer Java
==============================================

Projeto conceito para implementar uma aplicação com Web Service com as especificações JAX-RS, JAX-WS e com os Dropwizard, Jersey, Spring WS e outros.

## Objetivos Principais [Conceitos](http://stackoverflow.com/questions/28608015/continuous-integration-vs-continuous-delivery-vs-continuous-deployment):
- Colocar em prática as skills necessárias para certificação conforme o conteúdo programático: [Java EE 6: Develop Web Services with JAX-WS & JAX-RS](http://education.oracle.com/pls/web_prod-plq-dad/view_pdf?c_org_id=378219&c_lang=PTB&c_id=D77754GC10);
- Implementar um Web Service SOAP usando as tecnologias (JAX-WS): Spring WS, Apache Axis2, GlassFish Metro;
- Implementar um Web Service RESTful usando as tecnologias (JAX-RS): Dropwizard, Jersey;
- [Jenkins](https://jenkins.io/) - Integração Contínua; 
- Projetar Sistemas usando Arquiterura Microservices;
- Implantação Contínua (Continuous Deployment);

### Adquirir Proficiências em Habilidades

1. Spring 4.x, Spring Boot, Spring Security, Spring Core, Spring OAuth;
    <p><img src="https://github.com/pssilva/ws-developer-java/blob/master/doc-repo/spring-core-arquitetura.png" alt="Arquitetura do Spring Core 4.x" height="300" width="400"/></p>
2. Experiência em sistemas de containerização (e.g. [Docker](https://hub.docker.com/r/pss1suporte/paas-docker/));
    <p><img src="https://github.com/pssilva/ws-developer-java/blob/master/doc-repo/docker.png" alt="Experiência em sistemas de containerização Docker" height="50" width="195"></p>
3. Experiência em sistemas Linux e shell scripting;
    <p><img src="https://github.com/pssilva/ws-developer-java/blob/master/doc-repo/shell-linux.jpeg" alt="Experiência em sistemas Linux e shell scripting" height="91" width="150"></p>
4. Experiência em sistemas Amazon Web Services - AWS;
    <p><img src="https://github.com/pssilva/ws-developer-java/blob/master/doc-repo/aws.png" alt="Experiência em sistemas Amazon Web Services - AWS" height="50" width="195"></p>
5. Experiência em projetos utilizando micro serviços (Microservices) e computação distribuída;

![Microservices](https://github.com/pssilva/ws-developer-java/blob/master/doc-repo/microservices-domain.png)

### Como usar:
Considerando que temos uma instância do Amazon Machine Image - AMI iniciada: [aqui](https://docs.aws.amazon.com/pt_br/AWSEC2/latest/UserGuide/AccessingInstances.html) AWS EC2. Execute os comandos abaixo:

1. Clonar o projeto: `git clone https://github.com/pssilva/ws-developer-java.git`;
2. Acessar a pasta: `cd ws-developer-java`;
3. Maven: `mvn package`;
4. path WildFly: `echo "export WILDFLY_HOME=/[PATH_TO]/wildfly-10.1.0.Final" >> ~/.bash_profile`;
5. source path: `source ~/.bash_profile`;
6. start WildFly: `nohup $WILDFLY_HOME/bin/./standalone.sh > /dev/null 2>&1 & `;
7. Em outro terminal, deploy: `source ~/.bash_profile && nohup $WILDFLY_HOME/bin/jboss-cli.sh --connect --command="deploy --force target/ws-developer-java.war" > /dev/null 2>&1 & `;
8. acessar o link: `localhost:8080/ws-developer-java/`;


### Referência

\[Sébastien Goasguen: 2016\], O’Reilly Media, Inc., [Docker Cookbook](http://www.allitebooks.com/docker-cookbook/): SOLUTIONS AND EXAMPLES FOR BUILDING DISTRIBUTED APPLICATIONS.<br />
\[SEBRAE - Controles Financeiros: 2013\], © 2008. Serviço de Apoio às Micro e Pequenas Empresas de Minas
Gerais – SEBRAE, [SEBRAE - Como Elaborar Controles Financeiros](http://www.sebraemg.com.br/Atendimento/Imagens/Como%20Elaborar%20Controles%20Financeiros.pdf): SOLUTIONS AND EXAMPLES FOR BUILDING DISTRIBUTED APPLICATIONS.<br />
\[Martin Kalin: 2013\], Published by O’Reilly Media, Inc., [Java Web Services](https://www.safaribooksonline.com/library/view/java-web-services/9781449373856/): Up and Running, Second Edition.<br />
\[Alexandros Dallas: 2014\], Published by Packt Publishing Ltd., [RESTful Web Services with Dropwizard](https://www.packtpub.com/web-development/restful-web-services-dropwizard): Over 20 recipes to help you build high-performance, production-ready RESTful JVM-based backend services.<br />
\[Hamidreza Sattari, Shameer Kunjumohamed: 2012\], Published by Packt Publishing Ltd., [Spring Web Services 2 Cookbook](https://www.packtpub.com/web-development/spring-web-services-2-cookbook): Over 60 recipes providing comprehensive coverage of practical real-life implementations of Spring-WS.<br />
\[Deepal Jayasinghe, Afkham Azeez: 2011\], Published by Packt Publishing Ltd., [Apache Axis2 Web Services 2nd Edition](https://www.packtpub.com/web-development/apache-axis2-web-services-2nd-edition): Create secure, reliable, and easy-to-use web services using Apache Axis2.<br />
\[Alan Mark Berg: 2015\],  Packt Publishing, [Jenkins Continuous Integration Cookbook](https://ebooks-it.org/1784390089-ebook.htm), Second Edition<br />
\[Christian Posta: 2016\], O’Reilly Media, Inc., [Microservices for Java Developers](https://developers.redhat.com/promotions/microservices-for-java-developers/): A Hands-on Introduction to Frameworks and Containers <br />
\[Markus Eisele: 2016\], O’Reilly Media, Inc., [Modern Java EE Design Patterns](https://developers.redhat.com/promotions/distributed-javaee-architecture/): Building Scalable Architecture for Sustainable Enterprise Development. <br /> 
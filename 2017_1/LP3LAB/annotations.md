anotações de aula
-----
____
**10/fev:**

- tomcat

Instalação do tomcat: ```brew install tomcat```  
Iniciar: ```/usr/local/Cellar/tomcat/8.5.11/libexec/bin/startup.sh```  
Desligar: ```/usr/local/Cellar/tomcat/8.5.11/libexec/bin/shutdown.sh```  
URL: [http://localhost:8080](http://localhost:8008)   
Arquivo de permissões: ```/usr/local/Cellar/tomcat/8.5.11/libexec/conf/tomcat-users.xml```  
Usuário e senha: ```adminTomcat```

- derby

Instalação: ```brew install derby```  
Iniciar: ```env DERBY_OPTS=-Dsystem.derby.home=/usr/local/var/derby /usr/local/bin/startNetworkServer```   
Path: ```/usr/local/Cellar/derby/10.12.1.1/bin```   
URI: ```jdbc:derby://localhost:1527/meuDB;create=true;user=me;password=pass```
DB client: ```/usr/local/Cellar/derby/10.12.1.1/bin/ij```
|- connect (inside ij): ```connect 'jdbc:derby://localhost:1527/meuDB;create=true;user=me;password=pass';```

- SquirrelSQL

Instalação: [http://squirrel-sql.sourceforge.net/#installation](http://squirrel-sql.sourceforge.net/#installation)




wildfly
1. remover do projeto as bibliotecas do hibernate  
2. standalone -c standalone-full.xml  

==> Caveats
The home of WildFly Application Server 10.1.0.Final is:
  /usr/local/opt/wildfly-as/libexec
You may want to add the following to your .bash_profile:
  export JBOSS_HOME=/usr/local/opt/wildfly-as/libexec
  export PATH=${PATH}:${JBOSS_HOME}/bin

To have launchd start wildfly-as now and restart at login:
  brew services start wildfly-as
Or, if you don't want/need a background service you can just run:
  /usr/local/opt/wildfly-as/libexec/bin/standalone.sh --server-config=standalone.xml


codar:
1. Busca
2. BuscaPorId
3. BuscaPorNome
4. BuscaTodos
5. Login
6. criar componente corporativo
ejb container
7. modulo ejb

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
URL: ```jdbc:derby://localhost:1527/meuDB;create=true;user=me;password=pass```
DB client: ```/usr/local/Cellar/derby/10.12.1.1/bin/ij```
|- connect (inside ij): ```connect 'jdbc:derby://localhost:1527/meuDB;create=true;user=me;password=pass';```

- SquirrelSQL

Instalação: [http://squirrel-sql.sourceforge.net/#installation](http://squirrel-sql.sourceforge.net/#installation)
Prueba técnica de Provedatos para desarrollador 
Postulante CARLOS ALBERTO DELGADO SANCHEZ
Indicaciones:
En este Repositorio encontrara dos carpetas 
- provedatos_empleados_test
- provedatos_test_front
Y Un archivo SQL llamado
- ProvedatosDBTest.sql

La carpeta “provedatos_empleados_test” contiene un proyecto back-end de microservicio “Empleado” y utiliza:  Java 17, Spring, maven y se conecta con una base de datos MySQL 8.
La carpeta “provedatos_test_front” contiene un proyecto front-end en angular 17 que consume los servicios del back-end de “provedatos_empleados_test”.
El archivo “ProvedatosDBTest.sql” contine las instrucciones sql para crear la base de datos “provedatos_test”, crea las tablas y relaciones de “Provincia” y “Empleado” y carga datos de prueba de provincias y empleado. Esta pensando para ejecutarse con un motor de base de datos MySQL InnoDB en su versión 8.

Instrucciones:
1. Ejecute en MySQL el script de ProvedatosDBTest.sql
2. Diríjase al archivo de configuración application.properties ubicado en la dentro de la carpeta provedatos_empleados_test/src/main/resources/application.properties y configure los datos de usuario y contraseña de la base de datos como se ve a continuación:
spring.datasource.username=provedatos_mysql_user
spring.datasource.password= provedatos_mysql_password
3. En una ventana de comandos con el directorio ubicado dentro de la carpeta provedatos_empleados_test ejecute el comando: mvn spring-boot:run
4. En una nueva ventana de comandos con el directorio ubicado dentro de la carpeta provedatos_test_front ejecute el comando: ng serve -o
5. Encontrara la aplicación en su navegador con la url http://localhost:4200/
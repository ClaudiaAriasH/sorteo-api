# PruebaTecnica
Prueba tecnica proceso de selección Comfenalco 

# Sorteo Premios
Api para gestionar los sorteos.


# ¿Qué puedo hacer?
-	Crear, modificar y eliminar personas en la base de datos mediante servicio rest.
-	Obtener los ganadores del sorteo de la base de datos según la especificaciones mediante servicio rest.

# Tecnologias usadas:
-	Hibernate: Permiteta el mapeo de atributos de la base de datos relacional tradicional y el modelo de objetos de una aplicación.
-	Spring Boot: Inyección de dependecias y exposición de servicios, es una aplicación autocontenida que permite el despliegue de las aplicaciones usando su propio servidor.
-	Spring Data: Se encarga de simplificar al desarrollador la persistencia de datos contra distintos repositorios de información .
-	JPA: Define explícitamente la correlación relacional de objetos,
-	MySQL: Se utilizo MySQL 8.0 para crear las tablas Personas, Premios, y PremioxPersona.
-	Maven: Permite la gestión y construcción de proyectos Java (mediante dependencias)
-	CORS
-	Java 8

# Requisitos:
-	Importar las dependencias ejecutando el mvn clean y mvn install.
-	Crear las base de datos premiodb y las tablas Personas, Premios, y PremioxPersona con el script adjuntado en la ruta sorteo-api/scripts
-	En el archivo de propiedades en la ruta sorteo-api/src/main/resources/application.properties. Se debe configurar:

-	Se configura el driver según la versión de mySQL. 
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
-	Se configura la url de la base de datos, el usuario y la contraseña.
spring.datasource.url=jdbc:mysql://localhost:3306/premiodb?useSSL=false, 
spring.datasource.username=root, 
spring.datasource.password=12345678


# Url servicios

Personas:
- GET: http://localhost:8080/api/personas
- GET ByID: http://localhost:8080/api/personas/{id}
- POST: http://localhost:8080/api/personas
- PUT: http://localhost:8080/api/personas
- DELETE ByID: http://localhost:8080/api/personas/{id}

 Ganadores:
- GET: http://localhost:8080/api/sorteo


# Autor: Claudia Arias Hernandez


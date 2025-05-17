# Reservas Fincas API

## Descripción

Reservas Fincas API es una API RESTful desarrollada en Java utilizando Spring Boot y Maven. Este proyecto permite gestionar reservas de fincas, facilitando a los usuarios realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre las reservas y consultar la disponibilidad de las fincas.

## Características

- Gestión de reservas de fincas.
- Consulta de disponibilidad.
- Soporte para múltiples usuarios.
- Integración con bases de datos a través de Spring Data JPA.

## Tecnologías

- **Java 11**
- **Spring Boot**
- **Maven** (para la gestión de dependencias y construcción del proyecto)

## Instalación y ejecución

### 1. Clonar el repositorio

```bash
git clone https://github.com/ache-dev/api-finca-java.git
cd reservas-fincas-api
```

### 2. Configurar el archivo `application.properties`

Ubicado en `src/main/resources/application.properties`. Configura tu conexión a la base de datos:

```properties
# Configuración de conexión a la base de datos
spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=ReservasFincas
spring.datasource.username=TU_USUARIO_SQL
spring.datasource.password=TU_CONTRASENA_SQL

# Configuración JPA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

# Puerto del servidor
server.port=8080
```

### 3. Compilar el proyecto

Si usas el wrapper de Maven incluido en el proyecto:

```bash
./mvnw clean install
```

O si tienes Maven instalado globalmente:

```bash
mvn clean install
```

### 4. Ejecutar la aplicación

Desde tu IDE, ejecuta la clase principal: `ReservasFincasApplication.java`, o desde la terminal:

Con Maven:

```bash
mvn spring-boot:run
```

### 5. Verificar que la API esté activa

Abre tu navegador o Postman y accede a:

```
http://localhost:8080
```

## Uso

Una vez que la API esté en funcionamiento, puedes utilizar herramientas como Postman o cURL para interactuar con los endpoints disponibles. Asegúrate de consultar la documentación de la API para conocer los detalles sobre los endpoints y sus parámetros.

## Contribuciones

Las contribuciones son bienvenidas. Si deseas contribuir a este proyecto, por favor sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-caracteristica`).
3. Realiza tus cambios y haz commit (`git commit -m 'Añadir nueva característica'`).
4. Haz push a la rama (`git push origin feature/nueva-caracteristica`).
5. Abre un Pull Request.


---

Desarrollado con ❤️ usando Spring Boot y Maven.

# ForoHub

Bienvenido al **Challenge Foro Hub**, este proyecto Java te permite crear un foro en el que todos los participantes pueden plantear sus preguntas sobre determinados tópicos a la vez de que otros pueden responderlos. 
Esta propuesta al desafío, replica el proceseo que se lleva a cabo a nivel de back end, por lo que se crea una API REST usando Spring.

## Contenidos

- [Descripción del Proyecto](#descripción-del-proyecto)
- [Requisitos](#requisitos)
- [Instalación](#instalación)

## Descripción del Proyecto

**ForoHub** es una API REST que permite a los usuarios:

- Crear un nuevo tópico.
- Mostrar todos los tópicos creados.
- Mostrar un tópico específico.
- Actualizar un tópico.
- Eliminar un tópico.

## Requisitos

Para ejecutar este proyecto, asegúrate de tener instalado lo siguiente:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) 11 o superior.
- [PostgreSQL](https://www.postgresql.org/download/) instalado y configurado localmente o acceso a una instancia remota.
- [Spring Boot](https://spring.io/projects/spring-boot) para el desarrollo del back end.
- Conexión a internet para acceder a la API.

## Instalación

Sigue estos pasos para configurar y ejecutar ForoHub en tu entorno local:

1. **Clonar el Repositorio**:
    ```bash
    git clone https://github.com/TapiaJS/ForoHub.git
    ```
   
2. **Navegar al Directorio del Proyecto**:
    ```bash
    cd ForoHub
    ```

3. **Configurar la Base de Datos**:
    - Configura las credenciales de tu base de datos PostgreSQL en el archivo `application.properties`.

4. **Compilar y Ejecutar la Aplicación**:
    ```bash
    ./mvnw spring-boot:run
    ```


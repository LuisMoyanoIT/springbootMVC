
# Proyecto Spring Boot 3 con Java 17

## Descripción
Este proyecto es una aplicación básica desarrollada con Spring Boot 3 y Java 17. El objetivo es proporcionar una base sólida para iniciar un proyecto utilizando las últimas tecnologías de Spring y Java.

## Características
- **Spring Boot 3:** Utiliza las capacidades de la última versión de Spring Boot para simplificar la configuración y el desarrollo de aplicaciones Java.
- **Java 17:** Aprovecha las nuevas características y mejoras de la versión más reciente de Java.
- **Dependencias gestionadas:** Incluye una configuración básica de dependencias comunes para proyectos de Spring Boot.

## Requisitos previos
Para ejecutar este proyecto, necesitas tener instalado:
- **Java 17** o superior.
- **Maven 3.6.0** o superior.

## Instalación
1. Clona el repositorio a tu máquina local:
    ```bash
    git clone https://github.com/LuisMoyanoIT/springbootMVC
    ```
2. Navega al directorio del proyecto:
    ```bash
    cd tu-repositorio
    ```
3. Compila y empaqueta la aplicación usando Maven:
    ```bash
    mvn clean package
    ```

## Ejecución
Para ejecutar la aplicación, puedes utilizar el siguiente comando de Maven:
```bash
mvn spring-boot:run
```
Alternativamente, puedes ejecutar el archivo JAR generado:
```bash
java -jar target/springboot-web-0.0.1-SNAPSHOT.jar
```

## Estructura del proyecto
El proyecto sigue la estructura estándar de Spring Boot:
```
src
├── main
│   ├── java
│   │   └── com
│   │       └── springboot-we
│   │           └── springboot-we
│   │               ├── ProyectoApplication.java
│   │               └── controller
│   │                   └── EjemploController.java
│   └── resources
│       ├── application.properties
│       └── static
│       └── templates
└── test
    └── java
        └── com
            └── ejemplo
                └── proyecto
                    └── ProyectoApplicationTests.java
```

## Contribución
Si deseas contribuir a este proyecto, por favor sigue los siguientes pasos:
1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios y haz commit de los mismos (`git commit -am 'Añadir nueva funcionalidad'`).
4. Sube tus cambios a tu repositorio (`git push origin feature/nueva-funcionalidad`).
5. Crea un nuevo Pull Request.

## Autor
Luis Moyano - Curso Udemy

## Licencia
Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para obtener más detalles.
```

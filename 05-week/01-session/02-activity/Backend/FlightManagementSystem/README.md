# Flight Management System

Este proyecto es un sistema de gestión de vuelos que permite la administración eficiente de vuelos, pasajeros y reservas. A continuación se describen los componentes principales del proyecto.

## Estructura del Proyecto

- **Dockerfile**: Contiene las instrucciones necesarias para construir la imagen del contenedor para el sistema de gestión de vuelos. Define la base de la imagen, copia los archivos necesarios y establece el comando de inicio.

- **.dockerignore**: Especifica qué archivos y directorios deben ser ignorados al construir la imagen de Docker, ayudando a reducir el tamaño de la imagen y a evitar la inclusión de archivos innecesarios.

- **docker-compose.yml**: Define los servicios, redes y volúmenes necesarios para ejecutar la aplicación en contenedores. Permite orquestar múltiples contenedores y sus configuraciones.

- **.github/workflows/ci-cd.yml**: Contiene la configuración para el flujo de trabajo de integración continua y entrega continua (CI/CD). Define los pasos que se deben seguir para construir, probar y desplegar la aplicación automáticamente.

- **manual/Manual-DevOps.md**: Borrador en formato Markdown que contiene el manual de DevOps para el sistema de gestión de vuelos. Incluye instrucciones sobre la configuración, despliegue y mantenimiento del sistema.

- **manual/screenshots/**: Directorio destinado a almacenar capturas de pantalla que pueden ser utilizadas en el manual o en la documentación del proyecto.

## Documentación Adicional

- [Manual de DevOps](manual/Manual-DevOps.md)
- [Video relacionado](#)  <!-- Reemplace # con el enlace al video -->

## Cómo Contribuir

Si deseas contribuir a este proyecto, por favor abre un issue o envía un pull request. Agradecemos cualquier ayuda para mejorar el sistema de gestión de vuelos.
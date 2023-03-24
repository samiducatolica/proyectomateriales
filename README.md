# proyectomateriales

## Version de las aplicaciones
JAVA SDK  version 17

ID para desarrollo Netbeans version 16

ID pstgresql version 14 Docker
 
## Instalacion de docker
1. Descargar la aplicacion Docker Descktop para windos de la url https://www.docker.com/

2. Instalar en el equipo la aplicación. 

3. ingresar a la pagina de contenedores de docker https://hub.docker.com/_/postgres

4. copiar el comando docker pull postgres

5. en powershell pegar el comando  y esperar la descarga de la imagen.

6. para desplegar el contenedor de docker ejecutar el comando cambiando la contraseña  
docker run -d --name postgres -e POSTGRES_PASSWORD=mysecretpassword -e PGDATA=/var/lib/postgresql/data/pgdata postgres

7. conectarse ala consola de administrador del contenedor con el comando docker exec -it postgres /bin/bash 

8. cambiar al usuario postgresql(unico con permisos de administracion) con el comando 'su postgres'

9. crear el usuario con el comando 'createuser -P -s ucatolica' nos pedira la contrasena y su validacion * no mostrara ningun caracter al digitarla.

10. desde la aplicacion Docker Desktop se puede obtener la ip con la cual poder conectarse ejemplo 172.17.0.2


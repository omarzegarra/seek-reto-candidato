# seek-reto-candidato
Mantenimiento de tabla "candidatos" en MySql, implementación de JWT.

Buenas noches, culmine el desarrollo de un API-REST usando Spring Framework con MySql y el Manejador FLYWAY.
Aqui en este repositorio presento:
1) Diseño del los microservicios bajo Arquitectura Hexagonal.
2) Implementacion de CRUD para la tabla "candidates", adjunto scripts.
3) Implementacion de Spring Security con JWT, se usa el servicio numero 1 con extencion "/token" para obtener el token y con ello acceder a los demas recursos de aplicativo. Ese token tiene que pasarse en el header como por ejemplo "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJvbWFyemIiLCJpYXQiOjE3Mjc1MDQwMjksImV4cCI6MTcyNzU0MDAyOX0.lfNUW5Wxb5rWHV0BpDN8LaPhhLs1btH66_RIgMwVW1U".
4) Creacion de los test Unitarios para las clases solicitadas.
5) Adjunto lo Collection en la carpeta test->resources->collection con 6 request armados en PostMan.

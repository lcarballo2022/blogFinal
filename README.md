# blogFinal
Pasos para el uso del blog:


1) Se debe correr el proyecto una vez
2) Se debe completar la tabla roles  con los valores: ROLE_ADMIN  -   ROLE_USER
3) Para obtener el listado de roles se puede usar el método /roles
4) Para crear un usuario /registrar si se envía un rol válido se creará con ese rol sino se creará con el rol de usuario estándar
5) Para loguearse se debe usar /iniciarSesion
6) Una vez logueado se debe tomar el token para realizar las operaciones sobre el blog
7) Para crear una publicación hacer un post a  /api/publicaciones //solo admin
8) Obtener publicación  un get /api/publicaciones/{id}
9) Actualizar publicación un put /api/publicaciones/{id} //solo admin
10) Borrar publicación un delete /api/publicaciones/{id} //solo admin
11) Listar comentarios get /api/publicaciones/{publicacionId}/comentarios
12) Obtener comentario por id get /api/publicaciones/{publicacionId}/comentarios/{id}
13) Guardar comentario post /api/publicaciones/{publicacionId}/comentarios
14) Actualizar comentarios put /api/publicaciones/{publicacionId}/comentarios/{id}
15) Borrar comentario delete  /api/publicaciones/{publicacionId}/comentarios/{id}

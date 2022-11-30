# blogFinal
Pasos para el uso del blog:


Se debe correr el proyecto una vez
Se debe completar la tabla roles  con los valores: ROLE_ADMIN  -   ROLE_USER
Para obtener el listado de roles se puede usar el método /roles
Para crear un usuario /registrar si se envía un rol válido se creará con ese rol sino se creará con el rol de usuario estándar
Para loguearse se debe usar /iniciarSesion
Una vez logueado se debe tomar el token para realizar las operaciones sobre el blog
Para crear una publicación hacer un post a  /api/publicaciones //solo admin
Obtener publicación  un get /api/publicaciones/{id}
Actualizar publicación un put /api/publicaciones/{id} //solo admin
Borrar publicación un delete /api/publicaciones/{id} //solo admin
Listar comentarios get /api/publicaciones/{publicacionId}/comentarios
Obtener comentario por id get /api/publicaciones/{publicacionId}/comentarios/{id}
Guardar comentario post /api/publicaciones/{publicacionId}/comentarios
Actualizar comentarios put /api/publicaciones/{publicacionId}/comentarios/{id}
Borrar comentario delete  /api/publicaciones/{publicacionId}/comentarios/{id}

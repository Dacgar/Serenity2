#language: es

Característica: Busqueda y reproduccion de una cancion en Spotify.
  Yo como usuario quiero buscar y reproducir una cancion en Spotify.

    Antecedentes:
      Dado que el usuario abra en el navegador la pagina de Spotify
      Cuando el usuario ingresa el usuario y contraseña
      Y presiona la tecla enter


    Escenario: Busqueda y seleccion de cancion.
      Cuando el usuario escriba el nombre de la cancion
      Y   seleccione la cancion elegida
      Entonces se reproducira la cancion seleccionada
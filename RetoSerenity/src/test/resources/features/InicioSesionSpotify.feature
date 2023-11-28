#language: es

Característica: inicio sesion en Spotify.
  Yo como usuario quiero realizar el inicio de sesion en Spotify.

  Escenario: Inicio sesión exitoso.
    Dado que el usuario abra en el navegador la pagina de Spotify
    Cuando el usuario ingresa el usuario y contraseña
    Y presiona la tecla enter
    Entonces el usuario podra ver sus listas de reproducción.
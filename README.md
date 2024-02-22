# CVDS_Lab4
## Integrantes
* Juan David Contreras Becerra
* Ana Maria Duran Burgos
* Johan Alejandro Estrada

## Solución
* ¿Qué codigo de error sale?, revise el significado del mismo en la lista de códigos de estado HTTP.
  * El codigo de error que se tiene como respuesta es 301. Este codigo indica que el recurso fue movido a otro lugar, la peticion debe ser relizada a la nueva dirección.
* ¿Qué otros códigos de error existen?, ¿En qué caso se manejarán?
   *  Los codigos de error corresponden a los 400 y 500, los 300 son codigos de redirección.
      *  400: Bad Request
      *  401: Unauthorized
      *  403: Forbidden
      *  404: Not Found
      *  405: Method Not Allowed
      *  408: Request Timeout
      *  409: Conflict
      *  410: Gone
      *  429: Too Many Requests
      *  500: Internal Server Error
      *  501: Not Implemented
      *  502: Bad Gateway
      *  503: Service Unavailable
      *  504: Gateway Timeout
      *  505: HTTP Version Not Supported
   *  En los codigos de redirección tenemos:
      *  300: Multiple Choices
      *  301: Moved Permanently
      *  302: Found
      *  304: Not Modified
      *  307: Temporary Redirect
      *  308: Permanent Redirect


<%-- 
    Document   : saludo
    Created on : 29 nov 2022, 16:07:33
    Author     : Charly Cimino
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola ${param.fname}</h1>
        <h2>Ten�s ${requestScope.edad} a�os</h2>
        <p>2 + 2 es ${2+2}</p>
    </body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="extras/Navbar.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
		integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
		<link rel="stylesheet" href="css/Style.css">
    </head>
    <body id="bodylistado">
       

       <h1>Listado de Usuarios</h1>
         <div class="container">
		 <table class="table">
                <thead>
                    <tr>
                        
                        <th>RUN Usuario</th>
                        <th>Nombres</th>
                        <th>Apellidos</th>
                        <th>Fecha de Nacimiento</th>                       
                    </tr>
                </thead>

                <tbody>
                	<!--<c:out value="${miListaUsuario}" /> con esto se valida si trae datos -->
                    <c:forEach var="usuario" items="${miListaUsuario}">
                       
                        
                        <tr>
                            <th>${usuario.runUsuario}</th>
                            <td>${usuario.nombreUsuario}</td>
                            <td>${usuario.apellidoUsuario}</td>
                            <td>${usuario.fechaNacimientoUsuario}</td>
                                                         
                        </tr>
                
                    </c:forEach>
                </tbody>
            </table>
       	  </div>


     <script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js" 	integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD"
	crossorigin="anonymous"></script>
       
    </body>
	<footer><%@include file="extras/footer.jsp"%></footer>	

    
</html>
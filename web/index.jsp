


<%@page import="modelo.entidad.Evento"%>
<%@page import="modelo.dao.EventoDao"%>
<%@page import="modelo.dao.impl.EventoDaoImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eventos</title>
    </head>
    <body>
         <h1>Lista de Eventos</h1>
        
        <table>
            <%
                int count = 0;
                EventoDao dao = new EventoDaoImpl();
                for(Evento evento: dao.listarEvento()){
                 count++;
            %>
            <tr>
                <td><%=count%></td>
                <td><%=evento.getNombreevento()%></td>
                <td>[<a href="">Asistencia</a>]</td>
                <td>[<a href="">Inscripcion</a>]</td>
            </tr>
            <%}%>
        </table>
    </body>
</html>

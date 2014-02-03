<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@include file="/WEB-INF/jsp/includes.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Mantenimiento Cursos</title>
    </head>
    <body>
        <h1>Datos del Curso</h1>
        <form:form action="curso.do" commandName="curso" method="POST" >
            <table>
                <tr>
                    <td>Código</td>
                    <td> <form:input path="pg_codCurso" /> </td>
                </tr>
                <tr>
                    <td>Clave</td>
                    <td> <form:input path="pg_claveCurso" /> </td>
                </tr>
                <tr>
                    <td>Nombre</td>
                    <td> <form:input path="pg_nombreCurso" /> </td>
                </tr>
                <tr>
                    <td>N° Créditos</td>
                    <td> <form:input path="pg_creditos" /> </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="action" value="Add" />
                        <input type="submit" name="action" value="Edit" /> 
                        <input type="submit" name="action" value="Delete" /> 
                        <input type="submit" name="action" value="Search" />
                    </td>
                </tr>
            </table>
        </form:form>
        <br>
        <table border="1">
            <th>Código</th>
            <th>Clave</th>
            <th>Nombre</th>
                <c:forEach items="${cursoLista}" var="cur">
                <tr>
                    <td>${cur.pg_codCurso}</td>
                    <td>${cur.pg_claveCurso}</td>
                    <td>${cur.pg_nombreCurso}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>

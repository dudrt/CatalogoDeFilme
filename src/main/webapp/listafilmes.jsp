<%@page import="br.com.fmp.modelo.Filme"%>
<%@page import="br.com.fmp.servlet.FilmeServlet"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Filmes</title>
</head>
<% ArrayList<Filme> list = new ArrayList<Filme>(); 
list = (ArrayList<Filme>)request.getAttribute("listaFiltrada"); %>
<body>
	<h2> Lista de Filmes de <%= list.get(0).getGenero() %> </h2>
	<ol>
		<% 
			
			for(Filme filme: list) {
				%>
			<li>
				<% out.println("Nome: " + filme.getNome()); %> <br>
				<%	out.println("Genero: " + filme.getGenero()); %> <br>
				<%	out.println("Ano: " + filme.getAno()); %> <br>
			</li>
			<img src="<% out.println(filme.getCapa()); %>" width="150px">
			<br><br><br>
		<% 
			}
		%>
	</ol>

<a href="http://localhost:8080/CatalogoDeFilme/listadefilmes.html" style="display: inline-block; padding: 10px 20px; background-color: black; color: white; text-decoration: none; font-size: 16px; border-radius: 5px;">Voltar</a>

</body>
</html>
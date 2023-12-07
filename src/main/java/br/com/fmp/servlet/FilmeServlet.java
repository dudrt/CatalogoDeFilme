package br.com.fmp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.stream.Collectors;  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fmp.modelo.Filme;

@WebServlet("/filme")
public class FilmeServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Filme forrestGump = new Filme("Forrest Gump", "Drama","https://upload.wikimedia.org/wikipedia/pt/c/c0/ForrestGumpPoster.jpg", 1994);
		Filme inception = new Filme("A Origem", "Ficção Científica","https://upload.wikimedia.org/wikipedia/pt/8/84/AOrigemPoster.jpg", 2010);
	    Filme shawshank = new Filme("Um Sonho de Liberdade", "Drama","https://br.web.img2.acsta.net/medias/nmedia/18/90/16/48/20083748.jpg", 1994);
	    Filme pulpfiction = new Filme("Pulp Fiction", "Crime","https://resizing.flixster.com/-XZAfHZM39UwaGJIFWKAE8fS0ak=/v3/t/assets/p15684_p_v13_an.jpg", 1994);
	    Filme darknight = new Filme("Batman: O Cavaleiro das Trevas", "Ação","https://upload.wikimedia.org/wikipedia/pt/d/d1/The_Dark_Knight.jpg", 2008);
	    Filme godfather = new Filme("O Poderoso Chefão", "Crime","https://br.web.img3.acsta.net/medias/nmedia/18/90/93/20/20120876.jpg", 1972);
	    Filme fightclub = new Filme("Clube da Luta", "Drama","https://br.web.img3.acsta.net/medias/nmedia/18/90/95/96/20122166.jpg", 1999);
	    Filme matrixreloaded = new Filme("Matrix Reloaded", "Ação","https://upload.wikimedia.org/wikipedia/pt/0/0e/Matrix_reloaded_.jpg", 2003);
	    Filme matrixrevolutions = new Filme("Matrix Revolutions", "Ação","https://upload.wikimedia.org/wikipedia/pt/9/94/Matrix_revolutions.jpg", 2003);
	    Filme greenmile = new Filme("Milagre na Cela 7", "Crime","https://upload.wikimedia.org/wikipedia/pt/0/0d/7._Ko%C4%9Fu%C5%9Ftaki_Mucize.jpg", 1999);
	    Filme shining = new Filme("O Iluminado", "Terror","https://m.media-amazon.com/images/I/8147kKLLvOL._AC_UF1000,1000_QL80_.jpg", 1980);
	    Filme prestige = new Filme("O Grande Truque", "Drama","https://br.web.img3.acsta.net/medias/nmedia/18/90/74/89/20111374.jpg", 2006);
	    Filme departed = new Filme("Os Infiltrados", "Crime","https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRGzb0BUIHP7nZqxLykalpsZ9S5TP7is0ITME70GplbXH9C2FXv", 2006);
	    Filme silence = new Filme("O Silêncio dos Inocentes", "Crime","https://upload.wikimedia.org/wikipedia/pt/0/0a/Silence_of_the_lambs.png", 1991);
	    Filme seven = new Filme("Seven: Os Sete Crimes Capitais", "Crime","https://br.web.img3.acsta.net/pictures/210/124/21012465_2013061319170245.jpg", 1995);
	    Filme gladiator = new Filme("Gladiador", "Ação","https://upload.wikimedia.org/wikipedia/pt/4/44/GladiadorPoster.jpg", 2000);
	    Filme reileao = new Filme("O Rei Leão", "Animação","https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRUw0LXm19XFQZTi6aLF08rblrkqsDuxArqMLrd25L-e_piOPNi", 1994);
	    Filme diariodapaixao = new Filme("Diário de uma Paixão", "Romance","https://br.web.img3.acsta.net/medias/nmedia/18/91/21/92/20135014.jpg", 2004);

	        ArrayList<Filme> filmes = new ArrayList<>();
	        
	        filmes.add(forrestGump);
	        filmes.add(inception);
	        filmes.add(shawshank);
	        filmes.add(pulpfiction);
	        filmes.add(darknight);
	        filmes.add(godfather);
	        filmes.add(fightclub);
	        filmes.add(matrixreloaded);
	        filmes.add(matrixrevolutions);
	        filmes.add(greenmile);
	        filmes.add(shining);
	        filmes.add(prestige);
	        filmes.add(departed);
	        filmes.add(silence);
	        filmes.add(seven);
	        filmes.add(gladiator);
	        filmes.add(reileao);
	        filmes.add(diariodapaixao);
		
		
		String genero = req.getParameter("genero");
		
		ArrayList<Filme> listaFiltrada = filmes.stream().filter(filme -> filme.getGenero().toUpperCase().equals(genero.toUpperCase())) .collect(Collectors.toCollection(ArrayList::new));
		
		req.setAttribute("listaFiltrada", listaFiltrada);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/listafilmes.jsp");
		dispatcher.forward(req, resp);
	}
}
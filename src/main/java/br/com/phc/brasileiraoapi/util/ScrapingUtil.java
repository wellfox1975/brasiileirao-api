package br.com.phc.brasileiraoapi.util;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.phc.brasileiraoapi.dto.PartidaGoogleDTO;

public class ScrapingUtil {

	private static final Logger LOGGER = LoggerFactory.getLogger(ScrapingUtil.class);
	private static final String BASE_URL_GOOGLE = "https://www.google.com.br/search?q=";
	private static final String COMPLEMENTO_URL_GOOGLE ="&hl=pt-BR";
	
	public static void main(String[] args) {
		
		String url = BASE_URL_GOOGLE + "palmeiras+x+corintias+08/08/2020" + COMPLEMENTO_URL_GOOGLE;
		ScrapingUtil scraping = new ScrapingUtil();		
		scraping.obtemInformacoesPartida(BASE_URL_GOOGLE);
		
	}
	
	public PartidaGoogleDTO obtemInformacoesPartida(String url) {
		PartidaGoogleDTO partida  = new PartidaGoogleDTO();
		
		org.jsoup.nodes.Document document = null;
		
		try 
		{
			document = Jsoup.connect(url).get();
			
			String title = document.title();
			LOGGER.info("Título da página:{} ", title);
		} 
		catch (IOException e)
		{
			LOGGER.error("ERRO O TENTAR CONECTAR COM O GOOGLE: {}" + e.getMessage());
			e.printStackTrace();
		}
		
			
		return partida;
	}

}

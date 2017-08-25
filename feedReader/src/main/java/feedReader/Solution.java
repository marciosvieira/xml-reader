package feedReader;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import feedReader.globo.Rss;
import feedReader.tojson.RssFeed;
import feedReader.util.Constants;
import feedReader.util.Utils;

public class Solution {

	public static void main(String[] args) {
			
			try {
				
				runSolution();
				
			} catch (IOException e) {
				e.printStackTrace();
			} catch (JAXBException e) {
				e.printStackTrace();
			}

	}
	
	public static void runSolution() throws IOException, JAXBException {
		
		// chamada da URL para obter o xml
		URL url = new URL(Constants.URL_FEED);
		URLConnection connection = url.openConnection();
		
		// criacao do contexto JAXB
		JAXBContext jaxbContext = JAXBContext.newInstance(Rss.class);
		
		// criacao do 'parser'
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		
		// objeto 'parsed'
		Rss feed = (Rss) unmarshaller.unmarshal(connection.getInputStream());
		
		// objeto pronto para JSON
		RssFeed rssFeed = new RssFeed(Utils.fillItensList(feed));
		
		// criacao do 'tradutor' JSON
		Gson jsonFeed = new GsonBuilder().setPrettyPrinting().create();
		
		// conversão para JSON
		String jsonText = jsonFeed.toJson(rssFeed);
		
		// escreve o JSON no arquivo 'FeedContents.json'
		FileWriter writer = new FileWriter(Constants.FILENAME);
		writer.write(jsonText);
		writer.close();
		
	}

}
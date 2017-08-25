package feedReader.util;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import feedReader.globo.Item;
import feedReader.globo.Rss;
import feedReader.tojson.Description;
import feedReader.tojson.FeedItem;

public final class Utils {

	/**
	 * @param desc
	 * @param list
	 * 
	 * Popula a lista de itens contida no campo 'description' do feed 
	 */
	public static List<Description> fillDescriptionList(String desc) {
		
		String clean = null;
		
		List<String> links = null;
		
		List<Description> list = new ArrayList<Description>();
		
		// iterando elementos do campo 'description'
		for (Element element : Jsoup.parse(desc).getAllElements()) {
			
			// recuperando elemento do tipo imagem
			if (element.tagName().equalsIgnoreCase(Constants.IMG)) {
				
				list.add(new Description(Constants.IMAGE, element.attr(Constants.SRC)));
				
			}
			
			// recuperando elemento do tipo texto
			if (element.tagName().equalsIgnoreCase(Constants.P)) {
				
				// tratamento para o &nbsp;
				clean = element.text().replaceAll(Constants.NBSP, Constants.EMPTY);
				
				if (!clean.trim().isEmpty()) {
					
					list.add(new Description(Constants.TEXT, element.text()));
					clean = null;
					
				}
				
			}
			
			// recuperando elementos do tipo link
			if (element.tagName().equalsIgnoreCase(Constants.UL)) {
				
				links = new ArrayList<String>();
				
				for (Element linkElement : element.getElementsByTag(Constants.A)) {
					
					links.add(linkElement.attr(Constants.HREF));
					
				}
				
				list.add(new Description(Constants.LINKS, links));
			}
			
		}
		
		return list;
    	
    }
	
	/**
	 * @param feed
	 * @return
	 * 
	 * Popula a lista de itens do 'feed' 
	 */
	public static List<FeedItem> fillItensList(Rss feed) {
		
		List<FeedItem> itensList = new ArrayList<FeedItem>();
		
		for (Item paramItem : feed.getChannel().getItem()) {
			itensList.add(new FeedItem(
					paramItem.getTitle(),
					paramItem.getLink(),
					Utils.fillDescriptionList(paramItem.getDescription())));
		}
		
		return itensList;
		
	}

}

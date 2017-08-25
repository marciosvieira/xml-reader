package feedReader.tojson;

import java.util.ArrayList;
import java.util.List;

public class FeedItem {
	
	protected String title;
	
	protected String link;
	
	protected List<Description> description;

	/**
	 * @param titleParam
	 * @param linkParam
	 * @param descriptionListParam
	 * 
	 * Construtor de item do feed no padrao de saida
	 */
	public FeedItem(String titleParam, String linkParam, List<Description> descriptionListParam) {
		setTitle(titleParam);
		setLink(linkParam);
		getDescription().addAll(descriptionListParam);
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}

	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * @return the description
	 */
	public List<Description> getDescription() {
		if (description == null) {
			description = new ArrayList<Description>();
		}
		
		return this.description;
	}

}

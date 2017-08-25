package feedReader.tojson;

import java.util.ArrayList;
import java.util.List;

public class Description {
	
	protected String type;
	
	protected String content;
	
	protected List<String> contents;

	/**
	 * @param paramType
	 * @param paramContent
	 * 
	 * Construtor para item do tipo Image ou Text
	 */
	public Description(String paramType, String paramContent) {
		setType(paramType);
		setContent(paramContent);
	}

	/**
	 * @param paramType
	 * @param paramLinks
	 * 
	 * Construtor para item do tipo Link
	 */
	public Description(String paramType, List<String> paramLinks) {
		setType(paramType);
		getLinks().addAll(paramLinks);
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the links
	 */
	public List<String> getLinks() {
		if(contents == null) {
			contents = new ArrayList<String>();
		}
		return this.contents;
	}

}

package feedReader.tojson;

public class Description<T> {
	
	protected String type;
	
	protected T content;
	
	/**
	 * @param paramType
	 * @param paramContent
	 * 
	 * Construtor Description (Item)
	 */
	public Description(String paramType, T paramContent) {
		setType(paramType);
		setContent(paramContent);
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
	public T getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(T content) {
		this.content = content;
	}

}

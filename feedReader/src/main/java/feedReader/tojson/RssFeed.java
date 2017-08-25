package feedReader.tojson;

import java.util.ArrayList;
import java.util.List;

public class RssFeed {
	
	public List<FeedItem> feed;

	/**
	 * @param paramFeed
	 * 
	 * Construtor da lista de itens do feed
	 */
	public RssFeed(List<FeedItem> paramFeed) {
		getFeed().addAll(paramFeed);
	}

	/**
	 * @return the feed
	 */
	public List<FeedItem> getFeed() {
		if (feed == null) {
			feed = new ArrayList<FeedItem>();
		}
		return this.feed;
	}
	
}

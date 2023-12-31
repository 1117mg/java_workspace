package news.dto;

public class News {
	private String title;
	private String url;
	
	public News() {}
	public News(String title, String url) {
		super();
		this.title = title;
		this.url = url;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String toString() {
		return "News [title=" + title + ", url=" + url + "]";
	}
}
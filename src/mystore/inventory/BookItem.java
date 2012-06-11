package mystore.inventory;

public class BookItem extends StoreItem{
	private String author;
	private int pages;
	private String genre;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String getDescription() {
		return this.name 
				+ " has "
				+ this.pages
				+ " pages, and is written by "
				+ this.author;
	}
	
	
}

package mystore.inventory;

public class AudioItem extends StoreItem {
	private String composer;
	private String length;
	private String genre;
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
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
				+ " has a runtime of "
				+ this.length
				+ " and is composed by "
				+ this.composer;
	}
	
	
	
}

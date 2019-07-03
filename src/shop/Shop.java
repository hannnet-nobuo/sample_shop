package shop;

public class Shop {
	
	private String name;
	private int rank;
	
	public Shop(String name, int rank) {
		this.name = name;
		this.rank = rank;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
}

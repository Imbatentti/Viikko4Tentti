package bean;

public class Levy {
	private int id;

	private String levynimi;

	private String artisti;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLevynimi() {
		return levynimi;
	}

	public void setLevynimi(String levynimi) {
		this.levynimi = levynimi;
	}

	public String getArtisti() {
		return artisti;
	}

	public void setArtisti(String artisti) {
		this.artisti = artisti;
	}

	@Override
	public String toString() {
		return "LevyImpl [id=" + id + ", levynimi=" + levynimi + ", artisti="
				+ artisti + "]";
	}
	
	

}

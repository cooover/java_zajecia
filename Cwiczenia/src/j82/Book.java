package j82;

public class Book {
	private String nazwa;
	private String autor;
	private String rok;
	
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getRok() {
		return rok;
	}
	public void setRok(String rok) {
		this.rok = rok;
	}
	public Book(String nazwa, String autor, String rok) {
		super();
		this.nazwa = nazwa;
		this.autor = autor;
		this.rok = rok;
	}
	

}

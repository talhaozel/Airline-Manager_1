
public class Personel {
	
	private String id;
	private String isim;
	private String soyad;
	private String gorev;
	
	public Personel() {	
	}
	
	
	public Personel(String id,String isim, String soyad, String gorev) {
		
		this.id = id;
		this.isim = isim;
		this.soyad = soyad;
		this.gorev = gorev;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getGorev() {
		return gorev;
	}
	public void setGorev(String gorev) {
		this.gorev = gorev;
	}
	
	
	
	
	

}

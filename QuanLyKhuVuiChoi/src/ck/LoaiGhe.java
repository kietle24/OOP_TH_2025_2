package ck;

public enum LoaiGhe {
GHE_VIP("Ghe Vip " ) , 
GHE_THUONG("Ghe thuong ") ; 
	private String moTaNe ;

	 LoaiGhe(String moTaNe) {
		this.moTaNe = moTaNe;
	}

	public String getMoTaNe() {
		return moTaNe;
	}

	public void setMoTaNe(String moTaNe) {
		this.moTaNe = moTaNe;
	} 
	



}
